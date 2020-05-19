
package ej2banco;

public abstract class Cuenta
{
    protected int numero;
    protected String nombre;
    protected double saldo;
    
    public Cuenta()
    {
        numero = 0;
        nombre = "";
        saldo = 0;
    }
    
    public Cuenta(int numero, String nombre, double saldo)
    {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public int getNumero()
    {
        return numero;
    }

    public String getNombre()
    {
        return nombre;
    }

    public double getSaldo()
    {
        return saldo;
    }
    
    public abstract void extraer(double monto);

    
    public void depositar(double monto)
    {
        saldo += monto;
    }
    
    @Override
    public String toString() {
        return "Cuenta " + "numero = " + numero + ", nombre = " + nombre + ", saldo = " + saldo;
    }
}
