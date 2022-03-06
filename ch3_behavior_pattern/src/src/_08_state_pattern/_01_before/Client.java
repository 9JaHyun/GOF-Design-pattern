package src._08_state_pattern._01_before;

public class Client {

    public static void main(String[] args) {
        Student student1 = new Student("studentKim");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student student2 = new Student("studentLee");
//        student2.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student1);
    }
}
