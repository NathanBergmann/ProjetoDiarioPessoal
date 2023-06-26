import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class EscreverDiario extends Arquivos{
    Configuracoes c = new Configuracoes();
    public void EscreverDataAtual() throws IOException {
        Date dataAtual = new Date();
        String dataFormatada = new SimpleDateFormat("dd-MM-yyyy").format(dataAtual);
        System.out.println(ArquivoExist(c.getPath(), dataFormatada));
        Scanner entrada = new Scanner(System.in);
        String strCaminhoArquivo = (c.getPath()+"\\"+dataFormatada+".txt");
        Path pathCaminhoArquivo = Paths.get(strCaminhoArquivo);

        FileWriter arq = new FileWriter(strCaminhoArquivo);
        try {
            BufferedWriter writer = Files.newBufferedWriter(pathCaminhoArquivo, StandardCharsets.UTF_8);

            try {
                boolean adicionarNovaLinha = true;

                while (adicionarNovaLinha) {

                    System.out.println("Adicionar nova linha no Diário? [S/N]");
                    String strOpcao = entrada.nextLine();

                    if (strOpcao == "S"){
                        System.out.println("Escreva no Diário.....");
                        String strObterTexto = entrada.nextLine();
                        writer.newLine();
                    }
                    else {
                        adicionarNovaLinha = false;
                    }

                }
            } catch (Throwable var6) {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                    }
                }

                throw var6;
            }

            if (writer != null) {
                writer.close();
            }
        } catch (IOException var7) {
            var7.printStackTrace();
        }



        arq.close();
    }
}
