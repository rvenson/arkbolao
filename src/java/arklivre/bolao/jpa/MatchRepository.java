/*
 * Copyright (C) 2014 arkLivre
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package arklivre.bolao.jpa;

import arklivre.bolao.modelo.Games;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class MatchRepository {
    
     public static void save(Games match) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(match);
        t.commit();
    }

    public static void delete(Games match) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(em.find(Games.class, match.getId()));
        t.commit();
    }

    public static Games getUser(Integer id) {
        EntityManager em = JPA.getEM();
        return em.find(Games.class, id);
    }
    
    public static List<Games> getUsers() {
        EntityManager em = JPA.getEM();
        return em.createQuery("select p from Match p", Games.class).getResultList();
    }
    
    public static Integer nextId() {
        
        /* Este método precisa ser revisto
        Deve retornar o valor do último usuário inserido + 1
        Está retornando o número de usuários no total + 1
        */
        
        EntityManager em = JPA.getEM();
        /*
        Integer next = em.createQuery("select coalesce(max(id),0) from user",
                Integer.class).getSingleResult();
                */
        
        List<Games> list = em.createQuery("select u from Games u", Games.class).getResultList();
        return list.size()+1;
    }
    
}
