import java.util.ArrayList;

public class SquareRoots {
    public float a;
    public float b;
    public float c;

    public SquareRoots(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ArrayList<Float> root(){
        float delta = (float)Math.sqrt(b * b - 4 * a * c);
        float res1 = (-b + delta) / (2 * a);
        float res2 = (-b - delta) / (2 * a);
        ArrayList <Float> roots = new ArrayList<>();
        roots.add(res1);
        roots.add(res2);
        return roots;
    }

    public static void main(String[] args) {
        SquareRoots r = new SquareRoots(5, 6, 1);
        System.out.println("The square roots of the equation are: " + r.root());
    }
}
