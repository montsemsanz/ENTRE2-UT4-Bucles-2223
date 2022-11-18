import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  @author Aitor Zubillaga Soria  
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
        PracticaLoops objeto1 = new PracticaLoops();
        Utilidades utilidades = new Utilidades();
        objeto1.generarNumeros();

        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        
        System.out.println("Por favor introduzca un groso para crear la letra entre 1 y 5");
        int grosor = teclado.nextInt();
        while(!(grosor<=5 && grosor>0)){
            System.out.println("Por favor introduzca un valor correcto entre 1 y 5");
            grosor = teclado.nextInt();

        }
         System.out.println("Por favor introduzca una altura para crear la letra entre "+
         grosor + " y 20, y ademas que la altura - " + grosor + " sea un numero par" );
        int altura = teclado.nextInt();
        while(!((altura<=20 && altura>grosor))||(altura-grosor)%2!=0){
            System.out.println("Por favor introduzca un valor correcto entre " + 
            grosor + " y 20, y ademas que la altura - " + grosor + " sea un numero par" );
            altura = teclado.nextInt();

        }
        objeto1.dibujarLetra(grosor, altura);

         
    }
}

