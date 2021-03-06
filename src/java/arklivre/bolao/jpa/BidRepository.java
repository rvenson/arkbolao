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

import arklivre.bolao.modelo.Bid;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class BidRepository {
    
     public static void save(Bid bid) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(bid);
        t.commit();
    }

    public static void delete(Bid bid) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(em.find(Bid.class, bid.getId()));
        t.commit();
    }

    public static Bid getUser(Integer id) {
        EntityManager em = JPA.getEM();
        return em.find(Bid.class, id);
    }
    
    public static List<Bid> getUsers() {
        EntityManager em = JPA.getEM();
        return em.createQuery("select p from Bid p", Bid.class).getResultList();
    }
    
}
