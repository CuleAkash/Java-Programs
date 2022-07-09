package Heaps.ComparableandComparator;

public class Student{ //implements Comparable<Student> {
    String name;
    int marks;


    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", marks='" + getMarks() + "'" +
            "}";
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return this.marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    // @Override
    // public int compareTo(Student student) {
    //     if(this.marks>student.marks) return 1;
    //     else if(this.marks<student.marks) return -1;
    //     return 0;
    // }


}
