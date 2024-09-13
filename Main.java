// // class A{
// //     int a;
   
// //     A(int a)
// //     {
// //         this.a=a;
   
// //     }
// //     int show(){
// //         System.out.println(a);
// //         return a;
// //     }
// // }
// // public class Main{
// //     public static void main(String [] args)
// //     {
// //         int a=2;
           
// //         A sc= new A(a);
// //         sc.show();
// //     }
// //  }

// // multi level

// class A{
//     void shwo(){
//         System.out.println("This is A class");
//     }
// }
// class B extends A{
//     void show1(){
//         System.out.println("This is B class");
//     }
// }
// public class Main extends B{
//     public static void main(String[] args) {
//         System.out.println("This is only Main class ");
//         Main sc=new Main();
//         sc.shwo();

//         System.out.println("This is B class and Main class");

//         B s=new Main();
//         s.show1();
//         s.show1();

//         System.out.println("This is Only A class ");
//         A obj=new A();
//         obj.shwo();
//         System.out.println("This is Only B class");
//         B obj1=new B();
//         obj1.show1();
//         obj1.shwo();
        
//         System.out.println("This is only ");

//         A l=new B();
//     }
// }

// class A{
//     void show(){
//         System.out.println("This is A class");
//     }

// }
// class B extends A{
//     void show1(){
//         A sc=new A();
//         sc.show();
//         System.out.println("This is B class ");
//     }
// }

// public class Main extends A{
//     public static void main (String [] args)
//     {
//         System.out.println("This is only Main class ");
//         Main sc=new Main();
//         sc.show();
//         System.out.println("This is A class and Main class");
//         A s=new Main();
//         s.show();
//         System.out.println("This is B class and Main class");
//         A s1=new B();
//         s1.show();
//     }
// }

// class A{
//     void show(){
//         System.out.println("This is a class");
//     }
// }
// class B extends A{
//     void show(int b){
//         super.show();
//         System.out.println("This is b class");
//     }
// }

// public class Main extends B{
//     public static void main(String [] args)
//     {
//        Main sc=new Main();
      
//        k.show(9);


//     }
// }
// class A{
//     class B{
//         class C{
        
//             void show()
//                 {
//                     System.out.println("this is a clas");
//                 }
//         }
//     }
    
// }
// public class Main{
//     public static void main(String [] args)
//     {   // first way   
//         A.B.C scc=new A().new B(). new C();
//         // second way
//         A sc=new A();
//         A.B.C obj=sc.new B(). new C();
//         obj.show();
//     }
// }
// class A{
//     void show()
//     {
//         System.out.println("this is A class");
//     }
// }
// class B{
//     public static void main(...){
//         System.out.println("this is B class");
//     }
// }
// public class Main extends A{
//     public static void main(String [] args)
//     {
//         A sc=new A();
//         sc.show();
//         B cs=new B();
//         cs.main();
//     }
// }   
// import java.util.Stack;
// public class Main {
//     public static void main(String [] args)
//     {
//         Stack <Integer> sc=new Stack<>();
//         sc.push(10);
//         sc.push(20);
//         sc.push(30);
//         sc.push(40);
//         sc.push(50);

//         System.out.println(sc);
//         // 10,20,30,40,50
//         Stack <Integer> rt=new Stack<>();
//         while (sc.size()>0) {
//             int a=sc.pop();
//             rt.push(a);
//         }
//         // 50,40,30,20,10
//         System.out.println(rt);
//         Stack <Integer> si=new Stack<>();
//         while (rt.size()>0) {
//             int a=rt.pop();
//             si.push(a);
//         }
//         // 10,20,30,40,50
//         System.out.println(si);
//     }
// }
// class A{
//     void show(){
//         System.out.println("This is a class ");
     
//     }
// }
// class B extends A{
//     void show(){
//         // super.show();
//         System.out.println("This is B class");
//         super.show();
//     }
// }
// class C extends B{
//     void show(){
//         System.out.println("This is C class");
//         super.show();
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
        
//         C a=new C();
//         a.show();
//     }   
// }
// class A{
//     void show(){
//         System.out.println("Tihs is ");
//        return 0;
//     }
// }
// public class Main extends A{
//     int show(){
//         System.out.println("This is Main");
//         return 0;
//     }
//     public static void main(String [] args)
//     {
//         Main sc=new Main();
//         sc.show();
//     }
// }

// class A{
//     int a=90;
//     A(){
//         System.out.println("This");
//     }
// }
// class B extends A {
//     int a=89;
//     void shwo(){
//         System.out.println(a);
//         System.out.println(super.a);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         B sc=new B();
//         sc.shwo();
//     }
// }
// class A{
//      void show(){
//         System.out.println("this is A class");
//     }
// }
// public class Main extends A{
//       static void show(int a){
//         System.out.println("This is main");
//       }
//       public static void main(String[] args) {
//         Main sc=new Main();
//         sc.show();
//       }
// }

// import java.util.Scanner;
// class A{
//    final void show(int v){
//         Scanner input=new Scanner(System.in);
//         int a=input.nextInt();
//         System.out.println(a);
//         a=90;
//         System.out.println(a);
//         System.out.println("This si ");
//     }
//     int show(float m){
//         System.out.println("Thisi s");
//         return 0;
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         A sc=new A();
//         sc.show(2);
//     }
// }

// abstract class A{
//     void show(){
//         System.out.println("this is abstract method"); 
//     }
// }
// public class Main extends A{
//     public static void main(String[] args) {
//         A sc=new A() {
//             void show(){
//                 System.out.println("Tis");
//             }
//         };
//         sc.show();
//     }
// }

// class A {
//     abstract void show();
// }


// error

// public class Main extends A{
//     void show(){
//         System.out.println("This is abstract method");
//     }
//     public static void main(String [] args)
//     {
//         Main sc=new Main();
//         sc.show();
//     }
// }

// interface A{
//     // interface outer 1
//     interface B{
//         // interface inner 2
//         class C{
//             // class 
//                 void show(){
//                     System.out.println("C class");
//                 };
//         }
//     }
// }
// public class Main extends A.B.C{
//     // Main class
//     public static void main(String [] args)
//     {
//         // new obj C class 

//         A.B.C sc=new Main();
//         // call show method
//         sc.show();

//     }
// }
// public class Main{
//     // method
//     void show(){
//         // interface
//         interface A{
//            default void show1()
//            {
//             System.out.println("this is interface");
//            };
//         }
//        A sc=new A() {
//         public void show1()
//         {
//             System.out.println("this is new interface");
//         }
//        };
//        sc.show1();

//     }
//     public static void main(String [] args)
//     {
//         Main sc=new Main();
//         sc.show();;
//     }
// }

// class A extends Thread{
//     public void run(){
        
//         try{
//     System.out.println("this is a thread method");
//         }

//     catch(Exception scc)
//         {
//             System.out.println("This is new exception");
//         }
//     }
// }
// public class Main extends A{
//     public static void main(String[] args) {
//         // Thread sc=new Thread();
//          sc=new Thread();
//         sc.start();
//     }
// }
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Scanner;
// class Bike{
//    public static void Bikename(){
   
   
//     System.out.println("Enter your choice");

//         Scanner input=new Scanner(System.in);
//         int wich=input.nextInt();

//         int bikesneed=0;


//         int totelamount=0;
//             if(wich==1){
//                 System.out.print("Bike name: Bajaj"+"\n");
//                 System.out.println("Bike Rent per hour = 70RS");
//                 System.out.print("How many bike's need : ");
                
//                 Scanner inpu=new Scanner(System.in);
//                 bikesneed=inpu.nextInt();
                
//                  totelamount=bikesneed*70;
                

//             }
//             else if(wich==2){
//                 System.out.print("Bike name: TVS"+"\n");
//                 System.out.println("Bike Rent per hour = 70RS");
//                 System.out.print("How many bike's need");
                
//                 Scanner nput=new Scanner(System.in);
//                  bikesneed=nput.nextInt();

//                 totelamount=bikesneed*70;
                
//             }
//             else if(wich==3){
//                 System.out.print("Bike name: SPORT"+"\n");
//                 System.out.println("Bike Rent per hour = 70RS");
//                 System.out.print("How many bike's need");
               
//                 Scanner iput=new Scanner(System.in);
//                  bikesneed=iput.nextInt();

//                totelamount=bikesneed*70;
              

//             }
//             else if(wich==4){
//                 System.out.print("Bike name: KTM"+"\n");
//                 System.out.println("Bike Rent per hour = 70RS");
//                 System.out.print("How many bike's need");
                
//                 Scanner inut=new Scanner(System.in);
//                 bikesneed=inut.nextInt();

//                  totelamount=bikesneed*70;


//             }

//             System.out.println("Totel Amount : "+totelamount);
//             ArrayList<List> bike=new ArrayList<>();
//             bike.add(bikesneed);
//             bike.add(totelamount);

//             System.out.println(bike);
       
//     }
//     void ID(){
       
            
        
//         System.out.println("----------- Biike rent ----------");
//         Scanner input=new Scanner(System.in);



//         System.out.print("Enter your name :");
//         String name=input.nextLine();


//         System.out.print("Enter your NO. :");
//         long number=input.nextLong();


//         System.out.print("Enter your ID number :");
//         int ID=input.nextInt();
      
//         // add data

//         LinkedList scc=new LinkedList<>();
            
//             scc.add(name);
//             scc.add(number);
//             scc.add(ID);

//             // new line

//             System.out.println();
//             System.out.println();

//             // bikes name

//             System.out.println("THIS IS LIST OF BIKES");
//             System.out.println("Bike name: Bajaj = 1");
//             System.out.println("Bike name: tVS   = 2");
//             System.out.println("Bike name: SPORT = 3");
//             System.out.println("Bike name: KTM   = 4"); 
            
//             Bikename();
        
//     }
// }

// public class Main{
//     public static void main(String [] args){
//         Bike sc=new Bike();
//         sc.ID();
//     }
// }


// import java.util.ArrayList;
// import java.util.LinkedList;

// public class Main{
//     public static void main(String [] args)
//     {
//         ArrayList<String> sc=new ArrayList<>();
//         sc.add("null");
//         sc.add("null");
//         sc.add("1");
       
//         System.out.println(sc);
//         for(int i=0;i<sc.size();i++)
//         {
//             if(sc.get(i).equals("null"))
//             {
//                 sc.remove(sc.get(i));

//             }
           
//         }
//         System.out.println(sc);

//        LinkedList cs=new LinkedList<>(); 
//         cs.add(1);
//         cs.add('s');

//         System.out.println(cs);

//         LinkedList<Integer> s=new LinkedList<>();
//         s.add(1);
//         s.add(2);
//         s.add(0);
//         System.out.println("This is orignal"+s);
//         s.add(0,2);
//         System.out.println("This us add a new element by index number"+s);
//         s.remove(0);
//         System.out.println("This is remove by index number"+s);
//         int size=s.size();
//         System.out.println("This is size : "+size);
//         int getelement=s.getLast();
//         System.out.println("This is last element : "+getelement);
//         int firstelement=s.getFirst();
//         System.out.println("This is first element : "+firstelement);

//         System.out.println("print throw the for loop");
//         for(int i=0;i<s.size();i++)
//         {
//             System.out.print(s.get(i)+" , ");
//         }
//         System.out.println();
//         System.out.println("print thow the for each loop");
//         for(int i:s){
//             System.out.print(i+" , ");
//         }
//         int p=0;

//         while (size>0) {
//                 System.out.println(s.get(p));
//                 ++p;            
//         }

//     }
// }
// class A{
    
//     private A(){
//         System.out.println("this is a class ");
//     }

//    public static void show(){
//         System.out.println("This is new method"); 
        
//     }
// }
// public class Main {
//     public static void main(String [] args)
//         {
//            A.show();
//         }
// }



// public class Main{

//     public static void swap(a[])
//     public static void main(String[] args) {
//         int a[]={1,0,1,0,1,0,1};
//         for(int i=0;i<=a.length;i++)
//         {
//             if(a[i]==0)
//             {

//             }
//         }
//     }
// }
// import java.util.*;
// public class Main {

//     public static void main(String[] args) 
//         {
//             ArrayList<String> sc=new ArrayList<>();
//                 sc.add("hello");
//                 sc.add("hello");
//                 sc.add("1");
            
//                 System.out.println(sc);
//                 for(int i=0;i<sc.size();i++)
//                 {
//                     if(sc.get(i).equals("hello"))
//                     {
//                         sc.remove(sc.get(i));

//                     }
                
//                 }
//             System.out.println(sc);

//         }
// }


// public class Main 
// {
//     public static void main(String[] args)
//     {
//         int a[]={1,2,3,2,5};
//         {
//             for(int i=0;i<a.length;i++)
//             {
//                 for(int j=i+1;j<a.length;j++)
//                 {
//                     if(a[i]==a[j])
//                     {
//                         int temp=a[i];
//                     }
//                 }
//             }
//             for(int n=0;i<temp;n++)
//             {
//                 System.out.println(a[temp]);
//             }
//         }
//     }
// }

// class Node{
//     int data;
//     Node next;
//     public Node(int data){
//         this.data=data;
//     }
// }

// public class Main{
   
    
//     static void add(Node a)
//     {
//         Node temp=a;
//         Node head=null;
//         Node tail=null;
//         if(head==null)
//         {
//             head=temp;
//             tail=temp;
//         }    
//         else 
//         {
//             tail.next=temp;
//             tail=temp;
//         }
//     }
//     public static void dispaly(Node head){
//         Node temp=head;
//         while (temp!=null) {
//             System.out.println(temp.data);
//             temp=temp.next;            
//         }

//     }
//     public static void main(String[] args) {
//         Node a=new Node(1);
//         Node b=new Node(2);
//         Node c=new Node(3);
//         Node d=new Node(4);
//         Node e=new Node(5);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         e.next=null;


//         Node ne=new Node(0);
//         add(ne);
//         dispaly(a);
        
// }
// }

// class Node{
//     int data;
//     Node next;
//     public Node(int data){
//         this.data=data;
//     }
// }

// public class Main{

//     public static void add(Node tail)
//     {
//         Node ne=new Node(0);
//         Node temp=ne;
//         Node head=ne;
//         while (temp.next!=null) {
//             temp=temp.next;
//         }
//         if(temp.next==null)
//         {
//         temp.next=tail;
//         tail=temp;
        
//         }
//     }
   
//     public static void dispaly(Node head){
//         Node temp=head;
//         while (temp!=null) {
//             System.out.println(temp.data);
//             temp=temp.next;            
//         }

//     }
//     public static void main(String[] args) {
//         Node a=new Node(1);
//         Node b=new Node(2);
//         Node c=new Node(3);
//         Node d=new Node(4);
//         Node e=new Node(5);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         e.next=null;
//         dispaly(a);
       
    
//         add(a);
// }
// }

 

// import java.util.*;
// class Stack{
//     int a[]=new int[10];
//     int index;
//     void push(int val)
//     {
//         a[index]=val;
//         index++;
//     }
//     int getindex(){
//         return index;
//     }
//     void peek(){
//         System.out.println(a[index-1]);
//     }

//     void print(){
//         for(int i=0;i<index;i++){
//             System.out.println(a[i]);
//         }
//     }

// }
// public class Main{
//     public static void main(String [] args)
//     {
//         Stack sc=new Stack();
//         sc.push(1);
//         sc.push(2);

//         // get index this array

//         System.out.println("this is index"+sc.getindex());

//         // peek element get throw the method
//         System.out.println("This is peek element ");

//        sc.peek();

//        System.out.println("print the all element ");
//        sc.print();

//     }
// }

// import java.util.*;
// import java.util.Stack;

// public class Main {
//     public static boolean isBalanced(String str) {
//         Stack<Character> st = new Stack<>();
//         int n = str.length();
//         for (int i = 0; i < n; i++) {
//             char ch = str.charAt(i);
//             if (ch == '(') {
//                 st.push(ch);
//             } else {
//                 // when bracket will be closing
//                 if (st.size() == 0) {
//                     return false;
//                 }
//                 if (st.peek() == '(') {
//                     st.pop();
//                 }
//             }

//         }
//         if (st.size() > 0) {
//             return false;
//         } else
//             return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
//         System.out.println(isBalanced(name));
//     }
// }

// import java.util.Stack;

// public class Main{
//     public static void main(String [] args)
//     {
//         Stack <Integer> sc=new Stack<>();
//         sc.add(1);
//         sc.add(2);
//         sc.add(3);
//         sc.add(4);

//         System.out.println(sc);

//         System.out.println("insert element at the bottom of the stack and at any index");
//         sc.add(3, 45);
//         System.out.println(+sc);
//     }
// }

// import java.util.Stack;
// public class Main{
//     public static void main(String [] args)
//     {
//         Stack<Integer> sc=new Stack<>();
//         sc.add(1);
//         sc.add(2);
//         sc.add(3);
//         sc.add(4);

//         for(int i:sc)
//         {
//             System.out.print(i+" ");
//         }
//     }
// }

// import java.util.Stack;
// public class Main{
//     public static void main(String [] args)
//     {
//         Stack <Integer> sc=new Stack<>();
//         sc.add(1);
//         sc.add(2);
//         sc.add(3);
//         sc.add(4);

//         System.out.println(sc);

//         sc.pop();
//         System.out.println("This is remove one"+sc);
//         sc.pop();
//         System.out.println("This is remove two"+sc);
//         sc.pop();
//         System.out.println("This is remove three"+sc);
//         sc.pop();
//         System.out.println("This is remove four"+sc);
//         sc.pop();
//         System.out.println(sc);
//     }
// }


// public class Main{
//     public static void swap(int a[],int i)
//     {
//         int temp=a[i];
//         a[i]=a[i+1];
//         a[i+1]=temp;
//     }
//     public static void main(String [] args)
//     {
//         int a[]={1,0,1,0,1,0};

//         System.out.println("this is real value");
//         for(int i=0;i<a.length-1;i++)
//         {
//             System.out.println(a[i]);
//         }
//         for(int i=0;i<a.length-1;i++)
//         {
//             if(a[i]==1)
//             {
//                 swap(a, i);
//             }
//         }
//         System.out.println("After");
//         for(int i=0;i<a.length-1;i++)
//         {
//             System.out.println(a[i]);
//         }
//     }

// }
// public class Main{
//     public static void swap(int a[],int i,int j)
//     {
//         int temp=a[i];
//         a[i]=a[j];
//         a[j]=temp;
//     }
//     public static void main(String [] args)
//     {
//         int a[]={1,0,1,0,1,0};

//         System.out.println("this is real value");
//         for(int i=0;i<a.length-1;i++)
//         {
//             System.out.println(a[i]);
//         }
//         for(int i=0;i<a.length-1;i++)
//         {
//             for(int j=i+1;j<a.length;j++)
//             {
//             if(a[i]==1)
//             {
//                 swap(a, i,j);
//             }
//         }
//         }
//         System.out.println("After");
//         for(int i=0;i<a.length-1;i++)
//         {
//             System.out.println(a[i]);
//         }
//     }

// }

// public class Main{
//     public static void main(String [] args)
//     {
//         int a[]={1,3,2,1,8,6,3,4,10};
//         int num[]=new int[a.length];
        
//         for(int i=0;i<a.length;i++)
//         {
//             num[i]=-1;
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[j]>a[i])
//                 {
//                     num[i]=a[j];
//                     break;
//                 }
//             }
//         }
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(num[i]+" ");
//         }
//         System.out.println();
//         for(int i=0;i<num.length;i++) {

//             System.out.print(num[i]+" ");
            
//         } 
        
//     }
// }
// public class Main{
//     public static void main(String [] args)
//     {
//         int a[]={1,3,2,8,6,4,2,1};
//         int b[]=new int[a.length];
//         for(int i=0;i<a.length;i++)
//         {
//             b[i]=-1;
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[j]>a[i])
//                 {
//                     b[i]=a[j];
//                     break;
//                 }
//             }
//         }
//         for(int i=0;i<b.length;i++)
//         {
//             System.out.print(b[i]+" ");
//         }
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         int a[]={1,3,2,8,6,9,2,1,10};
//         int b[]=new int[a.length];
//         for(int i=0;i<a.length;i++)
//         {
//             b[i]=-1;
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[j]>a[i])
//                 {
//                     b[i]=a[j];
//                     break;
//                 }
//             }

//         }
//         for(int i=0;i<b.length;i++)
//         {
//             System.out.print(b[i]+" ");
//         }
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         int a[]=new int[10];
//         for(int i=0;i<a.length;i++)
//         {
//             if(i%2==0)
//             {
//                 System.out.print(a[i]+" ");
//             }
//         }
//     }
// }
// import java.util.Vector;
// public class Main{
//     public static void main(String [] args)
//     {
//         Vector <Integer> sc=new Vector<>();
//         sc.add(1);
//         sc.add(2);
//         sc.add(3);
//         sc.add(4);
//         sc.add(5);

//         System.out.println(sc);

//         System.out.println("index value add : ");
//         sc.add(3,90);

//         System.out.println("index"+sc);

        
//         System.out.println("Remove by index value");

//         sc.remove(1);
//         System.out.println(sc);

//         System.out.println("Get element by index : ");
//         System.out.print(sc.get(2));

//         System.out.println();
//         int size=sc.size();
//         System.out.println("This is size : "+size);


//     }
// }
// public class Main{
//     public static void swap(int a[],int i,int j)
//     {
//         int temp=a[i];
//         a[i]=a[j];
//         a[j]=temp;
//     }
//     public static void main(String [] args)
//     {
//         int a[]={4,5,0,1,9,0,5,0};
//         int b=1;
//         for(int i=0;i<a.length;i++)
//         {
//            for(int j=i+1;j<a.length;j++)
//            {
//             if(a[i]==0)
//             {
//                 swap(a, i,j);
//             }
//            }
//         }
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
// }
// import java.util.Stack;
// public class Main{
//     public static void Main(String [] args)
//     {
//         Stack<Integer> s = new Stack<Integer>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);

//         while () {
            
//         }
        
//     }
// }

// public class Main{
//    public static class Node {
//     int data;
//     Node next;
//     Node (int data)
//     {
//         this.data=data;
//     }
//    }
//    public static void prit(Node head)
//    {
//      Node temp=head;
//      while (temp!=null) {
//         System.out.println(temp.data);
//         temp=temp.next;
//      }
//    }
//    public static void main(String[] args) {
//     Node a = new Node(1);
//     Node b=new Node(2);
//     Node c=new Node(3);
//     Node d=new Node(4);

//     a.next=b;
//     b.next=c;
//     c.next=d;
//     d.next=null;

//     prit(a);
//    }
// }

// 08-08-2024
// linkedlist in simple

// public class Main{
//    public static class Node{
//       int data;
//       Node next;
//       Node(int data)
//       {
//          this.data=data;
//       }
//    }
//    public static class Linkedlist{
//       Node head=null;
//       Node tail=null;
//       void insert(int val)
//       {
//          Node temp=new Node(val);
//          if(head==null)
//          {
//             head=temp;
//             tail=temp;
//          }
//          else{
//             tail.next=temp;
//             tail=temp;
//          }
//       }
//       void display(){
//          Node temp=head;
//          while (temp!=null) {
//             System.out.println(temp.data);
//             temp=temp.next;
//          }
//       }
//       void get(int index)
//       {
//          Node temp=head;
//          for(int i=0;i<index;i++)
//          {
//             System.out.print(temp.data);
//             temp=temp.next;
//          }
//          System.out.println(temp.data);
//       }
//    }
//    public static void main(String [] args)
//    {
//       Node a=new Node(1);
//       Node b=new Node(2);
//       Node c=new Node(3);
//       Node d=new Node(4);

//       a.next=b;
//       b.next=c;
//       c.next=d;
//       d.next=null;

//       Linkedlist sc=new Linkedlist();
//       sc.insert(0);
//       sc.insert(1);
//       sc.insert(3);

      

//       sc.get(2);
//    }
// }





// public class Main{
//    public static class Node {
//       int data;
//       Node next;
//       Node (int data)
//       {
//          this.data=data;
//       }
//    }

//    public static class Linklist{
//       Node head=null;
//       Node tail=null;
//       void insert(int value)
//       {
//          Node temp=new Node(value);
//          if(head==null)
//          {
//             head=temp;
//             tail=temp;
//          }
//          else {
//             tail.next=temp;
//             tail=temp;
//          }
//       }
//       void display(){
//          Node temp=head;
//          while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp=temp.next;
//       }
//    }
//    void findindexvalue(int index)
//    {
//       int size=0;
//       Node temp=head;
//      while (temp.next!=null) {
//            System.out.println("your pric i s");
     
//            System.out.print;break;
//            temp=temp.next;
//          }

//    }
// }
//    public static void main(String [] args)
//    {
//       Linklist sc=new Linklist();
//       sc.insert(0);
//       sc.insert(1);
//       sc.insert(3);
//       sc.insert(4);

//       sc.display();
//       System.out.println();
//       sc.findindexvalue(4);
//    }
// }




// 09-08-2024

// linkedlist 
// throw the Node 

// public class Main {
//    public static class Node {
//       int data;
//       Node next;
//       Node(int data) {
//          this.data = data;
//          this.next = null; 
//       }
//    }

//    public static class LinkedList {
//       Node head = null;
//       Node tail = null;

//       void insert(int value) {
//          Node temp = new Node(value);
//          if (head == null) {
//             head = temp;
//             tail = temp;
//          } else {
//             tail.next = temp;
//             tail = temp;
//          }
//       }


//       public void add(Node a,int index)
//       {
//          Node temp=a;
//          Node t=head;
//          Node tailenode=null;
//          for(int i=0 ; i<index ; i++)
//          {
//             t=t.next;
//          }
//          t.next=temp;
//          tailenode.next=temp;
//          tailenode=t;
//       }

//       public void index(int index) {
//          Node temp = head;
//         for(int i=0;i<index-1;i++)
//         {
//             temp=temp.next;
//         }
//         System.out.println(temp.data);
//       }
//       public void display(){
//           Node temp=head;
          
//           while(temp!=null)
//           {
//               System.out.print(temp.data);
//               temp=temp.next;
//           }
//       }public int size(){
//           Node temp=head;
//           int size=0;
//           while(temp!=null)
//           {
//               size++;
//               temp=temp.next;
//           }
//           return size;  
//       }
//    }

//    public static void main(String[] args) {
//       LinkedList sc = new LinkedList();
//       sc.insert(0);
//       sc.insert(1);
//       sc.insert(2);
//       sc.index(2);
      
      
//       sc.display();
//       System.out.println();
      
      
//       System.out.println("this is size of linklist : "+sc.size());


//       System.out.println();


//       System.out.println("This is insert at index value");

//       Node a=new Node(23);


//       sc.add(a, 2);
      
//    }
// }




// insert a element a index



// public class Main{
//     public static class Node {
//         int data;
//         Node next;
//         Node (int data)
//         {
//             this.data=data;
//         }
//     }
//     public static class LinkedList {
    
//         Node head=null;
//         Node taile=null;
//         void insert(int val)
//         {
//             Node temp=new Node(val);
//             if(head==null)
//             {
//                 head=temp;
//                 taile=temp;
//             }
//             else {
//                 taile.next=temp;
//                 taile=temp;
//             }
//         }

//         void insertAt(int value,int index)
//         {
//             Node t=new Node(value);
//             Node temp=head;
//             for(int i=0;i<index;i++)
//             {
//                 temp=temp.next;
//             }
//             t.next=temp.next;
//             temp.next=t;
//          }
       
        

//          void display()
//         {
//             Node temp=head;
//             while(temp!=null)
//             {
//                 System.out.print(temp.data+" ");
//                 temp=temp.next;
//             }
//         }

//     }

//     public static void main(String [] args)
//     {
       


//         LinkedList sc=new LinkedList();
//         sc.insert(1);
//         sc.insert(2);
//         sc.insert(3);
//         sc.insert(4);
//         sc.insert(5);


        

//         sc.insertAt(290,2);

//        sc.display();
//     }
// }


// delete Node 


// public class Main{
//     public static class Node {
//         int data;
//         Node next;
//         Node (int data)
//         {
//             this.data=data;
//         }
//     }
//     public static class Linklist{
//         Node head=null;
//         Node tail=null;
//         void inset(int value)
//         {
//             Node temp= new Node(value);
//             if(head==null)
//             {
//                 head=temp;
                
//             }
//             else 
//             {
//                 tail.next=temp;
            
//             }
//             tail=temp;
//         }

//         void insertAt(int index, int value)
//         {
//             Node t=new Node(value);
//             Node temp=head;
//             for(int i=0;i<index-1;i++)
//             {
//                 temp=temp.next;
//             }
//             t.next=temp.next;
//             temp.next=t;

//         }

//         void delete(int index)
//         {
//             Node temp=head;
//             for(int i=0;i<index;i++)
//             {
//                 temp=temp.next;
//             }
//             temp.next=temp.next.next;
            
//         }

//         void display(){
//             Node temp=head;
//             while (temp!=null) {
//                     System.out.println(temp.data);
//                     temp=temp.next;            
//                 }
//         }
//     }
//     public static void main(String [] args)
//     {
//         Linklist sc=new Linklist();
//         sc.inset(0);
//         sc.inset(1);
//         sc.inset(2);
//         sc.inset(3);
//         sc.inset(4);
//         sc.inset(5);

//         System.out.println("After");
//         sc.display();
//         System.out.println("Befor");
//         sc.insertAt(2,78);
//         sc.display();

//         System.out.println("This is delet");
//         sc.delete(2);
//         sc.display();
//     }


// }


// double linklist

// public class Main{
//     public static class Node {
//         int data;
//         Node next;
//         Node pervious;
//         Node (int data)
//         {
//             this.data=data;
//         }
//     }

//     public static void main(String [] args)
//     {
//         Node a=new Node(0);
//         Node b=new Node(1);
//         Node c=new Node(2);
//         Node d=new Node(3);
//         Node e=new Node(4);
//         a.next=b;
//         a.pervious=null;
//         b.next=c;
//         b.pervious=a;
//         c.next=d;
//         c.pervious=b;
//         d.next=e;
//         d.pervious=c;
//         e.next=null;

//         Node temp=a;

//         while (temp!=null) {
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
//     }
// }



// public class Main{
//     public static class Node {
//         int data;
//         Node next;
//         Node previous;
//         Node (int data)
//         {
//             this.data=data;
//         }
//     }
//     public static class Linklist{
//         Node head=null;
//         Node tail=null;
//         public void inset(int data)
//         {
//             Node temp=new Node(data);
//             if(head==null)
//             {
//                 head=temp;
                
//             }
//             else{
//                 tail.next=temp;
//                 temp.previous=tail;

//             }
//             tail=temp;
//         }
//         void dispaly(){
//             Node temp=head;
//             while(temp!=null){
//                 System.out.println(temp.data);
//                 temp=temp.next;
                
//             }
//         }
//     }
//     public static void main(String [] args)
//     {
//         Linklist sc=new Linklist();

//         sc.inset(1);
//         sc.inset(2);
//         sc.inset(3);

//         sc.dispaly();
//     }
// }


// insert at a indext


// public class Main{
//     public static class Node {
//         int data;
//         Node next;
//         Node (int data)
//         {
//             this.data=data;
//         }
//     }
//     public static class Linklist
//         {
//                     Node head=null;
//                     Node tail=null;
//                     public void inset(int data)
//                     {
//                         Node temp=new Node(data);
//                         if(head==null)
//                         {
//                             head=temp;
                            
//                         }
//                         else{
//                             tail.next=temp;
                           
            
//                         }
//                         tail=temp;
//                     }

//                     void inserhead(int value)
//                     {
//                         Node t=new Node(value);
//                         Node temp=head;
//                         if(temp==null)
//                         {
//                            t.next=head; 
//                         }
//                         else{
//                             t.next=temp;
//                             head=t;
//                         }
//                     }
//                     void dispaly(){
//                             Node temp=head;
//                             while(temp!=null){
//                              System.out.println(temp.data);
//                             temp=temp.next;                                                
//                      }
//                     }
                            
//         }
//         public static void main(String [] args)
//             {
//                 Linklist sc=new Linklist();
        
//                 sc.inset(1);
//                 sc.inset(2);
//                 sc.inset(3);
//                 sc.inserhead(50);
//                 sc.dispaly();
//             }
// }


// public class Main{
//     public static class Node {
//         int data;
//         Node next;
//         Node previous;
//         Node (int data)
//         {
//             this.data=data;
//         }
//     }
//     public static class Linklist{
//         Node head=null;
//         Node tail=null;
//         public void insert(int value)
//         {
//             Node temp=new Node(value);
//             if(head==null)
//             {
//                 head=temp;
//                 tail=temp;
//             }
//             else{
//                 tail.next=temp;
//                 temp.previous=tail;
//                 tail=temp;
//             }
//         }

//         public void insertAt(int index  ,  int val)
//         {
//             Node t=new Node(val);
//             Node temp=head;
//             for(int i=0;i<index-1;i++)
//             {
//                 temp=temp.next;
//             }
           
//             temp.previous=t.next;
//             temp.next=t;
//         }

//         public void display(){
//             Node temp=head;
//             while(temp!=null)
//                 {
//                     System.out.println(temp.data);
//                     temp=temp.next;
//                 }
//         }
//     }
//     public static void main(String [] args)
//     {
//         Linklist sc=new Linklist();
//         sc.insert(0);
//         sc.insert(1);
//         sc.insert(2);
//         sc.insert(3);

//         sc.display();

//         System.out.println("insert At index");
//         sc.insertAt(1, 100);
//         sc.display();
//     }
// }
// import java.util.ArrayList;
// public class Main{
//     public static void main(String [] args)
//     {
//         ArrayList<Integer> sc=new ArrayList<>();
       
//         for (int i=0;i<=5;i++)
//         {
//             sc.add(calclute(i));
//         }
       
        

//         for (int i=0;i<sc.size();i++)
//         {
//             System.out.println(sc.get(i));
//         }
//     }
//     public static int calclute(int value)
//     {
//         int val=0;
//         for(int i=1;i<value;i++)
//         {
//             System.out.println(val+"");
//             val=i*value;
//         }
//        return val;
//     }
// }


// public class Main{
//     public static void main(String [] args)
//     {
//         for(int i=1;i<=5;i++)
//         {
//             System.out.println(i+" fact "+ i+"*"+i);
//         }
//     }
// }
// import java.util.ArrayList;
// public class Main{
//     public static void main(String [] args)
//     {
        
//         ArrayList<Integer> sc=new ArrayList<>();
//         for(int i=1;i<=5;i++)
//         {
//             sc.add(i);
//         }
//         int size=sc.size();
//         int fact=1;
//         for(int i=1;i<=size-1;i++)
//         {
//             fact=fact*sc.get(i);
//             System.out.println(sc.get(i)+" fact "+"i"+"="+fact);
//         }
        
//     }
// }
// import java.lang.reflect.Array;
// import java.util.ArrayList;
// public class Main{
//     public static void main(String [] args)
//     {
//         ArrayList<Integer> sc=new ArrayList<>();
//         for(int i=1;i<=5;i++)
//         {
//             sc.add(i);
//         }
//         for(int i=0;i<sc.size();i++)
//         {
//             if(sc.get(i)%2==0)
//             {
//                 System.out.println("This is even number : "+sc.get(i));
//             }
//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         ArrayList<Integer> sc=new ArrayList<>();
        
//         Scanner s=new Scanner(System.in);
//         int length=s.nextInt();
//         for(int i=0;i<length;i++)
//         {
//             System.out.println("Enter the value of : "+ i);
//             sc.add(s.nextInt());
//         }
//         int sum=0;
//         int rem=0;
       
//         for(int i=0;i<sc.size();i++)
//         {
//             int num=sc.get(i);
//             int n=num;
        
//         while (num!=0) {
//             rem=num%10;
//             sum=sum+rem*rem*rem;
//             num=num/10;            
//         }
//         if(sum==n)
//         {
//             System.out.println("This is armstong number");
//             System.out.println(sum);
//         }
//         else 
//         {
//             System.out.println("This number is not armstong ");
//             System.out.println(sum);

//         }
//     }
//     }
// }

// import java.util.ArrayList;
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         ArrayList<Integer> sc=new ArrayList<>();
       
//         for(int i=0;i<=4;i++)
//         {
//             sc.add(input.nextInt());
//         }
//         for(int i=0;i<sc.size();i++)
//         {
//             int sum=0;
//             int rem=0;
//             int num=sc.get(i);
//             int n=num;
//             while (num!=0)
//             {
//                 rem=num%10;
//                 sum=sum*10+rem;
//                 num=num/10;
//             }
//             if(sum==n)
//             {
//                 System.out.println("This number is palindrome number : "+ sum);
//             }
//             else
//             {
//                 System.out.println("This number is not palindrome number : "+ sum);

//             }
//         }
//     }
// }

// public class Main{
//     public static class Node {
//         int data;
//         Node next;
//         Node (int data)
//         {
//             this.data=data;
//         }
//     }
//     public static class Linklist{
//         Node head=null;
//         Node tail=null;
//         public void insert(int value)
//         {
//             Node temp=new Node(value);
//             if(head==null)
//             {
//                 head=temp;
//             }
//             else{
//                 tail.next=temp;
//             }
//             tail=temp;
//         }
//         public void insertAt(int index,int value)
//         {
//             Node t=new Node(value);
//             Node temp=head;
//             for(int i=0;i<index-1;i++)
//             {
//                 temp=temp.next;
//             }
//             t.next=temp.next;
//             temp.next=t;

//         }
//         void delete(int index)
//         {
//             Node temp = head;
//             if(index==0)
//             {
//                 temp=head.next;
//                 head=temp;
                
//             }
//             for(int i=0;i<index-1;i++)
//             {
//                 temp = temp.next;
//             }
//             temp.next = temp.next.next;
//         }
        
//         public void dispaly(){
//             Node temp=head;
//             while(temp!=null)
//             {
//                 System.out.println(temp.data);
//                 temp=temp.next;
//             }
            
//         }
        
//     }
   
//     public static void main(String [] args)
//     {
//         Linklist sc=new Linklist();
//         for(int i=1;i<=5;i++)
//         {
//             sc.insert(i);
//         }
//         sc.dispaly();
//         System.out.println("After");
//         sc.insertAt(2,89);
//         sc.dispaly(

//         );
//         System.out.println("Delete");
//         sc.delete(3);
//         sc.dispaly();
//         System.out.println("peek value ");
//         sc.peek();
//     }
// }
// public class Main{
//     public static class Arraylist{
//         int a[];
//         int size;
//         public Arraylist(){
//             size=0;
//             a=new int[10];
//             }
//             public void add(int data){
//                 if(size==a.length){
//                         int temp[]=new int[a.length*2];
//                         for(int i=0;i<a.length;i++){
//                             temp[i]=a[i];
//                             }
//                             a=temp;
//                             }
//                             a[size]=data;
//                             size++;
//                             }   
//                             public void display()
//                             {
//                                 for (int i=0;i<a.length;i++)
//                                 {
//                                     System.out.print(a[i]+" ");
//                                 }
//                             }
//     }
//     public static void main(String [] args)
//     {
//         Arraylist sc=new Arraylist();
//         for(int i=1;i<=5;i++)
//         {
//             sc.add(i);
//         }
//         sc.display();
        
//     }
// }
// import java.util.ArrayList;
// public class Main{
//     public static void main(String [] args)
//     {
//         ArrayList<Integer> sc=new ArrayList<>();
//         for(int i=1;i<=50;i++)
//         {
//             sc.add(i);
//         }
//         int fact=1;
//         for(int i=0;i<sc.size();i++)
//         {
//             fact=fact*sc.get(i);
//             System.out.println("This i fact :" +fact);
//         }
//         int a=0;
//         int b=1;
//         for(int i=0;i<sc.size();i++)
//         {
//             a=sc.get(i)
//            int sum=a+b;
//         }

//     }
// }

// import java.util.ArrayList;
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         ArrayList<Integer> sc=new ArrayList<>();
        
//         Scanner s=new Scanner(System.in);
//         int length=s.nextInt();
//         for(int i=0;i<length;i++)
//         {
//             System.out.println("Enter the value of : "+ i);
//             sc.add(s.nextInt());
//         }
//         for(int i=0;i<sc.size();i++)
//         {
//             System.out.println(sc.get(i));
//         }
//         int sum=0;
//         int rem=0;
       
//         for(int i=0;i<sc.size();i++)
//         {
//             int num=sc.get(i);
//             int n=num;
        
//         while (num!=0) {
//             rem=num%10;
//             sum=sum+rem*rem*rem;
//             num=num/10;            
//         }
//         if(sum==n)
//         {
//             System.out.println("This is armstong number");
//             System.out.println(sum);
//         }
//         else 
//         {
//             System.out.println("This number is not armstong ");
//             System.out.println(sum);

//         }
//     }
//     }
// }
// public class Main{
//     public static void swap(int a[],int i,int j)
//     {
//         int temp=a[i];
//         a[i]=a[j];
//         a[j]=temp;
//     }
//     public static void display(int a[])
//     {
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
//     public static void main(String [] args)
//     {
//         int a[]={1,0,1,2,1,0,1};
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[j]==0)
//                 {
//                     swap(a, i, j);
//                 }
//                 else if(a[i]==2)
//                 {
//                     swap(a, i, j);
//                 }
//             }
            
//         }
//         Main.display(a);
//     }
// }


// public class Main{
//     public static void swap(int a[],int i,int j)
//     {
//         int temp=a[i];
//         a[i]=a[j];
//         a[j]=temp;
//     }
//     public static void print(int a[])
//     {
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
//     public static void main(String [] args)
//     {
//         int a[]={1,3,2,4,1,2,43,63,9,90};
//         for(int i=0;i<a.length-1;i++)
//         {
//             for(int j=i+1;j<a.length;j++)
//             {
//             if(a[i]>=a[j])
//             {
//               swap(a, i ,j);
//             }
//         }
//         }
//         Main.print(a);
//     }
// }


// public class Main{
//     public static void main(String [] args)
//     {
//         int a[][]={{1,2,3},{4,5,6},{7,8,9}};
//          for(int i=0;i<a.length-1;i++)
//          {
//             for(int j=0;j<a.length-1;j++)
//             {
//                 if(a[i][j]<a[i+1][j+1])
//                 {
//                 int temp=a[i][j];
//                 a[i][j]=a[i+1][j+1];
//                 a[i+1][j+1]=temp;
//                 }
//             }
//             System.out.println();
//          }
//          for(int i=0;i<a.length;i++)
//          {
//             for(int j=0;j<a.length;j++)
//             {
//                 if(a[i][j]<a[i+1][j+1])
//                 {
//                 System.out.print(a[i][j]+" ");
//                 }
//             }
//             System.out.println();
//          }
         
//     }
// }

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
// import java.util.*;
// public class Main{
//     public static void main(String [] args)
//     {
//         String input="633ht533";
//         String re="[0-9]{3}[a-z]{2}[0-9]{3}";
//         Pattern p=Pattern.compile(re);
//         Matcher m=p.matcher(input);
//         if(m.find()&&m.group().equals(input))
//         {
//             System.out.println("valide");
//         }
//         else 
//         {
//             System.out.println("not");
//         }
//     }
// }

// public class Main{
//     public static int main(String [] arss)
//     {
//         int a[]={2,7,11,15};
//         int target=9;
//         int other[]=new int[a.length];
//         for(int i=0;i<a.length-1;i++)
//         {
//             for(int j=i+1;j<a.length;j++)
//             {
//             if(target==(a[i]+a[j]))
//             {
//                 other[j]=j;
                
//             }
            
//             }
            
//         }
//         return other;    
//     }
// }

// public class Main{
//     public  static boolean isPalindrome(int x) {
//         int num=x;
//         int rem=0;
//         int sum=0;
//         int n=num;
//         while(num>0)
//         {
//             rem=num%10;
//             sum=sum+10*rem;
//             num=num/10;
//         }
//         if(sum==num)
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }
//     public static void main(String [] args)
//     {
//         int num=121;
//         int rem,sum=0;
//         int n=num;
//         Main.isPalindrome(num);
//         while(num>0)
//         {
//             rem=num%10;
//             sum=sum*10+rem;
//             num=num/10;
//         }
//         if(sum==n)
//         {
//             System.out.println("true");
//         }
//         else
//         {
//             System.out.println("fals");
//         }
//     }
// }
// 
// public class Main{

//     public static boolean isPalindrome(int x) {
//         int num=x;
//         int sum,rem=0;
//         sum=0;
//         while (num>0) {
//             rem=num%10;
//             sum=sum*10+rem;
//             num=num/10;
//         }
//         if(sum==x)
//         {
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
       
//       System.out.print(Main.isPalindrome(1221));

//     }
// }

// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int a=input.nextInt();
//         System.out.println(a);
//         System.out.println("Enter the float value ");
//         float b=input.nextFloat();
//         System.out.println(b);
//         System.out.println("Enter the value long ");
//         long c=input.nextLong();
//         System.out.println(c);
//         System.out.println("Enter the value of double ");
//         double d=input.nextDouble();
//         System.out.println(d);
//         System.out.println("Enter the char");
//         char e=input.next().charAt(0);
//         System.out.println(e);
//         System.out.println("Enter the String value ");
//         String f=input.nextLine();
//         System.out.println("Enter the value of boolean");
//         boolean g=input.nextBoolean();
//         System.out.println(g);

//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         System.out.println("Enter the number of a");
//         int a=input.nextInt();
//         System.out.println("Enter the value of b");
//         int b=input.nextInt();
//         int c=a+b;
//         System.out.println(c);

//     }
// }
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {   
//         Scanner input=new Scanner (System.in);
//         System.out.println("Enter the number of a");
//         int a=input.nextInt();
//         System.out.println("Enter the value of b");
//         int b=input.nextInt();
      
//         System.out.println("This is + "+(a+b));
//         System.out.println("This is - "+(a-b));
//         System.out.println("This is * "+a*b);
//         System.out.println("This is / "+a/b);
//         System.out.println("This is % "+a%b);
//     }
// }

// 4. Write a C program to enter length and breadth of a rectangle and find its

// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter the length of ");
//         int length=input.nextInt();
//         System.out.println("Enter the width of ");
//         int width=input.nextInt();

//         int perimeter=(length+width)*2;
//         System.out.println(perimeter);
//     }
// }

// 5. Write a C program to enter length and breadth of a rectangle and find its area.
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter the length of ");
//         int length=input.nextInt();
//         System.out.println("Enter the value of width");
//         int width=input.nextInt();
//         int area=length*width;
//         System.out.println(area);
//     }
// }


// 6. Write a C program to enter radius of a circle and find its diameter, circumference
// and area.
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         int radius=input.nextInt();
//         double circumference = 2*(3.14/radius);
//         System.out.println("circumference : "+circumference);
//         double area = (3.14/radius*radius);
//         System.out.println("area : "+area);

//     }
// }

// 7. Write a C program to enter length in centimeter and convert it into meter and
// kilometer.
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter the value of centimeter : ");
//         float centimeter=input.nextFloat();
//         float meter = (centimeter/100);
//         System.out.println("meter : "+ meter);
//         float kilometer = (centimeter/100000);
//         System.out.println("kilometer"+ kilometer);

//     }
// }

// 8. Write a C program to enter temperature in Celsius and convert it into Fahrenheit.


// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter the value of celsius : ");
//         int celsius=input.nextInt();
//         float Fahrenheit=(celsius * 9/5) + 32 ;
//         System.out.println("Fahrenheit : "+Fahrenheit);
//     }
// }

// 9. Write a C program to enter temperature in Fahrenheit and convert to Celsius


// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter the value of celsius : ");
//         int Fahrenheit=input.nextInt();
//         float celsius=(Fahrenheit - 32) * 5/9;
//         System.out.println("celsius : "+celsius);
//     }
// }


// 10. Write a C program to convert days into years, weeks and days.

// import java.util.Scanner;
// public class Main 
// {
//     public static void main(String args[])
//     {
//         int m, year, week, day;
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the number of days:");
//         m = s.nextInt();
//         year = m / 365;
//         m = m % 365;
//         System.out.println("No. of years:"+year);
//         week = m / 7;
//         m = m % 7;
//         System.out.println("No. of weeks:"+week);
//         day = m;
//         System.out.println("No. of days:"+day);
//     }
// }

// 11. Write a C program to find power of any number x ^ y.?


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter base (x): ");
//         int base = scanner.nextInt();

//         System.out.print("Enter exponent (y): ");
//         int exponent = scanner.nextInt();

//         int result = 1;

//         for (int i = 1; i <= exponent; i++) {
//             result =result * base; // Multiply result by base in each iteration
//         }

//         System.out.println("Result: " + result);
//     }
// }


// 12.Write a C program to enter any number and calculate its square root.

// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         System.out.println("Enter the number ");
//         int n=input.nextInt();
//         int x= n/2;
//         int Guess=x;
//         Guess=1/2*(Guess+n/Guess);
//         System.out.println("Guess"+Guess);
//     }
// }


// 12.Write a C program to enter any number and calculate its square root.


// 13.Write a C program to enter two angles of a triangle and find the third angle.

// Ans)

// public class Main{
//     public static void main(String [] args)
//     {
//         int first=23;
//         int second=32;
//         int third=180-(first+second);
//         System.out.println("This is third side : "+third);
//     }
// }

// 14.Write a C program to enter base and height of a triangle and find its area.

// public class Main{
//     public static void main(String [] args)
//     {
//         int base=6;
//         int height=4;
//         long area=base*height*1/2;
//         System.out.println("This is Area of tringle : "+area);
//     }
// }

// 15.Write a C program to calculate area of an equilateral triangle.


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the side of the equilateral triangle: ");
//         double side = scanner.nextDouble();

//         double area = (Math.sqrt(3) / 4) * side * side;

//         System.out.println("Area of the equilateral triangle: " + area);
//     }
// }



// 16.Write a C program to enter marks of five subjects and calculate total, average
// and percentage.

// public class Main{
//     public static void main(String [] args)
//     {
//         int hindi=45;
//         int english=56;
//         int maths=78;
//         int science=90;
//         int social=67;
//         int total=hindi+english+maths+science+social;
//         int average=total/5;
//         double percentage=(double)total/500*100;
//         System.out.println("This is Total of five subject : "+total);
//         System.out.println("percentage : "+percentage);
//     }
// }

// 17.Write a C program to enter P, T, R and calculate Simple Interest.



// 18.Write a C program to enter P, T, R and calculate Compound Interest.



// 19.Write a C program to find maximum between two numbers.

// Ans)

// public class Main{
//     public static void main(String [] args)
//     {
//         int first=23;
//         int second=300;
//         int three=2;

//         if(first>second&&first>three)
//         {
//             System.out.println("First number is grater than : "+first);
//         }
//         else if(second>first||second>three)
//         {
//             System.out.println("second number is grater than : "+second);
//         }
//         else if(three>second&&three>first)
//         {
//             System.out.println("last number is grater than : "+three);
//         }
//     }
// }

// 21.Write a C program to check whether a number is negative, positive or zero.
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         System.out.println("Enter the number : ");
//         int a=input.nextInt();
//         if(a==0)
//         {
//             System.out.println("number is zero : "+a);
//         }
//         else if(a>0)
//         {
//             System.out.println("Number is positive : "+a);
//         }
//         else 
//         {
//             System.out.println("number is negitive : "+a);
//         }
//     }
// }


// 22.Write a C program to check whether a number is divisible by 5 and 11 or not.


// public class Main{
//     public static void main(Stirng [] args)
//     {
//         int number = 6;
//         if(number%5==0||number%11==0)
//         {
//             System.out.println("Number is divisibul 5 and 11  : "+number);
//         }
//         else 
//         {
//             System.out.println("Number is not divisibul 5 and 11 : "+number);
//         }
//     }
// }

// 23.Write a C program to check whether a number is even or odd.


// public class Main{
//     public static void main(String [] args)
//     {
//         int number =23;
//         if(number%2==0)
//         {
//             System.out.println("This number is even number : "+number);
//         }
//         else {
//             System.out.println("This number is odd number : "+number);
//         }
//     }
// }

// 24.Write a C program to check whether a year is leap year or not.

// public class Main{
//     public static void main(String [] args)
//     {
//         int year=2024;
//         if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//         {
//             System.out.println("This is leap year : "+year);
//         }
//         else 
//         {
//             System.out.println("this is not leap year : "+year);
//         }
//     }
// }

// 25.Write a C program to check whether a character is alphabet or not.


// public class Main{
//     public static void main(String [] args)
//     {
//         String a="1";
//         if(a.matches("[0-1]"))
//         {
//             System.out.println("This is alphabet : "+a);
//             }
//         else if(a.matches("[a-z][A-Z]")){
//            System.out.println("This is character : "+a);
//         }
                
//     }
// }

// 26.Write a C program to input any alphabet and check whether it is vowel or
// consonant.

// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         char a=input.next().charAt(0);
//         if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
//         {
//             System.out.println("This is vowel : "+a);
//         }
//         else if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
//         {
//             System.out.println("This is vowel : "+a);

//         }
//         else 
//         {
//             System.out.println("This is consonant : "+a);
//         }
//     }
// }

// 27.Write a C program to input any character and check whether it is alphabet, digit
// or special character.

// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         String a=input.next();
//         if(a.matches("[a-zA-Z]"))
//         {
//             System.out.println("This is alphabat : "+a);
//         }
//         else if(a.matches("[0-9]"))
//         {
//             System.out.println("This is number : "+ a);
//         }
//         else 
//         {
//             System.out.println("This is special character : "+a);
//         }
//     }
// }

// 28.Write a C program to check whether a character is uppercase or lowercase
// alphabet.

// public class Main{
//     public static void main(String [] args)
//     {
//        char a='a';
//        if(a>='a'&&a<='z')
//        {
//         System.out.println("This is lower case  : "+a);
//        }
//        else if(a>='A'&&a<='Z')
//        {
//         System.out.println("this is upper case characters : "+a);
//        }
//        else 
//        {
//         System.out.println("nothing ");
//        }
//     }
// }

// 29.Write a C program to input week number and print week day.

// public class Main{
//     public static void main(String [] args)
//     {
//         int number=3;
//         switch(number)
//         {
//             case 1:
//             System.out.println("Monday");
//             break;
//             case 2:
//             System.out.println("Tuesday");
//             break;
//             case 3:
//             System.out.println("Wednesday");
//             break;
//             case 4:
//             System.out.println("Thursday");
//             break;
//             case 5:
//             System.out.println("Friday");
//             break;
//             case 6:
//             System.out.println("Saturday");
//             break;


//             case 7:
//             System.out.println("Sunday");
//             break;
            
//             default:
//             System.out.println("Invalid number");
//             }
//         }
//     }


// 30.Write a C program to input month number and print number of days in that
// month.

// public class Main{
//     public static void main(String [] args)
//     {
//         int number=4;
//         switch(number)
//         {
//             case 1:
//             System.out.println("january");
//             break;
//             case 2:
//             System.out.println("february");
//             break;
//             case 3:
//             System.out.println("march");
//             break;
//             case 4:
//             System.out.println("april");
//             break;
//             case 5:
//             System.out.println("may");
//             break;
//             case 6:
//             System.out.println("june");
//             break;
//             case 7:
//             System.out.println("july");
//             break;
//             case 8:
//             System.out.println("August");
//             break;
//             case 9:
//             System.out.println("september");
//             break;
//             case 10:
//             System.out.println("october");
//             break;
//             case 11:
//             System.out.println("November");
//             break;
//             case 12:
//             System.out.println("December");
//             break;
//             default:
//             System.out.println("Invalid month");
//             }
        
//     }
// }

// 31.Write a C program to count total number of notes in given amount.

// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         System.out.println("Enter the amount : ");
//         int amount=input.nextInt();
//         System.out.println("Amount : "+amount);
//         int notes=0;
//         for(int i=0;i<amount;i+=10)
//         {
//             notes++;
//         }
//         System.out.println("Totel Notes : "+notes);
//     }
// }

// 37.Write a C program to input marks of five subjects Physics, Chemistry, Biology,
// Mathematics and Computer. Calculate percentage and grade according to
// following:
// Percentage >= 90% : Grade A
// Percentage >= 80% : Grade B
// Percentage >= 70% : Grade C
// Percentage >= 60% : Grade D
// Percentage >= 40% : Grade E
// Percentage < 40% : Grade F

// public class Main{
//     public static void main(String [] args)
//     {
//         int Physics=90;
//         int Chemistry=45;
//         int Biology=89;
//         int Mathematics=70;
//         int Computer=60;

//         int totelnumber=Physics+Chemistry+Biology+Mathematics+Computer;
//         int percentage=totelnumber/5;
//         System.out.println("percentage : "+percentage);
//         System.out.println("totelnumber"+totelnumber);

//         if(percentage<40)
//         {
//             System.out.println("Grade F");
//         }
//         else if(percentage >=45 && percentage<=41)
//         {
//             System.out.println("Grade E");
//         }
//         else if(percentage >= 60&&percentage<=41)
//         {
//             System.out.println("Grade D");
//         }
//         else if(percentage >= 70 && percentage<61)
//         {
//             System.out.println("Grade C");
//         }
//         else if(percentage<=71 && percentage >= 80  )
//         {
//             System.out.println("Grade B");
//         }
//         else if(percentage >= 90 && percentage<=91)
//         {
//             System.out.println("Grade A");
//         }
       
//     }
// }

// 42.Write a C program to check whether an alphabet is vowel or consonant using
// switch case.

// public class Main{
//     public static void main(String [] args)
//     {
//         char a='a';
//         switch (a) {
//             case 'a':
//                 System.out.println("vowal");
//                 break;
//             case 'e':
//                 System.out.println("vowal");
//                 break;
//             case 'i':
//                 System.out.println("vowal");
//                 break;
//             case 'o':
//                 System.out.println("vowal");
//                 break;
//             case 'u':
//                 System.out.println("vowal");
//                 break;
        
//             default:
//             System.out.println("consonant");
//                 break;
//         }
//     }
// }

// 43.Write a C program to find maximum between two numbers using switch case.

// public class Main{
//     public static void main(String [] args)
//     {
//         String numb="maix";
//         switch (numb) {
//             case "maix":
//             int first=2;
//             int second=90;
//             if(first>second)
//             {
//                 System.out.println("this is maix : "+first);
//             }
//             else 
//             {
//                 System.out.println("This is maix : "+second);
//             }
//                 break;
        
//             default:
//             System.out.println("Sorry nothing");
//                 break;
//         }
//     }
// }

// 44.Write a C program to check whether a number is even or odd using switch case.

// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         System.out.println("Enter the what you want : ");
//         String value=input.next();

//         System.out.println("Enter the number :");
//         int num=input.nextInt();
        
//         switch (value) {
//             case "even":
                      
//                        if(num%2==0)
//                        {
//                         System.out.println("this number is even number : "+num);
//                        }
//                        else 
//                        {
//                         System.out.println("this numebr is not even number : "+num);
//                        }

//                 break;
//             case "odd":
                      
//                        if(num%2==0)
//                        {
//                         System.out.println("this number is odd number : "+num);
//                        }
//                        else 
//                        {
//                         System.out.println("this numebr is not odd number : "+num);
//                        }

//                 break;
        
//             default:
//                 break;
//         }
//     }
// }

// 45.Write a C program to check whether a number is positive, negative or zero using
// switch case.
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         System.out.println("Enter the number like zero and positive number : ");
//         String value=input.next();

        
//         System.out.println("Enter String type text like what you want :");
//         int num=input.nextInt();
//         switch (value) {
            
           
//             case "positive":
//                 if(num<0)
//                 {
//                     System.out.println("This number is positive number : "+num);
//                 }
//                 break;
//             case "zero":
//                 if(num==0)
//                 {
//                     System.out.println("This number is zero number : "+num);
//                 }
//                 break;
//             case "negative":
//                 if(num>0)
//                 {
//                     System.out.println("This number is negative  number : "+num);
//                 }
//                 break;
//             default:
//                 break;
//         }
//     }
// }





// 47.Write a C program to create Simple Calculator using switch case.
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         System.out.println("                                   This is Calculator                           ");
//         System.out.println("Enter the first value ");
//         int first=input.nextInt();
//         System.out.println("Enter the value of second : ");
//         int second=input.nextInt();
//         System.out.println("Enter the Symbol + - * % / :");
//         String num=input.next();
//         switch (num) {
//             case "+":
//                 System.out.println(first+second);
//                 break;
//             case "-":
//             System.out.println(first-second);
//             break;

//             case "*":
//             System.out.println(first*second);
//             break;

//             case "/":
//             System.out.println(first/second);
//             break;

//             case "%":
//             System.out.println(first%second);
//             break;

//             default:
//             System.out.println("Enter the rigth value");
//                 break;
//         }
//     }
// }

// 48.Write a C program to print all natural numbers from 1 to n. - using while loop

// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner (System.in);
//         System.out.println("Enter the number : ");
//         int number=input.nextInt();
       
//         while (0<number) {
//             System.out.println(number);
//             number++;
//         }
//     }
// }


// 49.Write a C program to print all natural numbers in reverse (from n to 1). - using
// while loop

// public class Main{
//     public static void main(String [] args)
//     {
//         int n=1;
        
//         while(n<=10)
//         {
//             System.out.println(n);
//             n++;
//         }
//     }
// }


// 50.Write a C program to print all alphabets from a to z. - using while loop

// Ans)
// public class Main{
//     public static void main(String [] args)
//     {
//         char a='a';
//         while(a<='z')
//         {
//             System.out.println(a);
//             a++;

//         }
//     }
// }

// 51.Write a C program to print all even numbers between 1 to 100. - using while loop

// Ans)
// public class Main{
//     public static void main(String [] args)
//     {
//         int n=0;
//         while (n!=100) {
//             if(n%2==0)
//             {
//                 System.out.println(n);
//             }
//             n++;
//         }
//     }
// }
// 52.Write a C program to print all odd numbers between 1 to 100. -
// using while loop
// Ans)

// public class Main{
//     public static void main(String [] args)
//     {
//         int n=1;
//         while (n!=101) {
//             System.out.println(n++);
//         }
//     }
// }

// 53.Write a C program to find sum of all natural numbers between 1 to n.

// Ans)

// public class Main{
//     public static void main(String [] args)
//     {
//         int a=1;
//         int n=10;
//         int sum=0;
//         while (a<=n) {
//             sum=sum+a;
//             a++;
//             System.out.println(sum);
//         }
//         System.out.println("Sum : "+sum);

//     }
// }

// 54.Write a C program to find sum of all even numbers between 1 to n.

// Ans)




// public class Main{
//     public static void main(String [] args)
//     {
//         int a=1;
//         int n=10;
//         int sum=0;
//         while (a<=n) {
//             if(a%2==0)
//             {
//             sum=sum+a;
            
//             System.out.println(sum);
//             }
//             a++;
//         }
//         System.out.println("Sum : "+sum);

//     }
// }


// 55.Write a C program to find sum of all odd numbers between 1 to n.

// public class Main{
//     public static void main(String [] args)
//     {
//         int a=1;
//         int n=10;
//         int sum=0;
//         while (a<=n) {
//             if(a%2!=0)
//             {
//                 sum=+a;
//                 System.out.println(sum);

//             }
//             a++;
//         }
//         System.out.println("Totel odd sum : "+sum);
//     }
// }

// 56.Write a C program to print multiplication table of any number.
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         int num=input.nextInt();
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(num+" * "+i+" = "+(num*i));
//         }
//     }
// }

// 57.Write a C program to count number of digits in a number.

// public class Main{
//     public static void main(String [] args)
//     {
//         int num=12435;
//         int count=0;
//         int rem=0;
//         while(num!=0)
//         {
//             rem=num%10;
//             count++;
//             num=num/10;
//         }
//         System.out.println("This is digite : "+count);
//     }
// }

// 58.Write a C program to find first and last digit of a number.
// import java.util.*;
// public class Main{
//     public static void main(String [] args)
//     {
//         int num=12133333;
//         int rem=0;
//        while (num!=0) {
//         rem=num%10;
//         if(rem==num)
//         {
//             System.out.println("First digit of number is : "+rem);
//         }
//             num=num/10;
//         }

//         int nu=1213335;
//         int re=0;
//         while (nu!=0) {
//             re=nu%10;
//             if(nu==num)
//             {
//             }
//             else{
//                 System.out.println("This is last number : "+re);
//                 break;
//             }
            
//             nu=nu/10;
//        }
//     }
// }

// 59.Write a C program to find sum of first and last digit of a number.

// public class Main{
//     public static void main(String [] args)
//     {
//         int num=102;
//         int rem=0;
//         int first=0;
//         while (num!=0) {
//             rem=num%10;
//             if(rem==num)
//             {
//                 first=rem;
//             }
//             num=num/10;
//         }
//         int nu=102;
//         int re=0;
//         int second=0;
//         while (nu!=0) {
//             re=nu%10;
//             if(nu==num)
//             {
               
//                 }
//                 else{
//                     second=re;
//                     break;
//                     }
//                     nu=nu/10;
//                     }
//                     System.out.println("This is first number : "+first);
//                     System.out.println("This is second number : "+second);
//                     System.out.println("The sum of first and second number : "+(first+second));
//     }
// }

// 60.Write a C program to swap first and last digits of a number.

// public class Main{
   
//     public static void main(String [] args)
//     {
//        int a[]={1,2,3,4,5};
    
//            int temp=a[0];
//             a[0]=a[a.length-1];
//             a[a.length-1]=temp;
           
        
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
// }



// 61.Write a C program to calculate sum of digits of a number.

// public class Main{
//     public static void main(String [] args)
//     {
//         int num=1234;
//         int rem=0;
//         int sum=0;
//         while (num!=0) {
//             rem=num%10;
//             sum=sum+rem;
//             num=num/10;
            
//         }
//         System.out.println("Totel sum number : "+sum);
        
//     }
// }


// 62.Write a C program to calculate product of digits of a number.

// public class Main{
//     public static void main(String [] arg)
//     {
//         int number = 123;
//        int product=1;
//         int rem=0;
//         while(number!=0)
//         {
//             rem=number%10;
//             product=product*rem;
//             number=number/10;
//         }
//         System.out.println("product : "+product);
//     }
// }

// 63.Write a C program to enter a number and print its reverse.

// public class Main{
//     public static void main(String [] args)
//     {
//         int num=102;
//         int rem=0;
//         while (num!=0) {
//             rem=num%10;
//             num=num/10;
//             System.out.print(rem);
//         }
//     }
// }

// 64.Write a C program to check whether a number is palindrome or not.


// public class Main{
//     public static void main(String [] agrs)
//     {
//         int num=101;
//         int rem=0;
//         int temp=num;
//         int sum=0;

//         while (num!=0) {
//             rem=num%10;
//             sum=sum*10+rem;
//             num=num/10;
//         }
//         if(sum==temp)
//         {
//             System.out.println("This is palindrom number : "+sum);
//         }
//         else 
//         {
//             System.out.println("This is not palindrom number : "+sum);
//         }
//     }
// }

// 65.Write a C program to find frequency of each digit in a given integer.


// public class Main{
//     public static void main(String [] args)
//     {

//     }
// }


// 66.Write a C program to enter a number and print it in words.
// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         int num=input.nextInt();
//         switch (num) {
//             case 0:
//                 System.out.println("Zero");
//                 break;
//             case 1:
//             System.out.println("one");
//                 break;
//                 case 2:
//                 System.out.println("Two");
//                 break;
//                 case 3:
//                 System.out.println("Three");
//                 break;
//                 case 4:
//                 System.out.println("Four");
//                 break;
//                 case 5:
//                 System.out.println("Five");
//                 break;
//                 case 6:
//                 System.out.println("Six");
//                 break;
//                 case 7:
//                 System.out.println("Seven");
//                 break;
//                 case 8:
//                 System.out.println("Eight");
//                 break;
//                 case 9:
//                 System.out.println("Nine");
//                 break;
//                 default:
//                 System.out.println("Invalid number");
//                 break;
//         }
//     }
// }


// 67.Write a C program to print all ASCII character with their values.

// public class Main{
//     public static void main(String [] args)
//     {
       
//         for(int num=0;num<=127;num++)
//         {
//             char a=(char)num;
        
//             System.out.println(a);
            
//         }
//     }
// }

// 68.Write a C program to find power of a number using for loop.

// public class Main{
//     public static void main(String [] args)
//     {
//         int base=2;
//         int last=3;
//         long power=1;
    
//         for(int i=1;i<=last;i++)
//         {
//             power*=base;
//         }
//         System.out.println("power : "+power);
//     }
// }

// 69.Write a C program to find all factors of a number.

// public class Main{
//     public static void main(String [] args)
//     {
//         int number=12;
//         for(int i=1;i<=number;i++)
//         {
//             if(number%i==0)
//             {
//                 System.out.println("This is factors : "+ i);
//             }
//         }
//     }
// }


// 70.Write a C program to calculate factorial of a number.

// public class Main{
//     public static void main(String [] args)
//     {
//         int num=5;
//         int fact=1;
//         for(int i=1;i<=num;i++)
//         {
//             fact=fact*i;
//         }
//         System.out.println(fact);
//     }
// }

// 71.Write a C program to find HCF (GCD) of two numbers.

// public class Main{
//     public static void main(String [] args)
//     {
//         int num=1234;
//         int rem=0;
//         int sum=0;
//         while (num!=0) {
//             rem=num%10;
//             sum=sum+rem;
//             num=num/10;
            
//         }
//         System.out.println("Totel sum number : "+sum);
        
//     }
// }

// import java.util.Scanner;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//         int a= input.nextInt();
//         int ac=0;
       
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         int num=123;
//         int rem=0;
//         int sum=0;
//         while (num!=0) {
//             sale
//         }
//     }
// }

// public class Main{
//    static void swap(int a[] ,int i ,int j)
//    {
//     int temp=a[i];
//     a[i]=a[j];
//     a[j]=temp;


    
//    }
//    static void print(int a[])
//    {
//     for(int i=0;i<=a.length-1;i++)
//     {
//       System.out.print(a[i]+" ");
//     }
//    }
//     public static void main(String [] args)
//     {
//       int a[]={1,0,1,0,1,0};
//       for(int i=0;i<a.length-1;i++)
//       {
//         for(int j=i+1;j<a.length;j++)
//         {
//             if(a[i]>a[j])
//             {
//                 swap(a, i ,j);
//             }
//         }
       
//       }  
//      print(a); 
    
//     }
// }
// import java.util.Scanner;
// public class Main {

      
//         public static void main(String args[]){    
//          int i,m=0,flag=0; 
//          Scanner input=new Scanner(System.in);     
//          int n=input.nextInt();   
//          m=n/2;      
         
//          if(n==0||n==1){  
//           System.out.println(n+" is not prime number");      
//          }
         
//          else{  
          
//             for(i=2;i<=m;i++){      
         
//                 if(n%i==0){      
           
//                     System.out.println(n+" is not prime number");      
           
//                     flag=1;      
            
//                     break;      
         
//                 }      
          
//             }      
         
//             if(flag==0)  { System.out.println(n+" is prime number"); }  
         
//         }
      
//     }    
    
 
// }
// abstract class A {

//     abstract void show();
// }
// public class Main extends A{
//     public static void main(String[] args) {
//         A sc=new Main();
//         sc.show();
//         System.out.println("This is");
//     }
// }
// class A {
    
//     private A() {
//         System.out.println("Private constructor called");
//     }
    
    
//     static void show() {
        
//         A sc = new A();
//     }
// }

// public class Main  extends A{
    
//     public static void main(String[] args) {
       
//         Main sc = new Main();
        
        
//         sc.show();
//     }
// }

// this is question for mam

// public class Main{
//     static void show(int a,long b)
//     {
//         System.out.println(a+" "+b);
//     }
//     static void show(long c,int d)
//     {
//         System.out.println(a+" "+b);
//     }
//     public static void main(String [] args)
//     {
//         Main.show(1, 90);
//     }
// }

// public class Main{
//     static int show(long n){
//         return 10;
//     }
//     static long show(int n){
//         return 20L;
//     }
//     public static void main(String [] args)
//     {
//         System.out.println(Main.show(3));
//     }
// }



// class A {
//     void show(long a)
//     {
//         System.out.println("This is A class method");
//     }
// }
// public class Main extends A{
//     void show(int y)
//     {
//     //    super.show();
//         System.out.println("This is Main class method");
//         super.show(999999999);
//     }
//     public static void main(String [] args)
//     {
//         Main sc=new Main();
//         sc.show(89);
//     }
// }
// import java.util.*;
// public class Main{
//     public static void main(String [] args)
//     {
//         Scanner input=new Scanner(System.in);
//        ArrayList <Integer> sc=new ArrayList<>();
//         for(int i=0;i<=1;i++)
//         {
//             int a=input.nextInt();
//             sc.add(a);
//         }
//         System.out.println("this is your");
//         for(int a: sc)
//         {
//             int num=a;
//             int rem,sum=0;
//             int temp=num;
//             while (num!=0) {
//                 rem=num%10;
//                 sum=sum*10+rem+rem+rem;
//                 num=num/10;
//             }
//             System.out.println(sum);
//             // System.out.println(a);
//         }
//     }

// }
// import java.util.*;
// import java.util.ArrayList;
// public class Main{
//     public static void main(String [] args)
//     {
//        Arraylist <Integer> sc=new Arraylist();
//         sc.add(153);
//         sc.add(152);
//         sc.add(151);

//         for(int i=0;i<=sc.length;i++)
//         {
//             System.out.println(sc.get(i));
//         }
//     }
// }


// public class Main{
//     public static void main(String [] args)
//     {
//         int num=598;
//         int rem,sum=0;
//         while (num!=0) {
//             rem=num%10;
//             sum=rem;
//             num=num/10;
//             // for(int i=1;i<=sum;i++)
//             // {
//             //     for(int s=0;s<=i;s++)
//             //     {
//             //         System.out.print(" ");
//             //     }
//             //     for(int j=i;j<=sum;j++)
//             //     {
//             //         System.out.print("*");
//             //     }
//             //     // System.out.println();
//             // }
//             System.out.println(sum);
        
//         for(int i=1;i<=sum;i++)
//         {
//             // for(int s=0;s<=i;s++)
//             //     {
//             //         System.out.print(" ");
//             //     }
                
//            for(int j=0;j<=sum;j++)
//            {
//             System.out.print("  "+"*");
//             break;
//            }
//         //    System.out.println();
//         }
//         // System.out.println();
//     }
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();

        
//         String processedString = input.replaceAll("\\s+", "").toLowerCase();

       
//         if (isPalindrome(processedString)) {
//             System.out.println("'" + input + "' is a palindrome.");
//         }
//          else {
//             System.out.println("'" + input + "' is not a palindrome.");
//         }
//     }

//     public static boolean isPalindrome(String str) {
//         int left = 0;
//         int right = str.length() - 1;

//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false; // Characters at the current positions do not match
//             }
//             left++;
//             right--;
//         }
//         return true; // All characters match in reverse order
//     }
// }
// public class Main{
//     public static void main(String [] args)
//     {
//         int a=14;
//         boolean count=true;
    
//         if(a<=1)
//         {
//             count=false;
//         }
//         else{
//             for(int i=2;i<=a/2;i++)
//             {
//                 if(a%i==0)
//                 {
//                     count=false;

//                 }
//             }
//         }
//         if(count)
//         {
//             System.out.println(count);
//         }
//         else{
//             System.out.println(count);
//         }
//     }
// }

// public class Main{

//     public static void main(String [] args)
//     {
//         int a=0;
//         int b=1;
//         System.out.print(a+" ");
//         System.out.print(b+" ");
//         for(int i=1; i<=10;i++)
//         {
//             int c=a+b;
//             a=b;
//             b=c;

//             System.out.print(c+" ");
//         }
//     }
// }

// import java.util.LinkedList;
// import java.util.List;

// public class Main{
//     public static void main(String [] args)
//     {
//         LinkedList <Integer> sc=new LinkedList<>();
//         for(int i=1;i<=5;i++)
//         {
//             sc.add(i);
//         }
//         for(int i=0;i<=sc.size()-1;i++)
//         {
//             if(sc.get(i)%2!=0)
//             {
//                 System.out.println("This is odd number");
//             }
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         String a="s h a";
//         char sc[]=a.toCharArray();
//         for(int i=0;i<sc.length;i++)
//         { 
//             if(sc[i]==' ')
//             {
//                 sc[i]='0';
//             }
            
//         }
//         for(int i=0;i<sc.length;i++)
//         { 
//            System.out.print(sc[i]);
//         }
//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String [] args)
//     {
//         int a[]={1,2,3,89,12,0,23};
        
//         Arrays.sort(a);
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//         System.out.println();
//         for(int i=a.length-2;i>=0;i--)
//         {
//             System.out.println(a[i]+" ");
//             break;
//         }

//         int max=0;
//         System.out.println();
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=i+1;j<=a.length-1;j++)
//             {
//                 if(a[i]>a[j])
//                 {
//                     System.out.print(a[i]);
//                 }
//             }
//         }
//     }
// }


// public class Main{
//     public static void swap(int a[],int i)
//     {
//         int temp=a[i];
//         a[i]=a[i+1];
//         a[i+1]=temp;
//     }
//     public static void main(String [] args)
//     {
//         int a[]={1,3,4,2,2};
//         for(int i=0;i<a.length-1;i++)

//         {
//             if(a[i]<a[i+1])
//             {
//                 swap(a, i);
//             }
//         }
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         int num=1545;
//         int rem,sum=0;
//         int temp=num;
//         while (num!=0) {
//             rem=num%10;
//             sum=sum+rem*rem*rem;
//             num=num/10;
        
//         }
//         if(sum==temp)
//         {
//             System.out.println("yes");
//         }
//         else 
//         {
//             System.out.println("not");
//         }
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         String a="sskkskhe";
//         // int count=0;
//         char array[]=a.toCharArray();
//         for(int i=0;i<array.length;i++)
//         {int count=1;
//             for(int j=i+1;j<array.length;j++)
//             {
//                 if(array[i]!=array[j])
//                 {
//                     // coutn++;
//                     // System.out.println("Number of character in string : "+ array[i]+" Number : "+count);
//                     count++;
//                 }
//                 else 
//                 {
//                     break;
//                 }
//             }
            
//             System.out.println("Number of character in string : "+ array[i]+" Number : "+count);
            
//         }
//         char prin[]= 
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         int a=5;
//         for(int i=1;i<=a;i++)
//         {
//             for(int s=a;s>=i;s--)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                 if(i+j==a )
//                 {
//                 System.out.print("* ");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         String a="Shalendra";
//         StringBuffer sc=new StringBuffer();
//         sc.append(a);
      
//         System.out.println(sc.reverse());

//         sc.delete(2, 5);
//         System.out.println(sc);
//         System.out.println(sc.reverse());
       
//         StringBuffer scc=new StringBuffer("This is my String buffer");
//         // i make a new StringBuffer in this String 
//         System.out.println(scc);
//         // print the Stringbuffer 
//         // not need the for loop and other printing functions 
//         System.out.println("-------------------------------------------");
//         // add a Stirng / StringBuffer in scc String Buffer this is the last in 
//         scc.append(a);
//         // print the scc String Buffer 
//         System.out.println("This is my Stringbuffer 1+2 : "+scc);

//         // append inside the scc String a 
//         System.out.println("------------------------------------");
//         // remove the characters throw the delete(int start, int end)
//         scc.delete(2, 15);
//         System.out.println("This is delete String Buffer : "+scc);
//         // reverse() in  String Buffer in Simple 
//         System.out.println("--------------------------------");
        
//         System.out.println(scc.reverse());
        
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         // make the String
//         String sc="this is my new Stirng ";
//         // print the simple string 
//         System.out.println(sc);
        
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         // make the String
//         String sc="this is my new Stirng ";
//         // print the simple string 
//         System.out.println(sc);
//         // to char array
//         char [] ch=sc.toCharArray();
//         // print the char array
//         for(int i=0;i<ch.length;i++)
//         {
//             System.out.print(ch[i]+" ");
//         }
//         // odd index
//         System.out.println(); 
//         System.out.println("This is odd index value ");
//         System.out.println();
//         for(int i=0;i<ch.length;i++)
//         {
//              if(i%2==0)
//             {
               
//                 System.out.print(ch[i]+" ");
//             }
//         }
//         System.out.println();
//         System.out.println("------------------------------");
//         // even index
//         System.out.println("This is even index value ");
//         System.out.println();
//         for(int i=0;i<ch.length;i++)
//         {
//             if(i%2!=0)
//             {
//                 System.out.print(ch[i]+" ");
//             }
//         }
//         System.out.println();
//         System.out.println("-------------------------------");
//         System.out.println();
//         for(int i=0;i<ch.length;i++)
//         {
//             if(ch[i]==' ')
//             {
//                 System.out.println("This is index value of  "+i);
//             }
//         }
//     }
// }

// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         String sc = "abc s g abc abc";
//         sc=sc.replaceAll("\\s", "");
//         // System.out.println(sc);
//         // System.out.println(sc);
//         char[] a = sc.toCharArray(); 
//         char v='A';
//        for(int i=0;i<a.length;i++)
//        {
//         int count=0;
//         if(a[i]!='0')
        
//         for(int j=i+1;j<a.length;j++)
//         {
//             if(a[i]==a[j])
//             {
                
//                 count++;
//                 a[j]='0';
                
//             }
            
//         }
        
//             if(a[i]!='0')
//             {      
//         System.out.println(a[i]+" this : "+count);
        
//        }
//     }
//     }
      
//     }


// public class Main{
//     public static int n()
//     {
//         int a[]={1,2,34,0,3,4};
//         int target=3;
//         int val=0;
//         for(int i=0;i<a.length;i++)
//         {
//             if(a[i]==target)
//             {
//                 return i;
//             }
            
               
           

//         }
//         return -1;
//     }
//     public static void main(String [] args)
//     {
//         System.out.println(n());
        
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Print a double quote
//         System.out.println("Here is a double quote: \"");
        
//         // Print double quotes around a word
//         System.out.println("Here is a double quoted word: \"example\"");
        
//         // Print double quotes with text
//         System.out.println("This is a \"quoted\" text.");
//     }
// }


// import java.util.Scanner;

// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// public class Main {
//     static Scanner sc;

//     // Method to create the binary tree
//     static Node createTree() {
//         Node root = null;
//         System.out.println("Enter node data (-1 for no node):");
//         int data = sc.nextInt();

//         if (data == -1) {
//             return null; // Return null if no node should be created
//         }
//         root = new Node(data);

//         System.out.println("Enter left child of " + data + ":");
//         root.left = createTree(); // Recursively create left subtree

//         System.out.println("Enter right child of " + data + ":");
//         root.right = createTree(); // Recursively create right subtree

//         return root;
//     }

//     // Method to calculate the height of the binary tree
//     static int height(Node root) {
//         if (root == null) {
//             return 0; // Height of an empty tree is 0
//         }
//         int leftHeight = height(root.left); // Height of left subtree
//         int rightHeight = height(root.right); // Height of right subtree

//         // Height of the current node is max of left and right heights + 1
//         return Math.max(leftHeight, rightHeight) + 1;
//     }

//     public static void main(String[] args) {
//         sc = new Scanner(System.in);
//         Node root = createTree(); // Create the tree based on user input
//         int result = height(root); // Calculate the height of the tree
//         System.out.println("Height of the tree: " + result); // Print the height
//     }
// }

// size

// import java.util.Scanner;

// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// public class Main {
//     static Scanner sc;

//     // Method to create the binary tree
//     static Node createTree() {
//         Node root = null;
//         System.out.println("Enter node data (-1 for no node):");
//         int data = sc.nextInt();

//         if (data == -1) {
//             return null; // Return null if no node should be created
//         }
//         root = new Node(data);

//         System.out.println("Enter left child of " + data + ":");
//         root.left = createTree(); // Recursively create left subtree

//         System.out.println("Enter right child of " + data + ":");
//         root.right = createTree(); // Recursively create right subtree

//         return root;
//     }

//     // Method to calculate the height of the binary tree
//     static int size(Node root)
//     {
//         if(root == null)
//         {
//             return 0;
//         }
//         return 1+size(root.left)+size(root.right);
//     }

//     public static void main(String[] args) {
//         sc = new Scanner(System.in);
//         Node root = createTree(); // Create the tree based on user input
//         int result = size(root); // Calculate the height of the tree
//         System.out.println("Height of the tree: " + result); // Print the height
//     }
// }


// import java.util.Scanner;

// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// public class Main {
//     static Scanner sc;

//     // Method to create the binary tree
//     static Node createTree() {
//         Node root = null;
//         System.out.println("Enter node data (-1 for no node):");
//         int data = sc.nextInt();

//         if (data == -1) {
//             return null; // Return null if no node should be created
//         }
//         root = new Node(data);

//         System.out.println("Enter left child of " + data + ":");
//         root.left = createTree(); // Recursively create left subtree

//         System.out.println("Enter right child of " + data + ":");
//         root.right = createTree(); // Recursively create right subtree

//         return root;
//     }

//     // Method to calculate the height of the binary tree
//     static int maximum(Node root)
//     {
//         if(root==null)
//         {
//         return Integer.MIN_VALUE;
//         }
//         return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
//     }

//     public static void main(String[] args) {
//         sc = new Scanner(System.in);
//         Node root = createTree(); // Create the tree based on user input
//         int result = maximum(root); // Calculate the maximum of the tree
//         System.out.println("maximum of the tree: " + result); // Print the maximum
//     }
// }


// public class Main{
//     static void swap(int a[],int i,int j)
//     {
//         int temp=a[i];
//         a[i]=a[j];
//         a[j]=temp;
//     }
//     public static void main(String [] args)
//     {
//         int a[]={1,23,4,50,2,23};
//         for(int i=0;i<a.length-1;i++)
//         {
//            for(int j=i+1;j<a.length;j++)
//            {
//             if(a[i]>a[j])
//             {
//             swap(a, i,j);
//             }
//            }
//         }
//         for(int i=0;i<a.length;i++)
//         {
//            System.out.print(a[i]+" ");
//         }
//     }
// }

// public class Main{
//     public static void main(String [] args)
// {
    // for(int i=5;i>=1;i--)
    // {
    //       for(int j=i;j>=1;j--)
    //     {
    //         System.out.print(j);
    //     }
    //     System.out.println();
    //     for(int s=i;s<=5;s++)
    //     {
    //         if()
    //         System.out.print("*");
    //     }
        
    //     // for(int j=i;j>=1;j--)
    //     // {
    //     //     System.out.print(j);
    //     // }
       
    // }

//     for(int i=1;i<=5;i++)
//     {
//         for(int s=0;s<=i;s++)
//         {
//             System.out.print(" ");
//         }
//         for(int j=5;j>=i;j--)
//         {
//             System.out.print(j);
//         }
//         for(int s=0;s<=i;s++)
//         {
//             System.out.print(" ");
//         }
//         for(int j=5;j>=i;j--)
//         {
//             System.out.print(j);
//         }
//         System.out.println();
//     }
   
// }
// }

// question. how are you print this Ans you are how 



// public class Main{
//     public static void main(String [] args)
//     {
        
//        String s="fg      how are you";
//         int a=0;
//         System.out.println("this is reale value : "+s);
//         int last=s.length()-1;
//         String sum="";
//        for(int i=s.length()-1;i>=0;i--)
//        {
//          if(s.charAt(i)==' ')
//          {
//             a=i+1;
//             for(int j=a;j<=last;j++)
//             {
//                 sum=sum+s.charAt(j);
//             }
//             sum+=" ";
//             last=a-2;
//          }
//          else {
//             continue;
//          }
//        }

//        for(int k=0;k<=last;k++)
//          {
//             sum=sum+s.charAt(k);
//          }
//          System.out.println(sum);
        
//         char scc[]=sum.toCharArray();
        
//         for(int i=0;i<scc.length;i++)
//         {
//             if(scc[i]==' ')
//             {
//                 if(scc[i+1]==' ')
//                 {
//                   scc[i]='0';
//                 }
                
//             }

//         }
//         for(int i=0;i<scc.length;i++)
//         {
//             System.out.print(scc[i]);
//         }
//         // System.out.println(scc);
//     }
// }

// maixmum in binary tree :

// import java.util.*;
// class Node {
//     int data;
//     Node left;
//     Node right;
//     Node (int data)
//     {
//         this.data=data;
//     }
// }
// public class Main{
//     static Scanner sc;
//     static Node createTree() {
//                 Node root = null;
//                 System.out.println("Enter node data (-1 for no node):");
//                 int data = sc.nextInt();
        
//                 if (data == -1) {
//                     return null; // Return null if no node should be created
//                 }
//                 root = new Node(data);
        
//                 System.out.println("Enter left child of " + data + ":");
//                 root.left = createTree(); // Recursively create left subtree
        
//                 System.out.println("Enter right child of " + data + ":");
//                 root.right = createTree(); // Recursively create right subtree
        
//                 return root;
//             }
        
//             // Method to calculate the height of the binary tree
//             static int maximum(Node root)
//             {
//                 if(root==null)
//                 {
//                 return Integer.MIN_VALUE;
//                 }
//                 return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
//             }
//         static Node printlevelval(Node root ,int level)
//         {
//             if(root==null)
//             {
//                 return ;
//             }
//             if(level == 1)
//             {
//                 System.out.println(root.data+" ");
//             }
//             else if(level>1)
//             {
//                 printlevelval(root.left , level -1);
//                 printlevelval(root.right, level -1);
//             }
//         }
//             public static void main(String[] args) {
//                 sc = new Scanner(System.in);
//                 Node root = createTree(); // Create the tree based on user input
//                 int result = maximum(root); // Calculate the maximum of the tree
//                 System.out.println("maximum of the tree: " + result); // Print the maximum
//             }
//         }

// print the recrution in java         

// public class Main {
//     void show(int n)
//     {
//         if(n==0)
//         {
//             return;
//         }
//         show(n-1);
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         Main sc=new Main();
//         sc.show(10);
//     }
// }

// print the odd number throw the recrution

// public class Main{
//     void show(int n)
//     {
//         if(n==0)
//         {
//             return;
//         }
//         show(n-1);
//         if(n%2==0)
//         {
//         System.out.println(n);
//         }
        
//     }
//     public static void main(String [] args)
//     {
//         Main sc=new Main();
//         sc.show(10);
//     }
// }

// print the even number throw the recrution

// public class Main{
// void show(int n)
// {
//     if(n==0)
//     {
//         return;
//     }
//     show(n-1);
//     if(n%2!=0)
//     {
//     System.out.println(n);
//     }
    
// }
// public static void main(String [] args)
// {
//     Main sc=new Main();
//     sc.show(10);
// }
// }

// make a node and print the method with while loop 

// public class Main{
//     static class Node{
//         int data;
//         Node next;
         
//         Node (int data)
//         {
//             this.data=data;
//         }
//     }
//     static void dispaly(Node head)
//     {
//         Node temp=head;
//         while (temp!=null) {
//             System.out.println(temp.data);
//             temp=temp.next;
//         }
//     }
//     public static void main(String [] args)
//     {
//         Node a=new Node(1);
//         Node b=new Node(2);
//         Node c=new Node(3);
//         Node d=new Node(4);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=null;
//        dispaly(a);
//     }
// }

// public class Main{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data)
//         {
//             this.data=data;
//         }
//     }
//     static class Array{
      
//         Node head=null;
//         Node tail=null;
//         static void insert(int data)
//         {
//             Node temp=new Node(data);
//             if(head==null)
//             {
//                 head=temp;
//                 tail=head;
//             }
//             else {
//                 tail.next=temp;
//                 tail=temp;
//             }

//         }
//         static void printNode()
//         {
//             Node temp=head;
//             while (temp!=null) {
//                 System.out.println(temp.data);
//                 temp=temp.next;
//             }
//         }

//     }
//     public static void main(String [] args)
//     {
//         for(int i=1;i<=5;i++)
//         {
//             Array.insert(i);
//         }
//         Array.printNode();
//     }
// }



// this is encapulation




// public class Main{
//     private int a;
//     private int b;
//     void set(int a ,int b)
//     {
//         this.a=a;
//         this.b=b;
//     }
//     int get(){
//         return a+b;
//     }
//     public static void main(String [] args)
//     {
//         Main sc=new Main();
//         sc.set(5, 5);
//         System.out.println(sc.get());
//     }
// }


// public class Main{
//     private int a;
//     private int b;
//     Main(int a,int b)
//     {
//         this.a=a;
//         this.b=b;

        
//     }
//     int get(){
//         return a+b;
//     }
//     public static void main(String [] args)
//     {
//       Main sc=new Main(5, 10);
//       System.out.println(sc.get());
//     }
// }


// inherantence


// class A{
//     void show(){
//         System.out.println();
//     }
// }
// public class Main{
//     static void swap(int a[],int j ,int i)
//     {
//         int temp= a[i];
//         a[i]=a[j];
//         a[j]=temp;
//     }
//     public static void main(String [] args)
//     {
//         int a[]={1,2 ,4,45,43,90,3,4,5,6};
//         for(int i=0;i<a.length;i++)
//         {
//            for(int j=i+1;j<a.length;j++)
//            {
//             if(a[i]>a[j])
//             {
//                swap(a, j, i); 
//             }
//            } 
//         }
//         int n=3;
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//         System.out.println();
//         System.out.println("this is rotate");
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<a.length;j++)
//             {
//                 int temp=a[a.length-1];
//                 a[a.length-1]=a[j];
//                 a[j]=temp;

//                 System.out.print(a[j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         int a[]={1,2,3,4,5,6,7};
//         int sum=6;
//         int index=a.length-1;
//         for(int i=0;i<a.length;i++)
//         {
//             index=a[index];
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[i]+a[j]+index==sum)
//                 {
//                     System.out.println(" i : "+i+" j :"+j +"index"+index);
//                 }
//             }
//             index--;
//         }
//     }
// }


// public class Main{
//     public static void main(String [] args)
//     {
//         int a[][]={{1,2,3},{4,5,6},{7,8,9}};

//         System.out.println("This is my orignal vlaue");
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a.length;j++)
//             {
//                 System.out.print(a[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//        for(int k=0;k<=3;k++)
//        {
//             for(int i=0;i<a.length;i++)
//                {
//                     for(int j=0;j<a.length;j++)
//                     {
//                         int temp=a[a.length-1][a.length-1];
//                         a[a.length-1][a.length-1]=a[i][j];
//                         a[i][j]=temp;

//                         System.out.print(a[i][j]+" ");
//                     }
//                     System.out.println();
//                 }
//                 System.out.println("This is swap : "+k);
//         }
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         int a[]={1,2,43,4,5,33,2};
//         int target=2;
//         for(int i=0;i<a.length;i++)
//         {
//             if(i==target)
//             {
//                 a[i]=a[i=target+1];
//             }
//             System.out.print(a[i]+" ");
//         }      
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         int a[]={1,2,3,4,5,6};
//         for(int i=0;i,a.length;i++)
//         {
            
//         }
//     }
// }

// class SharedResource {
//     private int counter = 0;

//     // Method to increment the counter
//     public synchronized void increment() {
//         counter++;
//         System.out.println("Counter incremented to: " + counter);
//     }

//     // Method to decrement the counter
//     public synchronized void decrement() {
//         counter--;
//         System.out.println("Counter decremented to: " + counter);
//     }
// }

// class MyThread extends Thread {
//     private SharedResource sharedResource;

//     public MyThread(SharedResource sharedResource) {
//         this.sharedResource = sharedResource;
//     }
//     public void run() {
//         sharedResource.increment();
//         sharedResource.decrement();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         SharedResource sharedResource = new SharedResource();

//         // Create two threads and start them
//         new MyThread(sharedResource).start();
//         new MyThread(sharedResource).start();
//     }
// }


// public class Main{
//     int a=34;
//     public static void main(String [] args)
//     {
//         Main sc=new Main();

//         System.out.println(sc.a);
//         // output = 34;
//         sc.a=90;
//         System.out.println(sc.a);
//         // output = 90
//     }
// }

// class A extends Thread
// {
//     public void run(){
//         System.out.println("Tihs is ");
//     }
// }
// public class Main extends A{
//     public static void main(String [] args)
//     {
//            A sc=new A();
//           sc.start();
//     }
// }


// public class Main{
//     public static void main(String [] args)
//     {
       
//         int a[][]={{1,2,3},{4,5,6},{7,8,9}};
//         for(int i=0;i<a.length;i++)
//         {
//             int sum=0;
//             for(int j=i;j<a[i].length;j++)
//             {
//                 sum=sum+a[i][j];
//             }
//             System.out.println(" This "+sum);
//         }
       
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         int a[]={1,1,3,2,1,3,4};
//         for(int i=0;i<a.length;i++)
//         {
//             int count=1;
           
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[i]==a[j])
//                 {
                    
//                     count++;
//                      a[j]=0;
                   
//                 }
//             }
           
            
//         }
//         for(int j=0;j<a.length;j++)
//         {
//            if(a[j]==0)
//            {
               
//            }
//            else 
//            {
//              System.out.print(a[j]+" ");
//            }
//         }
//     }
// }

// public class Main{
//     public static void main(String [] args)
//     {
//         for(int i=0;i<=10;i++)
//         {
//             for(int j=i;ija>=i;j++)
//             {
//                 if(i==j)
//                 {
//                     System.out.print("*");
//                 }
//             }
//         }
//     }
// }

abstract class A{
    A(){
        System.out.println("A");
    }
    void show(){
        new A(){
            void show(){
            
            }
        };
    }
}
public class Main extends A{
    public static void main(String [] args){
        Main m=new Main();
    
        m.show();
    }
}