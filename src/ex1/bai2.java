package ex1;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class bai2 {
    static long fibonaci(int n) {
        long f0 = 0, f1 = 1, fn = 0;
        if (n == 0 || n == 1) fn = n;
        else for (int i = 2; i<= n; i++){
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }

    static void display(){
        int n;
        Scanner Scanner = new Scanner(System.in);
        n = Scanner.nextInt();
        int cout = 0;
        for (int i = 0; i< n; i++)
        {
            System.out.println(" " + fibonaci(i));
            cout++;
            if (cout%10 == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
        display();
    }
}
