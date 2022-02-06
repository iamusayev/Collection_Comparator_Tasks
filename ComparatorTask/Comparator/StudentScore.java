package DmDevTask2.ComparatorTask.Comparator;

import DmDevTask2.ComparatorTask.Student;

import java.util.Comparator;

public class StudentScore implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAvgScore(), o1.getAvgScore());
    }
}
