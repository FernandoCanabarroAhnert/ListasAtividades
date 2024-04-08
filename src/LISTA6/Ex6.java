package LISTA6;

public class Ex6 {
    public static void main(String[] args) {
        int[] b = new int[10];
        preencherVetor(b);
    }
    static void preencherVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            if (i % 2 == 0){
                v[i] = 20;
            } else {
                v[i] = 10;
            }
            System.out.println(v[i]);
        }
    }
}
