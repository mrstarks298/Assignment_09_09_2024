package assignment;

public class Student_class_comparision {
    private int id;
    private String name;

    // Constructor
    public Student_class_comparision(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public int getID() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Check if they are the same instance
        if (obj == null || getClass() != obj.getClass()) return false;  // Check for null and class type

        // Typecast to Student_class_comparision and compare IDs
        Student_class_comparision student = (Student_class_comparision) obj;
        return id == student.id;  // Compare the IDs of the two students
    }

    public static void main(String[] args) {
        Student_class_comparision student1 = new Student_class_comparision(1, "Saurabh");
        Student_class_comparision student2 = new Student_class_comparision(2, "Agrahari");

        // Testing the equals method
        System.out.println("student1.equals(student2): " + student1.equals(student2));  // Should print false
    }
}
