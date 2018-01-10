/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueban1;

/**
 *
 * @author Usuario
 */
public class cuentaPrestamo extends Cuenta{

    public cuentaPrestamo(String cliente, String tipoCliente, double balance, double tasaIntereses,int meses) {
        super(cliente, tipoCliente, balance, tasaIntereses,meses);
    }
    
    
    

    @Override
    public void calcularInteres(int meses) {
        
        
    }

    @Override
    public void depositar(double depositar) {

    }
    
}
