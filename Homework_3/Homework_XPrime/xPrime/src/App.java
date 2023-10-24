import javax.swing.JOptionPane;
import Homework_tools.numberStuff;

public class App {
    public static void main(String[] args) throws Exception 
    {
        String a = JOptionPane.showInputDialog("İnteger giriniz:");
        if (a != null) {
            try {
                int num = Integer.parseInt(a);
                if(numberStuff.isPrimeX(num))
                    JOptionPane.showMessageDialog(null,"ısPrimeX sonucu : True");  
                else
                    JOptionPane.showMessageDialog(null,"ısPrimeX sonucu : False");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Invalid input. İnteger GİRİNİZ!!!.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"???");
        }

    }
}
