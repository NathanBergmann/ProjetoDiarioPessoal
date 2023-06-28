import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Arquivos extends Configuracoes{

    public boolean ArquivoExist(String path, String nome ){
        Path diretorioPath = Paths.get(path);
        Path arquivoPath = diretorioPath.resolve(nome+".txt");
        boolean exists = Files.exists(arquivoPath);
        return exists ;
    }

   public void VisualizarArquivo(String nome){
           Scanner entrada = new Scanner(System.in);
           String dirConfig = getPath();
           String caminhoDoArquivo = (dirConfig + "\\" +  nome+ ".txt");
           Path arquivo = Paths.get(caminhoDoArquivo);
           try {
               List<String> linhas = Files.readAllLines(arquivo);
               PrintStream var10001 = System.out;
               Objects.requireNonNull(var10001);
               linhas.forEach(var10001::println);
           } catch (Exception var4) {
               var4.printStackTrace();
           }

        return ;
    }

    public void EscreverArquivo(String nomeArquivo) throws IOException {

        String strCaminhoArquivo = (getPath() + "\\" + nomeArquivo + ".txt");
        Path pathCaminhoArquivo = Paths.get(strCaminhoArquivo);
        Scanner entrada = new Scanner(System.in);
        FileWriter arq = new FileWriter(strCaminhoArquivo, true);
        BufferedWriter bw = new BufferedWriter(arq);
        try {
            System.out.println("Escreva no Diário.....");
            bw.newLine();
            String strObterTexto = entrada.nextLine();
            bw.write(strObterTexto);
            bw.close();

        } catch (IOException var7) {

        }
    }

}
