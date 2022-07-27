/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crudconsola;
 
import java.awt.Menu;
 import java.util.Scanner;


 

/**
 *
 * @author emilia
 */
public class CrudConsola {
    
    
  public static int menu(){
        int respuesta=0;
     Scanner teclado = new Scanner(System.in);
        System.out.println("          Menu              ");
       System.out.println("1). Insertar");
       System.out.println("2). Modificar ");
       System.out.println("3). Consultar");
        System.out.println("4). Eliminar");
        respuesta= teclado.nextInt();
           
        
        
        return respuesta;
        }

    public static void main(String[] args) {
        
        switch (menu()) {
            case 1:
                Insertat inser= new Insertat();
                inser.setAlumno();
                break;
            case 2:
                Modificar modi= new Modificar();
                modi.ModifivarAlumno();
                break;
            case 3:
                Consultar cons = new Consultar();
                cons.ConsutaAlumno();
            break;
            case 4:
                Eliminar Eli= new Eliminar();
                Eli.EliminarAlumno();
                break;
                
            default:
                throw new AssertionError();
        }
    
        menu();
       
         
    }
}
