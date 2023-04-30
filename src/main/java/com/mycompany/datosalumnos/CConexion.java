/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datosalumnos;

/**
 *
 * @author QUIROZ
 */
public class CConexion {
    
    connection conectar = null;
    
    String usuario ="";
    String contrasena ="";
    String bd ="";
    String ip = "localhost";
    String puerto ="1433";
    
    public Connecction establecerConexion (){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
            
            } catch (Exception e) {
    }
}
