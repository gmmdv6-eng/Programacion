package entidades;

public class CuentaBancaria {
public String titular;
public String numero;
public String contraseña;
public double saldo;

public CuentaBancaria() {
}

public CuentaBancaria(String titular, String numero, String contraseña, double saldo) {
    this.titular = titular;
    this.numero = numero;
    this.contraseña = contraseña;
    this.saldo = saldo;
}

public void ingresarDinero (double cantidad){
    saldo += cantidad;
}

public void retirarDinero (double cantidad){
    saldo -= cantidad;
}

public void mostrarDatos(){
    System.out.println(
        "Titular: " + titular
        + "\nNumero: " + numero
        + "\nSaldo: " + saldo
        + "\nEstado: " 
    );
}

public boolean tieneDeudas(){
    return  saldo <0;
}

public double calcularDevaluacion(int años, double tasaDevaluacion){
return saldo * Math.pow(1-tasaDevaluacion / 100, años);
}

}


