import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   @author Aitor Zubillaga Soria  
 */
public class Utilidades
{
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     *  Hacer una pausa  
     */
    public static void hacerPausa()    {
        System.out.println("\n\n\tIntro para continuar");
        teclado.nextLine();

    }
    
     /**
     *  Borrar la pantalla
     */
    public static void borrarPantalla()    {
        System.out.print('\u000C');

    }
    
    
}
