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

import arklivre.bolao.modelo.ScoringBoard;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class ScoringBoardRepository {
    
     public static void save(ScoringBoard scoringBoard) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(scoringBoard);
        t.commit();
    }

    public static void delete(ScoringBoard scoringBoard) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(em.find(ScoringBoard.class, scoringBoard.getId()));
        t.commit();
    }

    public static ScoringBoard getUser(Integer id) {
        EntityManager em = JPA.getEM();
        return em.find(ScoringBoard.class, id);
    }
    
    public static List<ScoringBoard> getUsers() {
        EntityManager em = JPA.getEM();
        return em.createQuery("select p from Scoringboard p", ScoringBoard.class).getResultList();
    }
    
}
