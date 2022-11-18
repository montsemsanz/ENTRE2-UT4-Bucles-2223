import java.util.Random;
/**
 * @author Aitor Zubillaga Soria   
 */
public class PracticaLoops {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaLoops()    {
        generador = new Random();
    }

    /**
     * Devuelve un valor aleatorio entre 0 y limite (exclusive)
     * 
     */
    public int obtenerAleatorio(int limite) {
        int numero = 0;
        numero = generador.nextInt(limite);
        return numero;
    }

    /**
     * devuelve true si termina en 7, false en otro caso. Sin if
     */
    public boolean terminaEn7(int n) {         
        if(n%10==7){
            return true;
        }
        return false;

    }

    /**
     *  Devuelve un número n con las cifras no nulas en el mismo orden
     *  pero entre cada par de cifras no nulas consecutivas el número
     *  devuelto tiene un 0
     *  
     *  intercalarCeros(7) = 7
     *  intercalarCeros(17) = 107
     *  intercalarCeros(113) = 10103
     *  intercalarCeros(170) = 107
     *  intercalarCeros(1203) = 10203
     *  intercalarCeros(1000203) = 10203
     *  intercalarCeros(912000) = 90102
     *  intercalarCeros(91002000) = 90102
     */
    public int intercalarCeros(int n) {
        int numeroSinCeros = 0;
        int guardadoN = n;
        int i = 0;
        int resto = 0;
        while(guardadoN>0){
            resto = guardadoN %10;
            guardadoN = guardadoN/10;
            if ( resto == 0){

            }else{  
                numeroSinCeros += resto * Math.pow(10, i);
                i++;

            }
        }
        int numeroIntercalado = 0;
        i = 0;
        while(numeroSinCeros >0){
            resto = numeroSinCeros % 10;
            numeroSinCeros = numeroSinCeros/10;
        if(i%2!=0){
            i = i+1;
             numeroIntercalado += resto * Math.pow(10, i);
        }else{
           numeroIntercalado += resto * Math.pow(10, i); 
        }       
        i++;  
        }
        return numeroIntercalado;
    }

    /**
     *  El método  genera  números aleatorios  entre 0 y 100000 (exclusive)
     *  y calcula y escribe cada valor aleatorio junto con su versión con ceros intercalados
     *      
     *  El proceso termina cuando sale un aleatorio igual a 0 o un número que acaba en 7       
     *   
     *  Cada nº aleatorio se muestra en un espacio de 15 posiciones en la pantalla  
     *  y al lado ese mismo valor con los ceros intercalados en 25 posiciones
     *  
     *  Si ya el primer aleatorio termina en 7 se visualizará un mensaje que así lo indique
     *  
     *  Utiliza solo bucles while
     */
    public void generarNumeros()   {
        int aleatorio = 1;
        
        
        System.out.println("      ALEATORIOS    CON CEROS INTERCALADOS");
        for(int i = 0; aleatorio >0&&!(terminaEn7(aleatorio));i++){
            int resto = 0;
         aleatorio = obtenerAleatorio(100000);
            int guardadoN = aleatorio;
            int j=0;
             while(guardadoN>0){
            resto = guardadoN %10;
            guardadoN = guardadoN/10;
            j++;
        }
         guardadoN = aleatorio;
         int guardadoIntercalado = intercalarCeros(guardadoN);
          int k=0;
          
             while(guardadoIntercalado>0){
            resto = guardadoIntercalado %10;
            guardadoIntercalado = guardadoIntercalado/10;
            k++;
        }
        String espaciosN = "";
        String espaciosIntercalado = "";
            while(15-j>0){
                espaciosN +=ESPACIO;
                j++;
            }
            while(25-k>0){
                espaciosIntercalado +=ESPACIO;
                k++;
            }
            
            System.out.println(espaciosN+guardadoN + espaciosIntercalado+intercalarCeros(guardadoN));
        }

    }
    /**
     *  Dibuja la letra indicada (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   grosor y altura asumimos correctos
     *  
     *      
     */
    public void dibujarLetra(int grosor, int altura)    {
        for(int i = 0; grosor>i;i++){
            escribirCaracter(CARACTER,altura);
            
        }
         for(int i = 0; (altura-grosor)>i;i++){
             int j = 0;
             while((altura-grosor)/2>j){
                System.out.print(ESPACIO);
                j++;
                
             }
            escribirCaracter(CARACTER,grosor);
            
        }

    }
    /**
     *  escribe n veces el caracter  indicado en 2 posiciones
     *  en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        String fila = "";
        for(int i = 0; n>i;i++){
         fila += caracter; 
        }
        System.out.println(fila);

    }
}
