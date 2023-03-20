package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
// import org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTeste {

    @Test
    //@EnabledOnOS(OS.MAC)
    //@EnabledOnOS(OS.LINUX)
    //@EnabledOnOS({O.MAC, OS.LINUX})
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    // @EnabledOnJre(JAVA_17)
    void validarAlgoSomenteNoUsuarioItalo(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
