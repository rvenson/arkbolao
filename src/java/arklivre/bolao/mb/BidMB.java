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

import arklivre.bolao.modelo.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BidMB {
    
    private User login;

    public BidMB(User login) {
        this.login = login;
        
        //Talvez dê pra colocar a validação do usuário aqui
    }
    
    public void addBid(){
        //Adiciona ou atualiza a aposta
    }
    
    public void removeBid(){
        //Remove uma aposta
    }
    
}
