/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudconsola;

 import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    
    String url="jdbc:mysql://localhost:3307/colegio";
    String user="root";
    String pass="";
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=  DriverManager.getConnection(url,user,pass);
            System.out.println("conectado");
        } catch (Exception e) {
            System.out.println(e);
        }      
        return con;
        
    }
}
