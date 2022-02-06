package DmDevTask2.ComparatorTask;

public class Student {

    private String name;
    private String lastname;
    private int age;
    private int avgScore;

    public Student(String name, String lastname, int age, int avgScore) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.avgScore = avgScore;
    }

    public String getFullName(){
        return getName() + "" + getLastname();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", lastname='" + lastname + '\'' +
               ", age=" + age +
               ", avgScore=" + avgScore +
               '}';
    }
}
