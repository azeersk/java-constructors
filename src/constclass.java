public class constclass {
    int  x;
    int y;
    String sm;

    constclass(int a, int b, String ar){
        x = a;
        y = b;
        sm = ar;
    }
    void print(){
        System.out.println("x = "+ x + ", y = "+ y);
        System.out.println(sm);
    }
}
