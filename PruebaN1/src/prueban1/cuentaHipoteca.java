
package prueban1;

/**
 *
 * @author Usuario
 */
public class cuentaHipoteca extends Cuenta {

    public cuentaHipoteca(String cliente, String tipoCliente, double balance, double tasaIntereses, int meses) {
        super(cliente, tipoCliente, balance, tasaIntereses, meses);
    }

    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTasaIntereses() {
        return tasaIntereses;
    }

    public void setTasaIntereses(double tasaIntereses) {
        this.tasaIntereses = tasaIntereses;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    
    
    
    
    @Override
    public void calcularInteres(int meses) {
       
       if ( tipoCliente.equalsIgnoreCase("empresa")&&(meses >0 && meses <= 12)){
      balance= balance*0.5;
      
       }
       if (tipoCliente.equalsIgnoreCase("individuo")&&(meses>0&&meses<=6)){
           balance=balance;
           
       }
          
        
    }

    @Override
    public void depositar(double depositar) {
        
        
                    }
    
}
