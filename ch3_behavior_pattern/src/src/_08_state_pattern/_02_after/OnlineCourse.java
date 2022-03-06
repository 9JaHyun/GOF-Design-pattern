package src._08_state_pattern._02_after;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private State state;

    private List<Student> students = new ArrayList<>();

    private List<String> reviews = new ArrayList<>();

    public OnlineCourse() {
        this.state = new Draft(this);
    }

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(Student student, String review) {
        this.students.add(student);
        if (this.students.size() > 1) {
            this.state.addReview(student, review);
        }
    }

    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void changeState(Private state) {
        this.state = state;
    }
}
