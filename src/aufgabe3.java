// java
public class aufgabe3 {

    // 1) Addition zweier großer Zahlen (als Arrays)
    public int[] add(int[] a, int[] b) {
        int[] result = new int[a.length + 1];
        int carry = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result;
    }

    // 2) Subtraktion (a - b)
    public int[] subtract(int[] a, int[] b) {
        int[] result = new int[a.length];
        int borrow = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            int diff = a[i] - b[i] - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }

    // 3) Multiplikation mit einer einstelligen Zahl
    public int[] multiply(int[] a, int digit) {
        int[] result = new int[a.length];
        int carry = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            int prod = a[i] * digit + carry;
            result[i] = prod % 10;
            carry = prod / 10;
        }

        return result;
    }

    // 4) Ganzzahlige Division durch eine Ziffer
    public int[] divide(int[] a, int digit) {
        int[] result = new int[a.length];
        int remainder = 0;

        for (int i = 0; i < a.length; i++) {
            int current = remainder * 10 + a[i];
            result[i] = current / digit;
            remainder = current % digit;
        }

        return result;
    }

    private static void printNumber(int[] arr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < arr.length - 1 && arr[i] == 0) i++;
        for (; i < arr.length; i++) sb.append(arr[i]);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        aufgabe3 alg = new aufgabe3();

        int[] a = {1, 2, 3, 4}; // 1234
        int[] b = {5, 6, 7, 8}; // 5678

        int[] sum = alg.add(a, b);
        int[] diff = alg.subtract(b, a);
        int[] prod = alg.multiply(a, 9);
        int[] quot = alg.divide(b, 3);

        System.out.print("sum:    ");
        printNumber(sum);
        System.out.print("diff:   ");
        printNumber(diff);
        System.out.print("prod:   ");
        printNumber(prod);
        System.out.print("quot:   ");
        printNumber(quot);
    }
}
