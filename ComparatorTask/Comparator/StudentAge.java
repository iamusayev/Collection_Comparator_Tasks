package DmDevTask2.ComparatorTask.Comparator;

import DmDevTask2.ComparatorTask.Student;

import java.util.Comparator;

public class StudentAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
