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

import arklivre.bolao.modelo.Tournament;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class TournamentRepository {
    
     public static void save(Tournament tournament) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(tournament);
        t.commit();
    }

    public static void delete(Tournament tournament) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(em.find(Tournament.class, tournament.getId()));
        t.commit();
    }

    public static Tournament getTournament(Integer id) {
        EntityManager em = JPA.getEM();
        return em.find(Tournament.class, id);
    }
    
    public static List<Tournament> getTournaments() {
        EntityManager em = JPA.getEM();
        return em.createQuery("select p from tournament p", Tournament.class).getResultList();
    }
    
    public static List<Tournament> getTournaments(String name) {
        EntityManager em = JPA.getEM();
        TypedQuery<Tournament> query = em.createQuery(
                "select p from tournament p where p.name "
                        + "like :nome", Tournament.class);
        query.setParameter("valor", "%" + name + "%");
        return query.getResultList();
    }
    
}
