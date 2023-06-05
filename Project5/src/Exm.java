public class Exm {
    int i;

    public Exm(int i) {
        this.i = i;
    }
}

class Example2 extends Exm {
    int j;

    public Example2(int i, int j) {
        super(i);
        this.j = j;
    }

    public Example2(int j) {
        super(0); // default value for i
        this.j = j;
    }

    void display() {
        System.out.println("Example1: " + i);
        System.out.println("Example2: " + j);
    }
}


