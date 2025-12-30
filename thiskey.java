public class thiskey {
    int value;

    public thiskey(int value) {
        this.value = value; 
    }

    public void display(int value) {
        System.out.println("Value: " + this.value); 
        System.out.println("Assigned Value: " + value);
    }

    public static void main(String[] args) {
        thiskey obj = new thiskey(10);
        obj.display(20);
    }       
}
