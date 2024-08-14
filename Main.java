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
import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {   
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the number of a");
        int a=input.nextInt();
        System.out.println("Enter the value of b");
        int b=input.nextInt();
      
        System.out.println("This is + "+(a+b));
        System.out.println("This is - "+(a-b));
        System.out.println("This is * "+a*b);
        System.out.println("This is / "+a/b);
        System.out.println("This is % "+a%b);
    }
}