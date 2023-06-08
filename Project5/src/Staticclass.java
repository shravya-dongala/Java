class Staticclass{
    static int i;
    static {
        i = variable();
    }
    static int variable() {
        return 4;
    }
    static int getStaticVariable() {
        return i;
    }
}


