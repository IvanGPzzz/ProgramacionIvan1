package tema4;

public class Cuenta {
    int numCuenta;
    int saldo;

    public Cuenta() {
        numCuenta = 0;
        saldo = 0;
    }

    public Cuenta(int numCuenta, int saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public int getNumCuenta() {return numCuenta;}
    public void setNumCuenta(int numCuenta) {this.numCuenta = numCuenta;}
    public int getSaldo() {return saldo;}
    public void setSaldo(int saldo) {this.saldo = saldo;}

//ingreso
    public void ingresar(int cantIngres) {
        saldo += cantIngres;
    }

//retirada
    public void retirar(int cantRetir) {
        saldo -= cantRetir;
    }

    public String toString() {
        return "Número de cuenta: " + numCuenta + "\nSaldo: " + saldo;
    }

}