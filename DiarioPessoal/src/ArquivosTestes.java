import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ArquivosTestes {

    @Test
    public void ArqTestes () {
        Arquivos arq = new Arquivos();

        // Teste Arquivo inexistente
        Assertions.assertFalse(arq.ArquivoExist("Arquivos","99-99-9999"));

        // Teste com arquivo Correto
        Assertions.assertTrue(arq.ArquivoExist("Arquivos","01-01-9999"));


    }


}
