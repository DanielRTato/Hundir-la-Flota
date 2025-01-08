/**
 * Juego de hundir la flota
 * @author  Daniel
 * @version  1.0
 *
 */
public class Main {
    /**
     * Función principal
     * @param args
     */
    public static void main(String[] args) {

        int [][] tablero;
        tablero = new int[][]{
                {1,1,0,0,0},
                {0,0,0,2,2},
                {1,0,0,0,1},
                {4,4,4,4,0},
                {1,0,0,1,0}};

        recorrerTablero(tablero);


    }
    /**
     * Recorre el tablero de juego.
     * Detecta las coordenadas que contienen naves y clasifica el tipo según el valor.
     *
     * @param aunx_tablero Matriz bidimensional que representa el tablero del juego. Cada valor
     *                     en la matriz indica el tipo de objeto en esa posición (0 para vacío,
     *                     otros valores para diferentes tipos de naves).
     */
    private static void recorrerTablero(int[][] aunx_tablero){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                int cordenada_actual = aunx_tablero[i][i];

                if (esNave(cordenada_actual)){
                    tipoDeNave(cordenada_actual,i,j);

                }
            }
        }
    }

    /**
     * Verifica si el valor de la coordenada representa una nave.
     * @param valor_cordenada Valor de la coordenada a verificar.
     *
     * @return true si el valor de la coordenada es mayor a 0, lo que indica que hay una nave.
     *         false en caso contrario.
     */
    public static boolean esNave(int valor_cordenada){
        if (valor_cordenada>0){
            return true;
        }else{ return false;
    }
    }

    /**
     * Identifica y muestra el tipo de nave según el valor de la coordenada proporcionada.
     *
     * @param valor_cordenada Valor de la coordenada que indica el tipo de nave.
     *                        1 representa un barco pequeño, 2 un buque y 4 un portaaviones.
     * @param x Coordenada X en el tablero donde se encuentra la nave.
     * @param y Coordenada Y en el tablero donde se encuentra la nave.
     */
    static void tipoDeNave(int valor_cordenada, int x, int y){
        switch (valor_cordenada){
            case 1-> System.out.println("Es un barco chiquito "+x +":"+ y);
            case 2-> System.out.println("Es u buque "+ x+ ":" + y );
            case 4-> System.out.println("Portaaviones " +  x+ ":" + y);
            default -> System.out.println("Error crítico");
        }
    }


}

