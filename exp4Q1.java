class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
       
        Student student1 = new Student();
        student1.display();

        System.out.println();

        Student student2 = new Student("Alice", 20);
        student2.display();
    }
}