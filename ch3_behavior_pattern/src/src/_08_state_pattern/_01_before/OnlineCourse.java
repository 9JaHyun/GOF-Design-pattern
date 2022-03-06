package src._08_state_pattern._01_before;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private enum State {
        DRAFT,      //
        PUBLISHED,  // 모든 학생 가능
        PRIVATE     // 수강중인 학생만 가능
    }

    private State state = State.DRAFT;

    private List<String> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        if (this.state == State.DRAFT || this.state == State.PUBLISHED) {
            this.students.add(student);
        } else if (this.state == State.PRIVATE) {
            this.students.add(student);
        } else {
            throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다");
        }
        if (this.students.size() > 1) {
            this.state = State.PRIVATE;
        }
    }

    public void addReview(Student student, String review) {
        if (this.state == State.PUBLISHED) {
            this.reviews.add(review);
        } else if (this.state == State.PRIVATE && this.students.contains(student)) {
            this.reviews.add(review);
        } else {
            throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 작성할 수 없습니다");
        }
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }
}
