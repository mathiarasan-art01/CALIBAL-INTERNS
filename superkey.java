class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
    public class superkey {     
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
