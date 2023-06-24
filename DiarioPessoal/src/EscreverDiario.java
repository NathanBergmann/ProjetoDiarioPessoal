import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreverDiario extends Arquivos{
    Configuracoes c = new Configuracoes();
    public void EscreverDataAtual() throws IOException {
        Date dataAtual = new Date();
        String dataFormatada = new SimpleDateFormat("dd-MM-yyyy").format(dataAtual);
        System.out.println(ArquivoExist(c.getPath(), dataFormatada));

        FileWriter arq = new FileWriter(c.getPath() + "\\" + dataFormatada);
        arq.close();
    }
}
