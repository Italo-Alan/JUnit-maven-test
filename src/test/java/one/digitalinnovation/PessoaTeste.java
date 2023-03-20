package one.digitalinnovation;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
    //Notação @Test para indicar que é um teste
    //Estrutura básica, todos os métodos do JUnit retornam void
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa italo = new Pessoa("Italo", LocalDateTime.of(1997, 2, 27, 15, 0, 0));
        //Assertions é o nome da classe em que fazemos as validações
        //Colocamos sempre o resultado esperado do lado esquerdo e onde vamos chamar do lado direito
        Assertions.assertEquals(26, italo.getIdade());
    }

    @Test
    void verificaMaiorIdade(){
        Pessoa italo = new Pessoa("Italo", LocalDateTime.of(1997, 2, 27, 15, 0, 0, 0));
        Pessoa isabelle = new Pessoa("Isabelle", LocalDateTime.of(1999, 11, 16, 15, 0, 0, 0));
        Pessoa joao = new Pessoa("João Vitor", LocalDateTime.of(2007, 2, 20, 15, 0, 0, 0));
        Assertions.assertTrue(italo.maiorDeIdade());
        Assertions.assertTrue(isabelle.maiorDeIdade());
        Assertions.assertFalse(joao.maiorDeIdade());
    }
}
