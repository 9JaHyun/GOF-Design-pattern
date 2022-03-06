package src._08_state_pattern._02_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student studentKim = new Student("studentKim");
        Student studentLee = new Student("studentLee");
        studentLee.addPrivate(onlineCourse);

        onlineCourse.addStudent(studentKim);
        onlineCourse.changeState(new Private(onlineCourse));

        // available 해주어야 함.
        onlineCourse.addStudent(studentLee);

        onlineCourse.addReview(studentKim, "리뷰남기기");
        System.out.println(studentKim);
        System.out.println(onlineCourse.getStudents());
    }

}
