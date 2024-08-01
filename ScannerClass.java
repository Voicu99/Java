import java.util.Scanner;

public class ScannerClass
{
    public static void main(String[] args)
    {
        //System.out.println(Arrays.toString(args));
        //System.out.println("Age: " + args[0]);
        //System.out.println("Name: " + args[1]);
        //System.out.println("Color: " + args[2]);







//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Insert your name : ");
//        String myName = scanner.nextLine();
//
//        System.out.println("My name is " + myName);
//
//
//        System.out.println("Insert x : ");
//        int x = scanner.nextInt();
//
//        System.out.println("Insert y: ");
//        int y =scanner.nextInt();
//
//
//         int sum = x + y ;
//        System.out.println("x+y = " + sum);
//
//
//
//
//
//        scanner.close() ;

        //++ increment

//        int x = 1;
//        System.out.println("x = " + x);// 1
//        x = x+1;
//        System.out.println("x = " + x);// 2
//        x++;
//        System.out.println("x = " + x);// 3
//
//        System.out.println("x = " + ++x); // 4
//        System.out.println("x = " + x++); // 4
//
//        System.out.println("x = " + x); // 5

        int a,b;
        a = 3 ;
        b = 5 ;

        int c = a + b++; // sum a+b , b++ / b = b+1
        System.out.println("c = " + c);

        System.out.println("b = " + b);
        a--;
        System.out.println("a = " + a);

        int d = ++a + b--;
        System.out.println("d = " + d);


    }
}
