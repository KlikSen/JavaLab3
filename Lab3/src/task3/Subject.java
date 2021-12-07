package task3;

public class Subject {
    private static int count = 0;
    public String subjectName;
    public int id;


    public Subject() {
        this.id = count++;
    }

    public Subject(final String subjectName) {
        this.subjectName = subjectName;
        this.id = count++;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(final String subjectName) {
        this.subjectName = subjectName;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }
}
