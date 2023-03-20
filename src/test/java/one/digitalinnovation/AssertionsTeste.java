package one.digitalinnovation;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

//Podemos fazer o que é chamado de importação estática, para evitar de sempre ter que no método declarar sempre o "Assertions"
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Ou podemos colocar o asterisco que todos s'ao reconhecidos
// import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 2, 3, 10, };
        int[] terceiroLancamento = {10, 20, 30, 40, 50};

        //Devemos lembrar que é sempre em função do primeiro, estaremos verificando se o segundo é igual ao primeiro
        assertArrayEquals(primeiroLancamento, terceiroLancamento);

        //Neste exemplo o teste passará corretamente e não quebrará
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjEstaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);
        
        Pessoa ana = new Pessoa("Ana Lucia", LocalDateTime.now());
        assertNotNull(ana);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5d;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
