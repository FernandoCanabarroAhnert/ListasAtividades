package LISTA5;

public class Ex3 {
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        double ale;
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                ale = 1 + Math.random() * 9;
                m[i][j] = (int) ale;
                System.out.print(m[i][j] + " ");
                if (j == 0){
                    c1 += m[i][j];
                }
                if (j == 1){
                    c2 += m[i][j];
                }
                if (j == 2){
                    c3 += m[i][j];
                }
                if (j == 3){
                    c4 += m[i][j];
                }
                if (j == 4){
                    c5 += m[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.println("Soma de cada coluna: ");
        System.out.println("Coluna 1 = " + c1);
        System.out.println("Coluna 2 = " + c2);
        System.out.println("Coluna 3 = " + c3);
        System.out.println("Coluna 4 = " + c4);
        System.out.println("Coluna 5 = " + c5);

    }
}
