import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class TestPracticaLoops
{

    /**
     *  Punto de entrada a la aplicación
     *  - define y crea el teclado  
     *  - define e instancia un objeto PracticaLoops
     *  - pide al usuario la cantidad máxima de aleatorios a generar
     *    (valida que sea  un nº positivo)
     *  - muestra los números aleatorios y sus valores con ceros intercalados
     *  - haz una pausa y borra la pantalla    
     *  
     *  - pide al usuario un valor para el grosor de la letra 
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo 0 < grosor <= 5
     *  - pide al usuario un valor para ela altura de la letra 
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo (grosor < altura  <= 20)  y además (altura - grosor) es  par      
     *  - muestra la letra  
     *  
     */
    public static void main(String[] args)    {
        Scanner teclado = new Scanner(System.in);
        PracticaLoops loops = new PracticaLoops();
        Utilidades utilidades = new Utilidades();
        int cuantosNumeros = 0;
        
        do {
            System.out.print("Cuantos numeros aleatorios quieres generar: ");
            cuantosNumeros = teclado.nextInt();
            if (cuantosNumeros < 0) {
                System.out.println("Valor incorrecto.");
            }
        } while (cuantosNumeros < 0);
        
        loops.generarNumeros(cuantosNumeros); 
        utilidades.hacerPausa();
        utilidades.borrarPantalla();
        
        int grosor;
        do {
            System.out.print("Teclea grosor de la letra (0 < grosor <= 5): ");
            grosor = teclado.nextInt();
            if (grosor <= 0 || grosor > 5) {
                System.out.println("Grosor incorrecto.");
            }
        } while (grosor <= 0 || grosor > 5);
        
        int altura;
        do {
            System.out.print("Teclea altura de la letra (grosor < altura <= 20) y " +
                "(altura - grosor es par): ");
            altura = teclado.nextInt();
            if (altura <= grosor || altura > 20 || (altura - grosor) % 2 != 0) {
                System.out.println("Altura incorrecta.");
            }
        } while (altura <= grosor || altura > 20 || (altura - grosor) % 2 != 0);
        loops.dibujarLetra(grosor, altura);
    }
}

