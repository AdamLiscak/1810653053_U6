import javax.swing.*;
import java.util.ArrayList;

public class A4 {
    public static void main(String[] args)
    {
        ArrayList<String> a= new ArrayList<>();
        for (int i=0; i<5;i++)
        {
            a.add(JOptionPane.showInputDialog("Bitte namen eingem"));
        }
        for (String k: a  )
        {
            System.out.println(k);
        }
    }
}
