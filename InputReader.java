import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader lê entrada de texto do terminal padrão. 
 * O texto digitado por um usuário é então dividido em palavras, e um conjunto de palavras
 * é fornecido.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    0.1
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Cria um novo InputReader que lê texto do terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Lê uma linha de texto da entrada padrão (o terminal),
     * e a retorna como uma String.
     *
     * @return  Uma String digitada pelo usuário.
     */
    public String getInput()
    {
        System.out.print("> ");         // imprime o prompt
        String inputLine = reader.nextLine();

        return inputLine;
    }
}
