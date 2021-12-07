package task3;

import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final Subject subject1 = new Subject("physics");
        final Subject subject2 = new Subject("mathematics");
        final Subject subject3 = new Subject("englishLanguage");
        final Student student1 = new Student("Ihor", "Kubryk");
        final Student student2 = new Student("Ostap", "Bondarenko");
        final Student student3 = new Student("Alina", "Kovalenko");

        final List<Student> studentsOfGroup = List.of(student1, student2, student3);
        final Group experimentGroup = new Group("experimentGroup", studentsOfGroup);
        experimentGroup.addNewSubjectForStudents(subject1);
        experimentGroup.addNewSubjectForStudents(subject2);
        experimentGroup.addNewSubjectForStudents(subject3);

        System.out.println(experimentGroup);
        System.out.println(experimentGroup.showTheBestStudent());

        System.out.println(experimentGroup.showAllMarksBySubject("englishLanguage"));

        System.out.println(experimentGroup.getAllLastNames());

        System.out.println(experimentGroup.sortStudentsByFirstName());
        System.out.println(experimentGroup.sortStudentsByLastName());

        System.out.println(experimentGroup.convertStudentsListToStudentSimple());

        System.out.println(experimentGroup.showStudentsWithAverageScore6AndMore());
    }
}
