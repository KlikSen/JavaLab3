package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private static int count = 0;
    public String firstName;
    public String lastName;
    public List<Mark> marks;
    public List<Subject> subjects;
    public int id;

    public Student() {
        this.id = count++;
    }

    public Student(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = new ArrayList<>();
        this.subjects = new ArrayList<>();
        this.id = count++;
    }

    public Student(final String firstName, final String lastName, final List<Mark> marks, final List<Subject> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
        this.subjects = subjects;
        this.id = count++;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(final List<Mark> marks) {
        this.marks = marks;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void addSubject(final Subject subject){
        final int minMark = 1;
        final int maxMark = 12;

        final Random randomNumber = new Random();
        final Mark randMark = new Mark(randomNumber.nextInt(maxMark - minMark) + minMark);

        this.subjects.add(subject);
        this.marks.add(randMark);
    }

    @Override
    public String toString() {
        final StringBuilder message = new StringBuilder();
        message.append('\n' + "firstName = " + firstName + ", lastName = " + lastName);
        for (int i = 0; i <marks.size(); i++)
        {
           message.append(", " + subjects.get(i).getSubjectName() + " =" + marks.get(i));
        }
        message.append(", id=" + id);

        return message.toString();
    }
}
