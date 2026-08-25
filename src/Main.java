import java.util.Scanner;
import java.util.HashSet;//IMPORTAR BIBLIOTECA
import java.util.Set;

public class Main{

    public static void main(String[] args)
    {

    String nomes;
        Set<String> nomes = new HashSet<>();//CRIAR SET
        //ADICIONAR
        nomes.add("Lucas");
        nomes.add("Lucas");
        nomes.add("Amanda");
        nomes.add("José");
        nomes.add("Mateus");

        nomes.contains("Lucas");// VERIFICAR

        nomes.remove("José");// REMOVER

        nomes.size();//MOSTRAR TAMANHO
    }
}