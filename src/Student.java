
public class Student
{
    private String name;
    private int matrikelnr;
    private int jahrgang;

    public Student(String name, int matrikelnr, int jahrgang) {
        this.name = name;
        this.matrikelnr = matrikelnr;
        this.jahrgang = jahrgang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }

    public void setMatrikelnr(int matrikelnr) {
        this.matrikelnr = matrikelnr;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang;
    }
}
