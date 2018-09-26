package exception;

import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai canh a");
        int a = sc.nextInt();
        System.out.println("nhap do dai canh b");
        int b = sc.nextInt();
        System.out.println("nhap do dai canh c");
        int c = sc.nextInt();
        Exception calc = new Exception();
        calc.calculate(a, b, c);

    }

        private void calculate(int a, int b, int c) throws Exception{
        try {
            if(a > 0 && b > 0 && c > 0){
                System.out.println("dung");
            } else if (a + b > c && a + c > b && c + b > a){
                System.out.println("dung");
            } else {
                throw new Exception();
            }

        } catch (Exception e){
            System.err.println("sai");
        }
    }
}
