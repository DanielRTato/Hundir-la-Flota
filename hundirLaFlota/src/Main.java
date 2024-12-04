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
                int cordenada_actual = aunx_tablero[i][i];

                if (esNave(cordenada_actual)){
                    tipoDeNave(cordenada_actual,i,j);

                }
            }
        }
    }

    public static boolean esNave(int valor_cordenada){
        if (valor_cordenada>0){
            return true;
        }else{ return false;
    }
    }

    static void tipoDeNave(int valor_cordenada, int x, int y){
        switch (valor_cordenada){
            case 1-> System.out.println("Es un barco chiquito "+x +":"+ y);
            case 2-> System.out.println("Es u buque "+ x+ ":" + y );
            case 4-> System.out.println("Portaaviones " +  x+ ":" + y);
            default -> System.out.println("Error crítico");
        }
    }


}

