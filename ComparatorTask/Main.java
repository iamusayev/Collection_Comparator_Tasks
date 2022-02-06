package DmDevTask2.ComparatorTask;

import DmDevTask2.ComparatorTask.Comparator.StudentAge;
import DmDevTask2.ComparatorTask.Comparator.StudentFullName;
import DmDevTask2.ComparatorTask.Comparator.StudentScore;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("John", "Wick", 23, 97));
        list.add(new Student("Lesly", "Adams", 33, 95));
        list.add(new Student("Wade", "Dave", 27, 98));
        list.add(new Student("Harold", "Horner", 33, 96));
        list.add(new Student("Tommy", "Rick", 54, 100));


        list.sort(new StudentFullName());
        list.sort(new StudentAge());
        list.sort(new StudentScore());
        System.out.println(list);

        list.sort(new StudentFullName().thenComparing(new StudentAge()).thenComparing(new StudentScore()));

    }

    private static Student maxAvg(List<Student> list) {
        Student highestScore = null;
        for (Student student : list) {
            if (highestScore== null || student.getAvgScore() > highestScore.getAvgScore()){
                highestScore=student;
            }

        }
        return highestScore;
    }

}
