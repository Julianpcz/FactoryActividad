/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack3;


import Pack2.IConexion;

public class Conexionyahoo implements IConexion {
     private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
     public Conexionyahoo(){
       
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "Juan";
        this.contrasena = "1234";
        
    }
    
    public void conectar(){
    System.out.println("se conecto a Yahoo");
    }
    public void desconectar(){
    System.out.println("se desconecto de Yahoo");
    }
    public String toString(){
    return "ConexionYahoo [host =" + host + ", puerto = " + puerto + ", usuario = " + usuario + 
            ", contraseña = " + contrasena + "]";
    }
}
