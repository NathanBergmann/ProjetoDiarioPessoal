import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivos {

    public boolean ArquivoExist(String path, String nome ){
        Path diretorioPath = Paths.get(path);
        Path arquivoPath = diretorioPath.resolve(nome+".txt");
        boolean exists = Files.exists(arquivoPath);
        return exists ;
    }

}
