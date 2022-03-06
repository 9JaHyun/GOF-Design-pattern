package src._08_state_pattern._02_after;

public class Private implements State{

    private OnlineCourse onlineCourse;

    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addStudent(Student student) {
        if (student.isAvailable(this.onlineCourse)) {
            this.onlineCourse.getStudents().add(student);
        } else {
            throw new UnsupportedOperationException("Private 코스를 수강할 수 없습니다.");
        }
    }

    @Override
    public void addReview(Student student, String review) {
        if (this.onlineCourse.getStudents().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        } else {
            throw new UnsupportedOperationException("Private 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.");
        }
    }
}
