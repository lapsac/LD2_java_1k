import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("a=");
        a = sc.nextInt();
        System.out.print("b=");
        b = sc.nextInt();
        System.out.print("c=");
        c = sc.nextInt();
        sc.close();
        if (((a > b) && (a < c)) || ((a < b) && (a > c))) {
            System.out.print("Mediana ir: " + a);
        }
                else {
            if (((b > c) && (b < a)) || ((b < c) && (b > a))) {
                System.out.print("Mediana ir: " + b);
            }
                else {
                if (((c > a) && (c < b)) || ((c < a) && (c > b))) {
                    System.out.print("Mediana ir: " + c);
            }
                  else{
                    System.out.print("Mediana ir " +1);
                  }
                }
            }
        }
        }
