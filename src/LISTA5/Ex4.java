package LISTA5;

public class Ex4 {
    public static void main(String[] args) {
        int[][] m = new int[10][10];
        double ale;
        int l2 = 0, l4 = 0, l6 = 0, l8 = 0, l10 = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                ale = 1 + Math.random() * 9;
                m[i][j] = (int) ale;
                System.out.print(m[i][j] + " ");
                if (i == 1){
                    l2 += m[i][j];
                }
                if (i == 3){
                    l4 += m[i][j];
                }
                if (i == 5){
                    l6 += m[i][j];
                }
                if (i == 7){
                    l8 += m[i][j];
                }
                if (i == 9){
                    l10 += m[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.println("Soma das linhas pares: ");
        System.out.println("Linha 2 = " + l2);
        System.out.println("Linha 4 = " + l4);
        System.out.println("Linha 6 = " + l6);
        System.out.println("Linha 8 = " + l8);
        System.out.println("Linha 10 = " + l10);

    }
}
