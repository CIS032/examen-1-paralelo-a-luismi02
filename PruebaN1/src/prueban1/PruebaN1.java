
package prueban1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PruebaN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        while(opcion !=4 ){
            String menu = "1--> Cuenta de ahorros"
                    + "\n2-->Cienta de prestamos"
                    + "\n3-->Cuenta hipoteca"
                    +"\n4-->Salir"
                    ;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,menu,"Movimiento de Figuras",JOptionPane.QUESTION_MESSAGE));
            switch (opcion){
                case 1:
                    String cliente1 = JOptionPane.showInputDialog(null,"Ingrese nombre del cleinte");
                    String tipoCliente1 =JOptionPane.showInputDialog(null,"Ingrese tipo de cleinte");
                    double balance1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el balance "));
                    double tasaInteres1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la tasa de interes "));
                    int horasSemanales = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las horas semanas",JOptionPane.QUESTION_MESSAGE));
                    int meses1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero de meses"));
                    cuentaAhorro cuentaaho= new cuentaAhorro(horasSemanales, cliente1, tipoCliente1, balance1, tasaInteres1,meses1);                    
                     Banco.agregar(cuentaaho);
                    
                    break;
                case 2:
                     String cliente2= JOptionPane.showInputDialog(null,"Ingrese nombre del cleinte");
                    String tipoCliente2=JOptionPane.showInputDialog(null,"Ingrese tipo de cleinte");
                    double balance2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el balance "));
                    double tasaInteres2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la tasa de interes "));
                    int meses2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero de meses"));
                    cuentaPrestamo cuentapres= new cuentaPrestamo(cliente2, tipoCliente2, balance2, tasaInteres2,meses2);
                    Banco.agregar(cuentapres);
                    break;
                    
                case 3:
                     String cliente3 = JOptionPane.showInputDialog(null,"Ingrese nombre del cleinte");
                    String tipoCliente3=JOptionPane.showInputDialog(null,"¿Empresa o Cliente?","Empresa o individuo");
                    double balance3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el balance "));
                    double tasaInteres3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la tasa de interes "));
                    int meses3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero de meses"));
                    cuentaHipoteca cuentahipo = new cuentaHipoteca(cliente3, tipoCliente3, balance3, tasaInteres3,meses3);
                    Banco.agregar(cuentahipo);
                    break;
                    
                    
                case 4://Salir
                   Banco.grabar();
                    
                    break;
                
                        
                        
                    }
                   
                    
            }
        
    }
    
}
    



