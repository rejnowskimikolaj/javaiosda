package zad4;

//POJO o nazwie "Student", która przechowuje następujące informacje:
// imię i nazwisko, płeć, pesel, kierunek studiów, rok studiów.
public class Student {

    public static final String SEPARATOR = ";";
    public static final int FIRST_NAME_INDEX = 0;
    public static final int LAST_NAME_INDEX = 1;
    public static final int GENDER_INDEX = 2;
    public static final int PESEL_INDEX = 3;
    public static final int STUDIES_INDEX = 4;
    public static final int YEAR_INDEX = 5;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String pesel;
    private String studies;
    private int year;

    public Student() {
    }

    public Student(String firstName, String lastName, Gender gender, String pesel, String studies, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.pesel = pesel;
        this.studies = studies;
        this.year = year;
    }

    public Student(String line) {

        String[] splits = line.split(";");
        this.firstName = splits[FIRST_NAME_INDEX];
        this.lastName = splits[LAST_NAME_INDEX];
        if(splits[GENDER_INDEX].equals(Gender.MALE.toString()))this.gender = Gender.MALE;
        else this.gender = Gender.FEMALE;
        this.pesel = splits[PESEL_INDEX];
        this.studies = splits[STUDIES_INDEX];
        this.year = Integer.parseInt(splits[YEAR_INDEX]);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return firstName+SEPARATOR+lastName+SEPARATOR+gender+SEPARATOR+pesel+SEPARATOR+studies+SEPARATOR+year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (year != student.year) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) return false;
        if (gender != student.gender) return false;
        if (pesel != null ? !pesel.equals(student.pesel) : student.pesel != null) return false;
        return studies != null ? studies.equals(student.studies) : student.studies == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (pesel != null ? pesel.hashCode() : 0);
        result = 31 * result + (studies != null ? studies.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }


}
