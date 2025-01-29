class Student {
    String name = "Default Name"; 
    int age = 18;                

   
    Student() {
       
    }

   
    Student(String name, int age) {
        this.name = name; 
        this.age = age;   
    }

  
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }


    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.display(); 

        
        Student student2 = new Student("Varnika", 20);
        student2.display();
    }
}