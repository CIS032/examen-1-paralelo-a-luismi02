
package prueban1;


public abstract  class  Cuenta {

   String cliente;
   String tipoCliente;
   double balance;
   double tasaIntereses;
   int meses;

    public Cuenta() {
    }

    public Cuenta(String cliente, String tipoCliente, double balance, double tasaIntereses, int meses) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
        this.balance = balance;
        this.tasaIntereses = tasaIntereses;
        this.meses=meses;
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
   
    
   
   public abstract void calcularInteres (int meses);
   public abstract void depositar(double depositar);
   
}
