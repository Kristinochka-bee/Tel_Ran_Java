public class SubjectTeacher {
    private Subject subject;
    private Teacher teacher;

    public SubjectTeacher(Subject subject, Teacher teacher) {
        this.subject = subject;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "SubjectTeacher{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                '}';
    }
}
