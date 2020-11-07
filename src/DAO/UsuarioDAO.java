/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Fredy AGP
 */
public class UsuarioDAO {
    private static EntityManagerFactory
            emf=Persistence.createEntityManagerFactory("LoginApp_JPAPU");
    
    public void crear (Usuario usuario)
    {
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        try
        {
            em.persist(usuario);
            em.getTransaction().commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally
        {
            em.close();
        }
    }
    
    public boolean eliminar (Usuario usuario)
    {
        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try
        {
            em.remove(usuario);
            em.getTransaction().commit();
            ret=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally
        {
            em.close();
            return ret;
        }
    }
    
    public Usuario leer (Usuario par)
    {
        EntityManager em =emf.createEntityManager();
        Usuario usuario = null;
        Query q = em.createQuery("SELECT u FROM Usuario u "+
                " WHERE u.nombre LIKE :nombre"+
                " AND u.password LIKE :password")
                .setParameter("nombre", par.getNombre())
                .setParameter("password", par.getPassword());
        try
        {
            usuario = (Usuario) q.getSingleResult();
        }
        catch(NonUniqueResultException e)
        {
           usuario=(Usuario)q.getResultList().get(0);
        }
        catch(Exception e)
        {
            e.printStackTrace();   
        }
        finally
        {
            em.close();
            return usuario;
        }
        
    }
    
    public boolean actualizar (Usuario usuario,Usuario nuevousuario)
    {
        EntityManager em =emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try
        {
            usuario=leer(usuario);
            usuario.setNombre(nuevousuario.getNombre());
            usuario.setPassword(nuevousuario.getPassword());
            em.merge(usuario);
            em.getTransaction().commit();
            ret=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally
        {
            em.close();
            return ret;
        }
    }
}
