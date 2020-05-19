
package ej2banco;

public class CajaAhorro extends Cuenta
{
    public CajaAhorro(int numero, String nombre, double saldo)
    {
        super(numero, nombre, saldo);
    }
    

     public void extraer(double monto)
    {
        if(saldo >= monto)
        {
            saldo -= monto;
        }
    }
}
