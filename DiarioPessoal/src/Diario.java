import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Diario extends Arquivos{
    Configuracoes c = new Configuracoes();
    private String strOpcao = "";
    public void EscreverDataAtual() throws IOException {
        Date dataAtual = new Date();
        String dataFormatada = new SimpleDateFormat("dd-MM-yyyy").format(dataAtual);
        VisualizarArquivo(dataFormatada);
        EscreverArquivo(dataFormatada);
        }

    public void EscreverOutrasDatas(String data){

    }

    public void ExcluirInformações() { // PREPARAR
        String nomeArquivo = "Arquivos/27-06-2023.txt";
        try {
            String dados = "......";
            RandomAccessFile writer = new RandomAccessFile(nomeArquivo, "rw");
            writer.seek(100);
            writer.write(dados.getBytes());
            writer.close();
        } catch (IOException var4) {
            var4.printStackTrace();
        }

    }
    public  void VisualizarArquivo(String nomeArquivo){
        Scanner entrada = new Scanner(System.in);
        VisualizarArquivo(nomeArquivo);
        System.out.println("Pressione enter para voltar....");
        String teclaSair = entrada.nextLine();
    }
}