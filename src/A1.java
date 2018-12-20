import javax.swing.*;
import java.util.Random;

public class A1 {
    public static void main(String[] args)
    {
        Random x= new Random();

        int[] a= new int[Integer.parseInt(JOptionPane.showInputDialog("Bitte arraygröße eingem"))];
        for(int i=0; i<a.length; i++)
        {
            a[i]=x.nextInt(1000);
        }
        for(int i=a.length-1; i>=0;i--)
        {
            System.out.println(a[i]);
        }

    }
}
