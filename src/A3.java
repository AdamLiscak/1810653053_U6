import javax.swing.*;
import java.util.Random;

public class A3 {
    public static void main(String[] args) {
        Random x= new Random();
        int[] a= new int[100];
        for (int i =0; i<a.length; i++)
        {
         a[i]=x.nextInt(1000);
        }
        int n= Integer.parseInt(JOptionPane.showInputDialog("Bitte index eingem"));
        int p = a[n];

            while (true)
            {

                    boolean reply = JOptionPane.showConfirmDialog(null, "bestätigen sie die zahl " + p, "zahlbestatigung", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
                    if (!reply)
                    {
                        try { a[n] = Integer.parseInt(JOptionPane.showInputDialog("Bitte zahl eingem")); }
                        catch (NumberFormatException o)
                        {
                            break;
                        }

                    }
                    else{break;}
                }

    }
}
