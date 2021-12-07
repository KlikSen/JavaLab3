package task3;

import java.util.*;
import java.util.stream.Collectors;

public class Group {
    public String nameOfGroup;
    public List<Student> students;
    public List<Map<Integer, Mark>> mapsOfMarksInList;

    public Group(final String nameOfGroup, final List<Student> students) {
        this.nameOfGroup = nameOfGroup;
        this.students = students;
    }

    public void addNewSubjectForStudents(final Subject subject){
        for (final Student student : students){
            student.addSubject(subject);
        }
    }
    public void showGroup(){
        System.out.println(this.toString());
    }

    public Student showTheBestStudent(){
        Student bestStudent = students.get(0);
        for (int i = 1; i < students.size(); i++){

            double averageScore1 = bestStudent.getMarks().stream().mapToInt(Mark::getMark)
                    .sum();
            double averageScore2 = students.get(i).getMarks().stream().mapToInt(Mark::getMark)
                    .sum();

            averageScore1 /= students.get(i).getMarks().size();
            averageScore2 /= students.get(i).getMarks().size();

            if (averageScore2 > averageScore1){
                bestStudent = students.get(i);
            }
        }

        return bestStudent;
    }

    public void buildMapsOfMarksInList (){
        final List<Map<Integer, Mark>> newMapsOfMarksInList = new ArrayList<>();

        for (int i = 0; i < students.get(0).subjects.size(); i++){

            final Map<Integer, Mark> newSubjectMap = new HashMap<>();

            for (int j = 0; j < students.size(); j++){
                newSubjectMap.put(students.get(j).getId(), students.get(j).getMarks().get(i));
            }
            newMapsOfMarksInList.add(newSubjectMap);
        }
        this.mapsOfMarksInList = newMapsOfMarksInList;
    }

    public Map<Integer, Mark>  showAllMarksBySubject (final String sub){
        buildMapsOfMarksInList();

        final List<Subject> findSameSubject = students.get(0).subjects.stream()
                .filter(a -> a.getSubjectName().equals(sub))
                .collect(Collectors.toList());
        final int idOfSaneSubject = findSameSubject.get(0).getId();

        return mapsOfMarksInList.get(idOfSaneSubject);
    }

    public List<Integer>  showAllMarksByEnglish (){
        buildMapsOfMarksInList();

        final String sub = "englishLanguage";
        final List<Subject> findSameSubject = students.get(0).subjects.stream()
                .filter(a -> a.getSubjectName().equals(sub))
                .collect(Collectors.toList());
        final int idOfEnglish = findSameSubject.get(0).getId();

        List<Integer> listOfEnglishMarks = new ArrayList<>();
        int englishMark;
        for (int i = 0; i < students.size(); i++){
            englishMark = students.get(i).getMarks().get(idOfEnglish).getMark();
            if (!listOfEnglishMarks.contains(englishMark))
            listOfEnglishMarks.add(englishMark);
        }
        return listOfEnglishMarks;
    }

    public String getAllLastNames() {
        final List<String> listOfAllLastNames = this.students.stream().map((s)->s.getLastName()+"-").collect(Collectors.toList());
        final StringBuilder allLastNames = new StringBuilder();

        for (int i = 0; i < listOfAllLastNames.size(); i++){
            allLastNames.append(listOfAllLastNames.get(i));
        }

        return allLastNames.toString();
    }

    public Collection sortStudentsByFirstName() {
        final Collection<Student> sortedStudentsByFirstName = this.students.stream()
                .sorted((o1,o2)->o1.getFirstName().compareTo(o2.getFirstName()))
                .collect(Collectors.toList());

        return sortedStudentsByFirstName;
    }

    public Collection sortStudentsByLastName() {
        final Collection<Student> sortedStudentsByLastName = this.students.stream()
                .sorted((o1,o2)->o1.getLastName().compareTo(o2.getLastName()))
                .collect(Collectors.toList());

        return sortedStudentsByLastName;
    }

    public List<StudentSimple> convertStudentsListToStudentSimple(){
        return this.students.stream().map(obj -> new StudentSimple(obj.getFirstName(), obj.getLastName()))
                .collect(Collectors.toList());
    }

    public List<Student> showStudentsWithAverageScore6AndMore() {
        List<Student> listOfStudentsWithAverageScore6AndMore = new ArrayList<>();
        for (int i = 1; i < students.size(); i++) {

            double averageScore = students.get(i).getMarks().stream().mapToInt(Mark::getMark)
                    .sum();

            averageScore /= students.get(i).getMarks().size();

            if (averageScore >= 6) {
                listOfStudentsWithAverageScore6AndMore.add(students.get(i));
            }
        }
        return listOfStudentsWithAverageScore6AndMore;
    }

    @Override
    public String toString() {
        return "Group{" +
                "nameOfGroup='" + nameOfGroup + '\'' +
                ", students=" + students +
                '}';
    }
}
