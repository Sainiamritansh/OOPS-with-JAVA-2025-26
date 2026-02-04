class Student {
    int id;
    String name;
    int age;
    Student() {
        id = 0;
        name = "Not Assigned";
        age = 0;
    }
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Age  : " + age);
        System.out.println();
    }
    public static void main(String[] args) {

        Student s1 = new Student(10350, "Amritansh", 19);
        System.out.println("Student 1 ");
        s1.display();
        Student s2 = new Student();
        System.out.println("Student 2 ");
        s2.display();
    }
}