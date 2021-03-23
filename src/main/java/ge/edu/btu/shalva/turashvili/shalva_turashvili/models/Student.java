package ge.edu.btu.shalva.turashvili.shalva_turashvili.models;


public class Student {
    private String name;
    private String surname;
    private String course;
    private int year;
    private String gender;

    public Student(){}

    public Student(String name, String surname, String course, int year, String gender) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.year = year;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

