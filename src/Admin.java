/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Admin extends User{
    boolean ent = true;
    
    final static String name = "admin";
    final static String login = "admin";
    final static String password = "567890";
    
    @Override
    boolean enter(String login, String password) {
        return ent;
    }
}
