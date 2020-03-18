package day55.association2;

import java.util.List;

public class CourseX {

    String topic;
    List<Student> studentLst;

    public CourseX(String topic, List<Student> studentLst) {
        this.topic = topic;
        this.studentLst = studentLst;
    }

    public void addStudent(Student s) {

        studentLst.add(s);

    }

    public void addStudent(String name, int ID) {

        Student s1 = new Student(name, ID);
        studentLst.add(s1);

    }

    @Override
    public String toString() {
        return "CourseX{" +
                "topic='" + topic + '\'' +
                ", studentLst=" + studentLst +
                '}';
    }
}
