package LISTA6;

public class Ex10 {
    public static void main(String[] args) {
        int[][] m = new int[7][9];
        matrizSoma(m);
    }
    static void matrizSoma(int[][] m){
        double ale;
        int somaM = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                ale = 10 + Math.random() * (99 - 10);
                m[i][j] = (int) ale;
                somaM += m[i][j];
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Soma da matriz = " + somaM);


    }
}
