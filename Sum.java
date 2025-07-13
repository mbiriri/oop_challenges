
public class Sum {
    public static int sum(int n) {
        if (n == 1) {
            System.out.println("n == 1 condition met. n = " + n);
            return 1;
        }else {
            int res = n + sum(n - 1);
            System.out.println("n = " + res);
            return res;
        }
    }

    public static void main(String[] args){
        System.out.print(sum(4));
    }
}