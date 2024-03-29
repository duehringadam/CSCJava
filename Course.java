public class Course
{
    private String subject;
    private String number;
    private String name;

    public Course() {

    }

    public Course(String subject, String number, String name) {
        this.subject = subject;
        this.number = number;
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                '\n'+ subject +
                " " + number +
                " " + name;

    }
}

