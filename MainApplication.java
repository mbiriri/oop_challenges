/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _account;

/**
 *
 * @author joyce mbiriri
 */
public class MainApplication {
    public static void main(String[] args) {

        Admin curAdmin = new Admin(1234, "Stephan", "xa1@LW42%3");

        User curUser = new User(4455, "John");

        curAdmin.performOperation(new Update()); // Admin Updates the data.

        curUser.performOperation(new View()); // User can view the data.

    }

}
