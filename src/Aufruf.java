import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args) {


        Student a = new Student("Hotish Singaku", 2789689, 2018);
        Student b = new Student("yuriko yakamura", 218947190, 2017);
        Student c = new Student("Hieronymus debiluzs", 23893479, 2018);
        List<Student> ak =Arrays.asList(a,b,c);
        for (Student m: ak)
        {
            System.out.println(m);
        }


    }

}
