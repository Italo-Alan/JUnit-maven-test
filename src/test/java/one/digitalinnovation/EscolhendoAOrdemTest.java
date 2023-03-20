package one.digitalinnovation;

import org.junit.jupiter.api.*;

// @TestMethodOrder(MethodOrderer.Random.class)
// @TestMethodOrder(MethodOrderer.DisplayName.class) -> Nomeia o teste de alguma forma
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTest {

    @Order(4)
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}
