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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BolaoMB {

    private User login;
    private String user;
    private String password;

    public BolaoMB() {
    }

    public String login() {
        if ("ramon".equals(user) && "123".equals(password)) {
            return "sucess";
        } else {
            return "fail";
        }
    }

    public void createTournament(Tournament tournament) {
        //Cria um novo campeonato, apenas para usuario ADMIN
        //Verifica se o usuario é admin e redireciona para a pagina de criar
    }

    public void editTournament(Tournament tournament) {
        //Edita um campeonato existente, apenas para usuário ADMIN
        //Verifica se o usuário é admin e redireciona para a pagina de editar
        //Também inclui o resultado das partidas
    }

    public void scoreBoard(Tournament tournament) {
        //Visualiza a pontuação de determinado campeonato
    }

    public void bidTournament(Tournament tournament) {
        //Redireciona para a pagina de apostas de um determinado campeonato
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
