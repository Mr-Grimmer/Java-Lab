class Instructor {
    private String name;
    private String phone;

    public void setInstructor(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void displayInstructor() {
        System.out.println("Instructor Name: " + name);
        System.out.println("Phone: " + phone);
    }
}

class TextBook {
    private String title;
    private String author;
    private String publisher;

    public void setTextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public void displayTextBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }
}

class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textbook;

    public void setCourse(String courseName, Instructor instructor, TextBook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor Info:");
        instructor.displayInstructor();
        System.out.println("Textbook Info:");
        textbook.displayTextBook();
    }
}

public class Question7 {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setInstructor("Dr. Smith", "1234567890");

        TextBook textbook = new TextBook();
        textbook.setTextBook("Java Programming", "James Gosling", "Sun Microsystems");

        Course course = new Course();
        course.setCourse("BCSE101", instructor, textbook);

        course.displayCourse();
    }
}
