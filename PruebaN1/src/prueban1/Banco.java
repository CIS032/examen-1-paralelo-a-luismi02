/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueban1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Banco {
 
    static ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
  
  public static void agregar (Cuenta c){
      cuentas.add(c);    
  }
  
  public static void InteresCuentas (int meses,double tasaInteres){
      for (Cuenta cuenta : cuentas) {
          cuenta.calcularInteres(meses);
      }
      
  }
  public static void grabar (){
          PrintWriter pw =null;
          try {
              FileWriter fw = new FileWriter("C:\\Users\\Usuario\\Documents\\PracticaProgramacion\\examen.csv",true);
              pw = new PrintWriter(fw);
          } catch (Exception ex) {
              System.out.println("Error al abrir Archivos" + ex);
          }
          
           for (Cuenta cuenta : cuentas) {
               if (cuenta instanceof cuentaAhorro) {
                cuentaAhorro cA = (cuentaAhorro) cuenta;
                   String linea = "Cuenta de ahorro"+ ";" +cA.getCliente()+";"+cA.getTipoCliente()+";" + cA.balance;
                   pw.print(linea);    
               }
               if (cuenta instanceof cuentaPrestamo) {
                   cuentaPrestamo cP = (cuentaPrestamo) cuenta;
                   String linea = "Cuenta Prestamo"+";"+cP.getCliente()+";"+cP.getTipoCliente()+";" + cP.balance;
                   pw.println(linea);
               }
               if (cuenta instanceof cuentaHipoteca) {
                   cuentaHipoteca cH = (cuentaHipoteca) cuenta;
                   String linea = "Cuenta Hipoteca"+";"+cH.getCliente()+";"+cH.getTipoCliente()+";" + cH.balance*0.5;
                   pw.println(linea);
               }
          }
           
          pw.close();
      }
      
      
      
      
      
      
 
      
      
      
}
