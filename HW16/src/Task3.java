public class Task3 {
    String surname;
    String name;
    String secondName;
    int yearBirth;
    String adress;
    String phone;
    String faculty;
    int course;
    int group;

    public Task3(
            String surname, String name, String secondName, int yearBirth, String adress,
            String phone, String faculty, int course, int group
    ) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.yearBirth = yearBirth;
        this.adress = adress;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFaculty() {
        return this.faculty;
    }
    public int getYear() {
        return this.yearBirth;
    }
    public int getGroup() {
        return this.group;
    }
    public void printStudent() {
        System.out.println("Student: " + this.name + ", faculty: " + this.faculty + ", year of: " +
                this.yearBirth + ", course: " + this.course + ", and group: " + this.group );
    }
}
