USER INPUT 

	NO RETURN AND NO ARGUMENT 
Main class
add()
sub()
div()
multi()
mod()
main method :access
user input

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




Main
swap()
pallindrome()
neon()
armstrong()
perfect()
revrse()
sumofdigit()
count()
factorial()
fibonacci()
vowel()
gender()
email passwrod valid abc 123
table()
sumof even number
sum of odd number
main access


	import java.util.*;
public class K{
    void swap(){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a :");
        int a=input.nextInt();
        System.out.println("Enter the value of b :");
        int b=input.nextInt();
        System.out.println("The real value of a :"+a);
        System.out.println("The real value of b :"+b);

        a=(a+b);
        b=a-b;
        a=a-b;
        
        System.out.println("The swap value of a :"+a);
        System.out.println("The swap value of b :"+b);


    }
    void pallindrome()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value like palindromic number ");
        int value=input.nextInt();

        int temp=value;

        int rem,sum=0;

        while(value!=0)
        {
            rem=value%10;
            sum=sum*10+rem;
            value=value/10;
        }
        if(sum==temp){
        System.out.println("This number is palindromic number :"+sum);
        }
        else 
        {
            System.out.println("This number is not palindromic number ");
        }
    }

    void neon()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of square");
        int square=input.nextInt();
        int value =square*square;

        int temp=square;

        int rem,sum=0;

        while(value!=0)
        {
            rem=value%10;
            sum=sum+rem;
            value=value/10;
        }
        if(temp==sum)
        {
        System.out.println("This number is neon number :"+sum);
        }
        else 
        {
            System.out.println("This number is not  neon number ");
        }
    }
    void armstorng()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value like palindromic number ");
        int value=input.nextInt();

        int temp=value;

        int rem,sum=0;

        while(value!=0)
        {
            rem=value%10;
            sum=sum+rem*rem*rem;
            value=value/10;
        }
        
        System.out.println("This number is armstorng number :"+sum);
       
    }
    void perfect()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number of perfect :");
    int a=input.nextInt();
    int sum=0;
    int temp=a;
    
   
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
              sum=sum+i;  
            }
        }
   if(sum==temp){
    System.out.println("This number is perfect number :"+sum);
   }
   else 
   {
       System.out.println("This number is not perfect number ");
   }
    }

    void revers()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of revers");
        int square=input.nextInt();
        
       
        int rem,sum=0;

        while(square!=0)
        {
            rem=square%10;
            sum=sum*10+rem;
            square=square/10;
        }
        System.out.println("This number is revers :"+sum); 
    }

    void sumofdigit()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the sum of digit like 2 3 etc ");
        int a=input.nextInt();
        int count=0;

        int rem,sum=0;

        while(a!=0)
        {
            a=a/10;
          count++;

        }
        System.out.println( "The totel digit is :"+count);
    }
    void factorial()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the factorial number :");
        int fact=input.nextInt();
        int value=1;

        for(int i=1;i<=fact;i++)
        {
            value=value*i;
        }
        System.out.println("This number is factorial if :"+value);
    }

    void fibonacci()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the fibonacci number :");
        int need=input.nextInt();

        int start=0;
        int last=1;
        int sum;
        
        System.out.print(start+" ");
        System.out.print(last+" ");
        for(int i=1;i<=need;i++)
        {
            sum=start+last;
            System.out.print(sum +" ");
            start=last;
            last=sum;
        }
    }
    void vowel()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the any character in your keyboard :");
        char find=input.next().charAt(0);
        if(find=='a'||find=='e'||find=='i'||find=='o'||find=='u')
        {
            System.out.println("This character is vowel : "+find);
        }
        else 
        {
            System.out.print("This character is consonent : "+find);
        }

    }

    void gender()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your gender frist character ");
        char find=input.next().charAt(0);
        if(find=='m')
        {
            System.out.println("you are male");
        }
        else if(find=='f')
        {
            System.out.println("You are female :");
        }
        else 
        {
            System.out.println("you are other :");
        }
    }
    void email()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the your email");
        String email=input.nextLine();
        System.out.println("Enter the your password ");
        int password=input.nextInt();
        if(email=="shailendrakumawat699@gmail.com"&&password==12345)
        {
            System.out.println("valide");
        }
        else 
        {
            System.out.println("not match");
        }
    }
    void table()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the table number ");
        int table=input.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(table+"*"+i+"="+(i*table));
        }
    }
    void sumofeven()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter even number of last you need");
        int num=input.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            if(i%2==0)
        {
            sum=sum+i;
            System.out.println(sum);
        }
        }
    }
    void odd()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter odd number of last you need");
        int num=input.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            if(i%2!=0)
        {
            sum=sum+i;
            System.out.println(sum);
        }
        }  
    }
    
    public static void main(String [] args)
    {
        K sc=new K();
        sc.swap();  
        sc.pallindrome(); 
        sc.neon(); 
        sc.armstorng();    
        sc.perfect();
        sc.revers();
        sc.sumofdigit();
        sc.factorial();
        sc.factorial();
        sc.vowel();
        sc.gender();
        sc.email();
        sc.table();
        sc.sumofeven();
        sc.odd();


     }
}


class A
swap()
pallindrome()
class B
sumof even number
sum of odd number
class C
email passwrod valid abc 123
table()
class D
factorial()
fibonacci()
class E
armstrong()
perfect()
class Main
neon()
armstrong()
perfect()
main method access


import java.util.*;

 class A{
    void swap(){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a :");
        int a=input.nextInt();
        System.out.println("Enter the value of b :");
        int b=input.nextInt();
        System.out.println("The real value of a :"+a);
        System.out.println("The real value of b :"+b);

        a=(a+b);
        b=a-b;
        a=a-b;
        
        System.out.println("The swap value of a :"+a);
        System.out.println("The swap value of b :"+b);


    }
    void pallindrome()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value like palindromic number ");
        int value=input.nextInt();

        int temp=value;

        int rem,sum=0;

        while(value!=0)
        {
            rem=value%10;
            sum=sum*10+rem;
            value=value/10;
        }
        if(sum==temp){
        System.out.println("This number is palindromic number :"+sum);
        }
        else 
        {
            System.out.println("This number is not palindromic number ");
        }
    }
}
class B{
    void sumofeven()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter even number of last you need");
        int num=input.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            if(i%2==0)
        {
            sum=sum+i;
            System.out.println(sum);
        }
        }
    }
    void odd()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter odd number of last you need");
        int num=input.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            if(i%2!=0)
        {
            sum=sum+i;
            System.out.println(sum);
        }
        }  
    }
}
class C{
    void email()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the your email");
        String email=input.nextLine();
        System.out.println("Enter the your password ");
        int password=input.nextInt();
        if(email=="shailendrakumawat699@gmail.com"&&password==12345)
        {
            System.out.println("valide");
        }
        else 
        {
            System.out.println("not match");
        }
    }
    void table()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the table number ");
        int table=input.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(table+"*"+i+"="+(i*table));
        }
    }
}
class D{
    void factorial()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the factorial number :");
        int fact=input.nextInt();
        int value=1;

        for(int i=1;i<=fact;i++)
        {
            value=value*i;
        }
        System.out.println("This number is factorial if :"+value);
    }
    void fibonacci()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the fibonacci number :");
        int need=input.nextInt();

        int start=0;
        int last=1;
        int sum;
        
        System.out.print(start+" ");
        System.out.print(last+" ");
        for(int i=1;i<=need;i++)
        {
            sum=start+last;
            System.out.print(sum +" ");
            start=last;
            last=sum;
        }
    }
}
class E{
    void armstorng()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value like palindromic number ");
        int value=input.nextInt();

        int temp=value;

        int rem,sum=0;

        while(value!=0)
        {
            rem=value%10;
            sum=sum+rem*rem*rem;
            value=value/10;
        }
        
        System.out.println("This number is armstorng number :"+sum);
       
    }
    void perfect()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number of perfect :");
    int a=input.nextInt();
    int sum=0;
    int temp=a;
    
   
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
              sum=sum+i;  
            }
        }
   if(sum==temp){
    System.out.println("This number is perfect number :"+sum);
   }
   else 
   {
       System.out.println("This number is not perfect number ");
   }
    }
}


public class K
{
    void neon()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of square");
        int square=input.nextInt();
        int value =square*square;

        int temp=square;

        int rem,sum=0;

        while(value!=0)
        {
            rem=value%10;
            sum=sum+rem;
            value=value/10;
        }
        if(temp==sum)
        {
        System.out.println("This number is neon number :"+sum);
        }
        else 
        {
            System.out.println("This number is not  neon number ");
        }
    }
    void armstorng()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value like palindromic number ");
        int value=input.nextInt();

        int temp=value;

        int rem,sum=0;

        while(value!=0)
        {
            rem=value%10;
            sum=sum+rem*rem*rem;
            value=value/10;
        }
        
        System.out.println("This number is armstorng number :"+sum);
       
    }
    
    void perfect()
    {
        Scanner input=new Scanner (System.in);
        System.out.println("enter the number of perfect :");
    int a=input.nextInt();
    int sum=0;
    int temp=a;
    
   
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
              sum=sum+i;  
            }
        }
   if(sum==temp){
    System.out.println("This number is perfect number :"+sum);
   }
   else 
   {
       System.out.println("This number is not perfect number ");
   }
    }

    public static void main(String[] args)
    {
       
        A s=new A();
        s.swap();
        s.pallindrome();
        B sc=new B();
        sc.sumofeven();
        sc.odd();
        C sc1=new C();
        sc1.email();
        sc1.table();
        D sc2=new D();
        sc2.factorial();
        sc2.fibonacci();
        E sc3=new E();
        sc3.armstorng();
        sc3.perfect();
        K sck=new K();
        sck.neon();
        sck.armstorng();
        sck.perfect();
        
    }
}


-------------------------------------------------------------
	NO RETURN AND  ARGUMENT 
Main class
add()
sub()
div()
multi()
mod()
main method :access
user input
-----------------------------------------


import java.util.*;
public class K{
    void add(int a,int b)
    {
       System.out.println("The sum of a and b :"+(a+b));
    }
    void sub(int a,int b)
    {
       System.out.println("The subtraction of a and b :"+(a-b));
    }
    void div(int a,int b)
    {
       System.out.println("The divide of a and b :"+(a/b));
    }
    void multi(int a,int b)
    {
       System.out.println("The multiply of a and b :"+(a*b));
    }
    void modl(int a,int b)
    {
       System.out.println("The modluer of a and b :"+(a%b));
    }
    public static void main(String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the value of a :");

        int a=input.nextInt();
        System.out.println("Enter the value of b :");
        int b=input.nextInt();
        K sc=new K();
        sc.add(a,b);
        sc.sub(a,b);
        sc.div(a, b);
        sc.modl(a, b);
        sc.multi(a, b);


    }
}


Main
swap()
pallindrome()
neon()
armstrong()
perfect()
revrse()
sumofdigit()
count()
factorial()
fibonacci()
vowel()
gender()
email passwrod valid abc 123
table()
sumof even number
sum of odd number
main access




import java.util.*;

public class K {
    void swap(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The swap value of a :" + a);
        System.out.println("The swap value of b : " + b);
    }
    void pallindrome(int num)
    {
        int temp=num;
        int sum=0;
       while(num!=0)
       { int rem=num%10;
        sum=sum*10+rem;
        num=num/10;
       }
       if(temp==sum){
       System.out.println("This number is pallindron number : "+ sum);
       }
       else 
       {
        System.out.println("This number is not pallindorm number ");
       }
    }
    void neon(int num1)
    {
        int value=num1*num1;
        System.out.println("the square :"+value);
        int rem;
        int sum=0;
        int temp=num1;
        while (value!=0) {
            rem=value%10;
            sum=sum+rem;
            value=value/10;
            
        }
        if(sum==temp)
        {
            System.out.println("This number is neon number :"+sum);
        }
        else 
        {
            System.out.println("This number is not neon number :"+sum);
        }
    }
    void armstrong(int num2)
    {
        int rem,sum=0;
        int temp=num2;
        while (num2!=0)
        {
            rem=num2%10;
            sum=sum+rem*rem*rem;
            num2=num2/10;
        }
        if(sum==temp)
        {
            System.out.println("This number is armstrong number is :"+sum);
        }
        else 
        {
            System.out.println("This number not armstrong number :"+sum);
        }

    }
    void perfect(int per)
    {
        int sum=0;
        for(int i=1;i<per;i++)
        {
            if(per%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==per)
        {
        System.out.println("This number is perfect number "+sum);
        }
        else 
        {
            System.out.println("This number is not perfect number :"+sum);
        }
    }
    void revers(int revers)
    {
        int rem,sum=0;
        while(revers!=0)
        {
            rem=revers%10;
            sum=sum*10+rem;
            revers=revers/10;
        }
        System.out.println("The revers number is :"+sum);
    }
    void sumofdigit(int digit)
    {
        int rem,sum=0;
        for(int i=0;i<=digit;i++)
        {
           sum=sum+i; 
        }
        System.out.println("The sum of digite"+sum);
    }
    void count(int value)
    {
        int count=0;
        int rem;
        while(value!=0)
        {
            rem=value%10;
            count++;
            value=value/10;
        }
        System.out.println("The totel number of digite is :"+count);
    }

    void factorial(int fact)
    {
        int sum=1;
        for(int i=1;i<=fact;i++)
        {
            sum=sum*i;
        }
        System.out.println("The factorial is :"+sum);
    }

    void fibonacci(int fibonacci)
    {
        int frist=0;
        int last=1;
        int sum=0;
        System.out.print(frist+" ");
        System.out.print(last+" ");
        for(int i=0;i<=fibonacci;i++)
        {sum=frist+last;
            frist=last;
            last=sum;
            
            System.out.print(sum+" ");
        }
    }
    void vowal(char vowal)
    {
        if(vowal=='a'||vowal=='e'||vowal=='i'||vowal=='o'||vowal=='u')
        {
            System.out.println("This character is vowal :"+vowal);
        }
        else{
            System.out.println("This character is consonte :"+vowal);
        }
    }
    void gender(char gender)
    {
        if(gender=='m')
        {
            System.out.println("You are male");
        }
        else if(gender=='f')
        {
            System.out.println("You are female");
        }
        else
        {
            System.out.println("you are other ");
        }
    }

    void email(String email,int password)
    {
        if(email=="shailendrakumawat@gmail.con"&&password==12345)
        {
            System.out.println("This email is valide:");
        }
        else{
            System.out.println("This email is not match");
        }
    }

    void table(int table)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(table+"*"+table+"="+(i*table));        }
    }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = input.nextInt();
        System.out.println("Enter the value of b :");
        int b = input.nextInt();

        K sc = new K();
        sc.swap(a, b);

         System.out.println("Enter the number :");
         int num=input.nextInt();
         sc.pallindrome(num);

        System.out.println("Enter the neon number :");
        int  num1=input.nextInt();
        sc.neon(num1);

        System.out.println("Enter the armstrong number :");
        int num2=input.nextInt();
        sc.armstrong(num2);

        System.out.println("Enter the perfecet number :");
        int per=input.nextInt();
        sc.perfect(per);

        System.out.println("Enter the revers number :");
        int revers=input.nextInt();
        sc.revers(revers);

        System.out.println("Enter the sum of digite of last number ");
        int digit=input.nextInt();
        sc.sumofdigit(digit);

        System.out.println("Enter the digit of count :");
        int value=input.nextInt();
        sc.count(value);

        System.out.println("Enter the factorail value :");
        int fact=input.nextInt();
        sc.factorial(fact);

        System.out.println("Enter the fibonacci last number :");
        int fibonacci=input.nextInt();
        sc.fibonacci(fibonacci);

        System.out.println("Enter the any character in your keyboard :");
        char vowal=input.next().charAt(0);
        sc.vowal(vowal);

        System.out.println("Enter your gender frist latter :");
        char gender=input.next().charAt(0);
        sc.gender(gender);

        System.out.println("Enter your email and password:");
       String email=input.nextLine();
       int password=input.nextInt();
       sc.email(email,password);
       
       System.out.println("Entre the table number need:");
       int table=input.nextInt();
       sc.table(table);
       
       
       void sumofevennumber(int number )
    {
        int sum=0;
        for(int i=0;i<=number;i++)
        {
            if(i%2==0)
            {
                System.out.println(sum=sum+);
            }
        }
        System.out.println("The id normal newside:");
    }


    }
} 