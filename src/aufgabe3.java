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
}
