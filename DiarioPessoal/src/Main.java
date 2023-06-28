// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        Scanner entrada = new Scanner(System.in);
        Diario escrever = new Diario();
        boolean repetir = true;

        while (repetir) {
            menu.VisualizarMenu();
            String opcao = entrada.next();
            switch (opcao) {

                case "1":
                    System.out.println("------------------------");
                    System.out.println("Incluir informações no dia Atual");
                    escrever.EscreverDataAtual();
                    break;

                case "2":
                    System.out.println("------------------------");
                    System.out.println("Digite o dia para visualizar: dd-mm-yyyy");
                    String strNomeArquivo = entrada.next();
                    escrever.VisualizarArquivo(strNomeArquivo);
                    System.out.println("");

                    break;

                case "3":
                    System.out.println("Entrou caso 3");
                    break;
                case "4":
                    escrever.ExcluirInformações();
                    break;
                case "99":
                    System.out.println("Fechando o Diario");
                    repetir = false;
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;

// bloco de código que será executado se nenhum dos cases for aceito

            }

        }
    }
}