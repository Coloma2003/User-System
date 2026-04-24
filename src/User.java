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
    private boolean isActive;
    
    public User(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
        this.isActive = true;
    }
    public String getUsername(){
        return Username;
    }
    public String getPassword(){
        return Password;
    }
    public boolean Active() {
        return isActive;
    }
    
    public void setActivo(boolean activo) {
        this.isActive = activo;
    }
    public void setUsername(String username) {
        this.Username = username;
}

    public void setPassword(String password) {
        this.Password = password;
}
    
}
