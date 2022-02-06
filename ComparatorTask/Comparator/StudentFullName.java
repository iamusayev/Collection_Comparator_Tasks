package DmDevTask2.ComparatorTask.Comparator;

import DmDevTask2.ComparatorTask.Student;

import java.util.Comparator;

public class StudentFullName  implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
