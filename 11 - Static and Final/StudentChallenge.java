import java.time.Year;

class Student {

    private String rollNo;

    private String name;

    private String email;

    private String phone;

    private int semester;

    private static int counter = 0;

    public Student(String name, String email, String phone, int semester) {

        rollNo = generateRollNo();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.semester = semester;

    }

    private String generateRollNo() {

        int year = Year.now().getValue();
        return rollNo = "CMR-" + year + "-" + (counter + 1);

    }

    public void getDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Semester: " + semester);

    }

}

public class StudentChallenge {

    public static void main(String[] args) {

        Student student1 = new Student("Sam", "sam123@gmail.com", "123456789", 4);
        Student student2 = new Student("John", "john123@gmail.com", "987654321", 3);
        Student student3 = new Student("Mike", "mike123@gmail.com", "123456789", 2);

        student1.getDetails();
        student2.getDetails();
        student3.getDetails();

    }

}
