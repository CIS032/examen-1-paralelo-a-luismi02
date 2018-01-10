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
public  class cuentaAhorro extends Cuenta{
 
    private int horasSemanales;

    public cuentaAhorro() {
    }

    public cuentaAhorro(int horasSemanales, String cliente, String tipoCliente, double balance, double tasaIntereses,int meses) {
        super(cliente, tipoCliente, balance, tasaIntereses,meses);
        this.horasSemanales = horasSemanales;
    }

   
    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
    
    
    public double retirar (){
        int total=0;
        return total;
    }

    @Override
    public void calcularInteres(int meses) {
        if(balance>0&&balance<1000){
            
        }
        else{
       double interes =0;
   interes = meses*tasaIntereses;     
        }
    }
    
    @Override
    public void depositar(double depositar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
