package thisandsuper;

public class This_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);
        System.out.println(e.getA());

    }
}
class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int v){
        a = v;
    }
    public int returnone(){
        return 1;
    }
}