/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory.jc;

import Pack2.IConexion;
public class FactoryJC {

    
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();
        IConexion cx1 = fabrica.getConexion("Google");
        cx1.conectar();
        cx1.desconectar();
        
        IConexion cx2 = fabrica.getConexion("Opera");
        cx2.conectar();
        cx2.desconectar();
        
        IConexion cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();
    }
    
}
