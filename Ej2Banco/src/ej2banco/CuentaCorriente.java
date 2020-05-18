
package ej2banco;

public class CuentaCorriente extends Cuenta
{
    double acuerdo;
    
    public CuentaCorriente(double acuerdo, int numero, String nombre, double saldo)
    {
        super(numero, nombre, saldo);
        this.acuerdo = acuerdo;
    }
    
    public CuentaCorriente()
    {
        super();
        acuerdo = 0;
    }
    
    @Override
    public void extraer(double monto)
    {
        if(saldo - monto >= -acuerdo)
        {
            saldo = saldo - monto;
        }
    }
     
    @Override
    public String toString() {
        return super.toString() + ", acuerdo = " + acuerdo;
    }
}
