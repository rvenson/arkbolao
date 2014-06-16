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

import arklivre.bolao.modelo.*;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TournamentMB {
    
    private Tournament tournament;
    private Match match;
    private ArrayList<Match> arrayMatch = new ArrayList();
    private User login;

    public TournamentMB(User login) {
        this.login = login;
        
        //Talvez dê pra colocar a validação do usuário aqui
    }
    
    public void addMatch(){
        //Adiciona ou atualiza um jogo na arrayList
    }
    
    public void removeMatch(){
        //Remove um jogo da arrayList
    }
    
    public void saveTournament(String tournamentName){
        //Finaliza e grava tudo no banco
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public ArrayList<Match> getArrayMatch() {
        return arrayMatch;
    }

    public void setArrayMatch(ArrayList<Match> arrayMatch) {
        this.arrayMatch = arrayMatch;
    }
    
}
