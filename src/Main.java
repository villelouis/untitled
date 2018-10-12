import java.util.Arrays;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 10l; ++i) {
            int[] a = get();
            shift(a, i);
            System.out.println(Arrays.toString(a));
        }
    }

    static int[] get() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        return a;
    }

    static void shift(int[] a, int c) {
        int n = a.length;
        c %= n;
        int x = a[n - 1];
        for (int j = 0, i = 2 * n - c; j +1 < n; ++j, --i) {
            a[i % n] = a[(i - c + n) % n];
        }
        a[0] = x;
    }
}
