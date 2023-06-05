
class MyClass {
    static int i;

    static {
        i = variable();
    }

    static int variable() {
        return 42;
    }

    static int getStaticVariable() {
        return i;
    }
}


