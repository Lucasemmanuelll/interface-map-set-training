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

        Map<Integer,String> map = new HashMap<>();//CRIAR GET
        //ADICIONAR
        contas.put(1001,"Lucas");
        contas.put(1002,"Amanda");

        contas.get(1002);//BUSCAR

        contas.remove(1002);//REMOVER

        contas.containsKey(1001);//VERIFICAR CHAVE EXISTENTE 
    }
}