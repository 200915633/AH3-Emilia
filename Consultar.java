/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudconsola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Consultar {
       PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
      Scanner in = new Scanner(System.in);
      public void ConsutaAlumno(){
        Integer codigo;
        System.out.println("Ingrese codigo del alumno a  consultar ");
        codigo=in.nextInt();
    
       String instruccion = "select nombre, direccion, telefono from alumno where codigo="+codigo.toString();
       
         try {
            con = conectar.Conectar();
            ps = con.prepareStatement(instruccion);
            rs = ps.executeQuery();
            
             while (rs.next()) { 
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println("---------------");
            
             }
        } catch (Exception e) {
        }
      }
      
    
}
