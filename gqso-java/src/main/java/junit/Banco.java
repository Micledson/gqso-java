package junit;

public class Banco {
    private double saldo;

    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }

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