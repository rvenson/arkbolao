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

package arklivre.bolao.test;

import arklivre.bolao.jpa.UserRepository;
import arklivre.bolao.modelo.User;

/**
 *
 * @author venson
 */
public class Test {
    
    public static void main(String[] args){
        
        try{
            
            User user = new User();
            user.setAdmin(true);
            user.setId(1);
            user.setName("teste");
            user.setEmail("teste@teste");
            user.setPassword("teste");
            UserRepository.save(user);
            
            user = (User) UserRepository.getUser(1);
            System.out.println("user: " + user.getName());
            
        } catch(Exception ex){
            System.out.println("erro!");
        }
    }
    
}
