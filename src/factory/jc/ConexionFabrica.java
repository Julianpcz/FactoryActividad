/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.jc;

import Pack2.IConexion;
import pack3.ConexionBrave;
import pack3.ConexionGoogle;
import pack3.ConexionOpera;
import pack3.Conexionvacia;
import pack3.Conexionyahoo;

public class ConexionFabrica {
    public IConexion getConexion(String motor) {
    if (motor == null) {
               return new Conexionvacia();   
    }
    if (motor.equalsIgnoreCase("Google")){
             return new ConexionGoogle();
    } else if (motor.equalsIgnoreCase("Opera")){
             return new ConexionOpera();
    }  else if (motor.equalsIgnoreCase("Brave")){
             return new ConexionBrave();
    } else if (motor.equalsIgnoreCase("yahoo")){
             return new Conexionyahoo();
    }    
    return new Conexionvacia();
  }
}
