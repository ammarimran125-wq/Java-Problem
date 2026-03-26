package thisandsuper;

public class This_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());

    }
}
class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int v){
        this.a = v; //this is a reference
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends Ekclass{
    DoClass(int c){
        super(c);
        System.out.println("Me ek constructor hn");
    }

}