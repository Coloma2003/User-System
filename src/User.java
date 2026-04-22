/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laske
 */
public class User {
    private String Username;
    private String Password;
    
    public User(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
    }
    public String getUsername(){
        return Username;
    }
    public String getPassword(){
        return Password;
    }
    
}
