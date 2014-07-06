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

import arklivre.bolao.jpa.UserRepository;
import arklivre.bolao.modelo.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RegisterMB {

    User user;

    /**
     * Creates a new instance of RegisterMB
     */
    public RegisterMB() {
        user = new User();
    }

    public void register() {
        Integer next = UserRepository.nextId();
        user.setAdmin(true);
        user.setId(next);
        System.out.println("next: " + next);
        UserRepository.save(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
