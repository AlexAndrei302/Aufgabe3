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

void main() {
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

