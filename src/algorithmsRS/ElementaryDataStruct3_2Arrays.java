package algorithmsRS;

public class ElementaryDataStruct3_2Arrays {

    public static void main(String[] args){

       /* The goal of this program is to print all the primes less than the integer
        given as a command-line argument*/
        primes(10);

    }

    public static void primes(int N) {


        boolean[] a = new boolean[N];
        for (int i = 2; i < N; i++){
            a[i] = true;
        }
        for (int i = 2; i < N; i++) {
            if (a[i] != false)
                for (int j = i; j * i < N; j++)
                    a[i * j] = false;
        }
        for (int i = 2; i < N; i++) {
            if (i > N - 100)
                if (a[i]) System.out.print(" " + i);
        }
        System.out.println();
    }

   
}
