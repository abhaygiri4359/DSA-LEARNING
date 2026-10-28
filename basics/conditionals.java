import java.util.Scanner;

public class conditionals {
    static void main() {
       int streak =12;
       if(streak>=10)
       {
           System.out.println("good consistency");
       }
       int age=4;
       if(age>=18)
           System.out.println("you are eligible to vote");
       else {
           System.out.println("you are not eligible");
       }
        int day;
        System.out.println("enter the day");
        Scanner as =new Scanner(System.in);
        day=as.nextInt();
       if(day==1)
       {
           System.out.println("monday");
       }
       else if(day==3)
       {
           System.out.println("wednesday");
       }
       else if(day==4)
       {
           System.out.println("thursday");
       }else if(day==5)
       {
           System.out.println("fridayday");
       }else if(day==6)
       {
           System.out.println("saturday");
       }else if(day==7)
       {
           System.out.println("sunday");
       }
       else
       {
           System.out.println("wrong number");
       }
    }
}
