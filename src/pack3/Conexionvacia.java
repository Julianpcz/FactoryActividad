/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack3;

import Pack2.IConexion;

/**
 *
 * @author Estudiantes
 */

public class Conexionvacia implements IConexion {
 
    @Override
    public void conectar(){
    System.out.println("No se especifico proveedor");
    }
    
    @Override
    public void desconectar(){
    System.out.println("No se especifico proveedor");
    }

}

