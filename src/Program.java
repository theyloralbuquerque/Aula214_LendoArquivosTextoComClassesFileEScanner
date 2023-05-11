import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        File file = new File ("c:\\temp\\in.txt"); // Instancia��o do objeto file do tipo File.
        Scanner sc = null; // Cria��o do objeto sc do tipo Scanner recebendo null;

        try {
            sc = new Scanner(file); // Atribui��o de valor ao objeto sc, que recebe o valor do objeto file, que tem como valor o caminho do arquivo.
            while (sc.hasNextLine()) { // .hasNextLine() = tem uma pr�xima linha?
                System.out.println(sc.nextLine()); // Printa a linha seguinte do arquivo.
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) { // Se o objeto sc for diferente de null.
                sc.close(); // Fecha o Scanner.
            }
        }
    }
}