/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudconsola;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
/**
 *
 * @author emilia
 */
 
public class Insertat {
   PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    public void setAlumno(){
    String nombre;
    String direccio;
    String telefono;
      Scanner in = new Scanner(System.in);
    System.out.println("Ingrese Nombre");
 nombre=in.nextLine();
     System.out.println("Ingrese telefono");
   telefono=in.nextLine();
    System.out.println("Ingrese Direccion");
    direccio=  in.nextLine();
    
     String sql = "insert into alumno(nombre,telefono,direccion) values (?,?,?)";
      try {
            con = conectar.Conectar();
           ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, telefono);
            ps.setString(3, direccio);
                        ps.executeUpdate();
            System.out.println("Insetado correctamente");
            
        } catch (Exception e) {
        }
    }
    
}
