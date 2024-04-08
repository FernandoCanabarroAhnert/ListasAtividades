package LISTA4;

public class Ex2 {
    public static void main(String[] args) {
        int[] a = new int[11];
        for (int i = 1; i < a.length; i++) {
            a[i] += 10 * i;
            System.out.println(a[i]);
        }

    }
}
