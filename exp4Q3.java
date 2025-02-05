class University {
 
    static String universityName = "Global University";
    
  
    private String studentName;
    public University(String studentName) {
        this.studentName = studentName;
    }

    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {
        University.displayUniversityName();

        University student1 = new University("Varnika");
        University student2 = new University("Jassi");
        University student3 = new University("Chitranshi");

        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
    }
}
