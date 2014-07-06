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

import arklivre.bolao.modelo.Match;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class MatchRepository {
    
     public static void save(Match match) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(match);
        t.commit();
    }

    public static void delete(Match match) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(em.find(Match.class, match.getId()));
        t.commit();
    }

    public static Match getUser(Integer id) {
        EntityManager em = JPA.getEM();
        return em.find(Match.class, id);
    }
    
    public static List<Match> getUsers() {
        EntityManager em = JPA.getEM();
        return em.createQuery("select p from match p", Match.class).getResultList();
    }
    
}
