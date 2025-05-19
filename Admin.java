/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _account;

/**
 *
 * @author joyce mbiriri
 */
public class Admin extends _Account{
    // A private string specified only with the Admin

    private String AuthPassword;

    public Admin(int _id, String _name, String _password) {
        id=_id;
        name=_name;
        AuthPassword = _password;
    }

}


