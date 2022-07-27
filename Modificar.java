/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudconsola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Modificar {
    
     PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
      Scanner in = new Scanner(System.in);
       Scanner teclado = new Scanner(System.in);
    public void ModifivarAlumno(){
     Integer codigo;
     String nombre;
    String direccio;
    String telefono;
         
    System.out.println("Ingrese codigo del alumno a modificar");
    codigo=teclado.nextInt();
    System.out.println("Ingrese Nombre");
    nombre=in.nextLine();
     System.out.println("Ingrese telefono");
   telefono=in.nextLine();
    System.out.println("Ingrese Direccion");
    direccio=  in.nextLine();
      String sql = "update alumno set nombre='" + nombre + "', telefono='" + telefono + "', direccion='" + direccio + "' where codigo ='" + codigo + "'";
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Alumnos "+codigo+"Modificado");
        } catch (Exception e) {
            System.out.println(e);
        }
    
    
    
    }
    
}
