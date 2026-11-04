// The final keyword: variable, method, and class.
class FinalExample {
    public final int MAX = 10;

    public final void showMessage() {
        System.out.println("This final method cannot be overridden");
    }
}

class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        System.out.println("MAX = " + example.MAX);
        example.showMessage();
    }
}
