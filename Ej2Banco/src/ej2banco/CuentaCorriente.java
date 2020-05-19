
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

    public double getAcuerdo()
    {
        return acuerdo;
    }

    public void setAcuerdo(double acuerdo)
    {
        this.acuerdo = acuerdo;
    }
    
    @Override
    public void extraer(double monto)
    {
        if(saldo + acuerdo >= monto)
        {
            saldo -= monto;
        }
    }
     
    @Override
    public String toString() {
        return super.toString() + ", acuerdo = " + acuerdo;
    }
}
