/**
 *
 */
public class Main {
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
    private static void recorrerTablero(int[][] aunx_tablero){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (aunx_tablero[i][j]>0){
                    switch (aunx_tablero[i][j]){
                        case 1-> System.out.println("Es un barco chiquito "+i +":"+ j);
                        case 2-> System.out.println("Es u buque "+ i+ ":" + j );
                        case 4-> System.out.println("Portaaviones " +  i+ ":" + j);
                        default -> System.out.println("Error crítico");
                    }

                }
            }
        }
    }
}


