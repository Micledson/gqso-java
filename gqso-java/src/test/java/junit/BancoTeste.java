package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.Banco.SaldoInsuficiente;
import junit.Banco.ValorNegativo;

public class BancoTeste {
    Banco banco;

    @BeforeEach
    public void setUp() throws ValorNegativo {
        banco = new Banco();
        banco.deposito(100);
    }

    @Test
    public void testeSaque() throws SaldoInsuficiente, ValorNegativo {
        assertEquals(banco.saldo() - 100, banco.saque(100));
        assertThrows(Banco.SaldoInsuficiente.class, () -> banco.saque(200));
        assertThrows(Banco.ValorNegativo.class, () -> banco.saque(-100));
    }

    @Test
    public void testeDeposito() throws ValorNegativo {
        assertEquals(banco.saldo() + 100, banco.deposito(100));
        assertThrows(Banco.ValorNegativo.class, () -> banco.deposito(-100));

    }
    @Test
    public void testeSaldo() {
        assertEquals(100, banco.saldo());
    }

}