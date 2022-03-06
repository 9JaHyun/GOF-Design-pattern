package src._08_state_pattern._02_after;

public interface State {

    void addStudent(Student student);

    void addReview(Student student, String review);
}
