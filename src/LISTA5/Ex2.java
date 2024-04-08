package LISTA5;

public class Ex2 {
    public static void main(String[] args) {
        int[][] m = new int[6][8];
        int nl1 = 0, nl2 = 0, nl3 = 0, nl4 = 0, nl5 = 0, nl6 = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                double ale = -10 + Math.random() * (20);
                m[i][j] = (int) ale;
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
        int[] c = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == 0 && m[i][j] < 0){
                    nl1 += 1;
                    c[i] = nl1;
                }
                if (i == 1 && m[i][j] < 0){
                    nl2 += 1;
                    c[i] = nl2;
                }
                if (i == 2 && m[i][j] < 0){
                    nl3 += 1;
                    c[i] = nl3;
                }
                if (i == 3 && m[i][j] < 0){
                    nl4 += 1;
                    c[i] = nl4;
                }
                if (i == 4 && m[i][j] < 0){
                    nl5 += 1;
                    c[i] = nl5;
                }
                if (i == 5 && m[i][j] < 0){
                    nl6 += 1;
                    c[i] = nl6;
                }
            }
        }
        System.out.println("Quantidade de números negativos em cada linha: ");
        int n = 1;
        for (int i = 0; i < c.length; i++) {
            System.out.println("Linha " + n + " = " + c[i]);
            n++;
        }

    }
}
