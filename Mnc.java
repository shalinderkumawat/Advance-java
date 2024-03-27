interface A{
    int show1(int a);
    int show2();
}
class B implements A{
    public int show1(int a){
        return a;
    }
    public int show2(){
        return 0;
    }
    void show3(){
        System.out.println("I am Show3");
    }
    void show4(){
        System.out.println("I am show4");
    }
}
public class Mnc {
    public static void main(String[] args) {
        B k = new B();
        k.show1(10);
        k.show2();
        k.show3();
        k.show4();
    }
}

