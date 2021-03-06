package junit;

public class Banco {
    private double saldo;

    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }

    public class ValorNegativo extends Exception {
        private static final long serialVersionUID = 1L;
    }

    public double saque(double valor) throws SaldoInsuficiente, ValorNegativo {
        if(valor > saldo()) {
            throw new SaldoInsuficiente();
        } else if(valor < 0) {
            throw new ValorNegativo();
        }
        setSaldo(saldo() - valor);
        return saldo();
    }

    public double deposito(double valor) throws ValorNegativo {
        if(valor < 0) {
            throw new ValorNegativo();
        }
        setSaldo(saldo() + valor);
        return saldo();
    }
    
    public double saldo() {
        return this.saldo;
    }
    
    private void setSaldo(double valor) {
        this.saldo = valor;
    }

    
}