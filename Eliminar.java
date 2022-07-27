/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudconsola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Eliminar {
       PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
      Scanner in = new Scanner(System.in);
      
      public void EliminarAlumno(){
        Integer codigo;
        System.out.println("Ingrese codigo del alumno a  Eliminar ");
        codigo=in.nextInt();
        String sql = "delete from alumno where codigo ="+codigo.toString();
        try {
            
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.executeUpdate();
            System.out.println("Eliminado Correctamente");
        } catch (Exception e) {
        }
      }
}
