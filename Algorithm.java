import java.util.*;
public class Algorithm {
    static int a = 0, b = 0;
    public Algorithm() {}
    static void sum(int n)
    {
        if (n <= 7)
            System.out.println("Impossible"
                    + " to form");
        if (n % 2 != 0) {

            Num(n - 5);

            System.out.println("2 3 " + a + " " + b);
        }
        else {
            Num(n - 4);
            System.out.println("2 2 " + a + " " + b);
        }
    }
    static int isPrime(int x)
    {

        int s = (int)Math.sqrt(x);

        for (int i = 2; i <= s; i++)
            if (x % i == 0)
                return 0;
        return 1;
    }
    static void Num(int x)
    {

        for (int i = 2; i <= x / 2; i++) {

            if (isPrime(i) != 0 && isPrime(x - i) != 0) {

                a = i;
                b = x - i;

                return;
            }
        }
    }
    static Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
    static Vector<Integer> tmp = new Vector<Integer>();

    static void permHelp(int n, int left, int k)
    {

        if (k == 0) {
            ans.add(tmp);
            for(int i = 0; i < tmp.size(); i++)
            {
                System.out.print(tmp.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int i = left; i <= n; ++i)
        {
            tmp.add(i);
            permHelp(n, i + 1, k - 1);
            tmp.remove(tmp.size() - 1);
        }
    }
    static void perm(int n, int k)
    {
        permHelp(n, 1, k);

    }
}
