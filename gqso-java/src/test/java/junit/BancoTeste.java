package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.Banco.SaldoInsuficiente;

public class BancoTeste {
    Banco banco;

    @BeforeEach
    public void setUp() {
        banco = new Banco();
        banco.setSaldo(100);
    }

    @Test
    public void testeSaque() throws SaldoInsuficiente {
        assertEquals(banco.getSaldo() - 100, banco.saque(100));
        assertThrows(Banco.SaldoInsuficiente.class, () -> banco.saque(100));
    }

}