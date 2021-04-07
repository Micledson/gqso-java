package junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTeste {
    Banco banco;

    @BeforeEach
    public void setUp() {
        banco = new Banco();
    }

    @Test
    public void testeSaque() {
        
    }

}