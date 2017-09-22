public class Somemath extends Factorial {

    public int fact(int n)

    {
        if (n == 1)
        {
            return n;
        } else
        {
            n = n * fact(n - 1);
            return n;
        }

    }
}
