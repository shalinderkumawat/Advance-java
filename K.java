import java.util.*;
public class K {
    void show(){
        Scanner input=new Scanner (System.in);
        System.out.println("This program is show two numbers add:");
        System.out.println("Enter the frist value :");
        int num1=input.nextInt();
        System.out.println("Enter the second number value for add:");
        int numb2=input.nextInt();
        System.out.println( " The sum of a and b :"+(num1+numb2));
    }
    void show1(){
        Scanner input=new Scanner (System.in);
        System.out.println("This program is show two numbers subraction:");
        System.out.println("Enter the frist value :");
        int num1=input.nextInt();
        System.out.println("Enter the second number value for subraction:");
        int numb2=input.nextInt();
        System.out.println( " The subtraction of a and b :"+(num1-numb2));
    }
    void show2(){
        Scanner input=new Scanner (System.in);
        System.out.println("This program is show two numbers multiplication:");
        System.out.println("Enter the frist value :");
        int num1=input.nextInt();
        System.out.println("Enter the second number value for multiplication:");
        int numb2=input.nextInt();
        System.out.println( " The  multiplication of a and b :"+(num1*numb2));
    }
    void show3(){
        Scanner input=new Scanner (System.in);
        System.out.println("This program is show two numbers divide:");
        System.out.println("Enter the frist value :");
        int num1=input.nextInt();
        System.out.println("Enter the second number value for divide:");
        int numb2=input.nextInt();
        System.out.println( " The  divide of a and b :"+(num1/numb2));
    }
    void show4(){
        Scanner input=new Scanner (System.in);
        System.out.println("This program is show two numbers modluer:");
        System.out.println("Enter the frist value :");
        int num1=input.nextInt();
        System.out.println("Enter the second number value for modluer:");
        int numb2=input.nextInt();
        System.out.println( " The  modluer of a and b :"+(num1%numb2));
    }
    public static void main(String [] args)
    {
        K add=new K();
        add.show();
        add.show1();
        add.show2();
        add.show3();
        add.show4();
    }
}
