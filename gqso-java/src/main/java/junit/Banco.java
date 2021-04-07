package junit;

public class Banco {
    private double saldo;

    public double saque(double valor) {
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    
}