package src._08_state_pattern._02_after;

public class Public implements State{

    private OnlineCourse onlineCourse;

    public Public(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
    }

    @Override
    public void addReview(Student student, String review) {
        this.onlineCourse.getReviews().add(review);
    }
}
