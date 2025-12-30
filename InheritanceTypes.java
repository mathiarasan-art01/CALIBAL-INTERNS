class Person {

    // Method of base class
    public void displayPerson() {
        System.out.println("This is a person");
    }
}

// Single Inheritance
class toppers extends Person {

    void displayStudent() {
        System.out.println("This is a student");
    }
}

// Multilevel Inheritance
class CollegeStudent extends toppers {

    void displayCollegeStudent() {
        System.out.println("This is a college student");
    }
}

// Hierarchical Inheritance
class Teacher extends Person {

    void displayTeacher() {
        System.out.println("This is a teacher");
    }
}

public class InheritanceTypes {

    public static void main(String[] args) {

        // Multilevel inheritance object
        CollegeStudent cs = new CollegeStudent();
        cs.displayPerson();
        cs.displayStudent();
        cs.displayCollegeStudent();

        // Hierarchical inheritance object
        Teacher t = new Teacher();
        t.displayPerson();
        t.displayTeacher();
    }
}
