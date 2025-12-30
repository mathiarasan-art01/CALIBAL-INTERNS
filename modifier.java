public class modifier {
    private int privatenum= 1;
    protected int protectednum = 2;
    public int publicnum = 3;
    int defaultnum = 4; // package-private

    void displayVariables() {
        System.out.println("Private Variable: " + privatenum);
        System.out.println("Protected Variable: " + protectednum);
        System.out.println("Public Variable: " + publicnum);
        System.out.println("Default Variable: " + defaultnum);
    }

    public static void main(String[] args) {
        modifier obj = new modifier();
        obj.displayVariables();
    }
}
