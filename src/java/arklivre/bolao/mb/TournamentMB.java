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

package arklivre.bolao.mb;

import arklivre.bolao.jpa.MatchRepository;
import arklivre.bolao.jpa.TournamentRepository;
import arklivre.bolao.modelo.*;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TournamentMB {
    
    private Tournament tournament = new Tournament();
    private Games match = new Games();
    private ArrayList<Games> arrayMatch = new ArrayList();
    
    public TournamentMB(){
    }
    
    public void addMatch(){
        arrayMatch.add(match);
        match = new Games();
    }
    
    public void removeMatch(Games m){
        arrayMatch.remove(m);
    }
    
    public void saveTournament(){
        Integer next = TournamentRepository.nextId();
        
        System.out.println("next: " + next + " - Torneio: " + tournament.getName());
        tournament.setId(next);
        TournamentRepository.save(tournament);

        for(Games m : arrayMatch){
            m.setIdTournament(next);
            m.setId(MatchRepository.nextId());
            m.setHomeScore(null);
            m.setVisitorScore(null);
            MatchRepository.save(m);
        }
        
        tournament = new Tournament();
        arrayMatch = new ArrayList();
        match = new Games();
    }
    
    public void removeTournament(Tournament t){
        System.out.println(">>>>>>>>>>>>>>>>>>Torneio"+ t.getName() + t.getId());
        TournamentRepository.delete(t);
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Games getMatch() {
        return match;
    }

    public void setMatch(Games match) {
        this.match = match;
    }

    public ArrayList<Games> getArrayMatch() {
        return arrayMatch;
    }

    public void setArrayMatch(ArrayList<Games> arrayMatch) {
        this.arrayMatch = arrayMatch;
    }
    
}
