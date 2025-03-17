/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack3;

import Pack2.IConexion;

public class ConexionBrave implements IConexion {
     private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
     public ConexionBrave(){
       
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "Juan";
        this.contrasena = "1234";
        
    }
    
    public void conectar(){
    System.out.println("se conecto a Brave");
    }
    public void desconectar(){
    System.out.println("se desconecto de Brave");
    }
    public String toString(){
    return "ConexionBrave [host =" + host + ", puerto = " + puerto + ", usuario = " + usuario + 
            ", contraseña = " + contrasena + "]";
    }
}


