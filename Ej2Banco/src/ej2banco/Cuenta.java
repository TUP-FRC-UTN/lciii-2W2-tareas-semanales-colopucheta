
package ej2banco;

public class Cuenta
{
    private int numero;
    private String nombre;
    double saldo;
    
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
    
    public void extraer(double monto)
    {
        saldo = saldo - monto;  
    }
    
    public void depositar(double monto)
    {
        saldo = saldo + monto;  
    }
    
    @Override
    public String toString() {
        return "Cuenta " + "numero = " + numero + ", nombre = " + nombre + ", saldo = " + saldo;
    }
}
