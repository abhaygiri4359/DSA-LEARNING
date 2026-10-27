import jdk.swing.interop.SwingInterOpUtils;

public class operators {
    static void main() {
        //arithmatic operator
        int x=20;
        int y=34;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
       // logical operator

         boolean d=true,r=false;
        System.out.println(d&&r);
        System.out.println(d!=r);
        System.out.println(d||r);

        //short hand operator
        x+=300;
        System.out.println(x);
        x*=4;
        System.out.println(x);
        x-=500;
        System.out.println(x);


        // unary increment decreament operator
        int a=2;
        int b=+a;
        System.out.println(a);
        b=-a;
        System.out.println(b);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        System.out.println(a);




    }
}
