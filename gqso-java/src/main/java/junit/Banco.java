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
        if(valor > getSaldo()) {
            throw new SaldoInsuficiente();
        } else if(valor < 0) {
            throw new ValorNegativo();
        }
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