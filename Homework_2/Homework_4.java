import javax.swing.JOptionPane;

public class Homework_4{

    public static void main(String[] args) throws Exception 
    {
        float a = Float.parseFloat(JOptionPane.showInputDialog(null, "İlk Sayıyı giriniz:","1.Sayı", JOptionPane.QUESTION_MESSAGE));
        float b = Float.parseFloat(JOptionPane.showInputDialog(null, "ikinci Sayıyı giriniz:","2.Sayı", JOptionPane.QUESTION_MESSAGE));

        int secim = Integer.parseInt(JOptionPane.showInputDialog(null, "İşleminiz ? \n[1]-Toplama\n[2]-Çıkarma\n[3]-Çarpma\n[4]-Bölme","İşlem", JOptionPane.QUESTION_MESSAGE));


        switch(secim) {
            case 1:
                JOptionPane.showMessageDialog(null, "Toplam =" + (a + b), "Toplama işlemi", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fark =" + (a - b), "Çıkarma işlemi", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Çarpım =" + (a * b), "Çarpma İşlemi", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                if (b == 0)
                    JOptionPane.showMessageDialog(null, "Sayı bölü 0 durumu : Tamımsız!", "Bölme işlemi", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Bölüm =" + (a / b), "Bölme işlemi", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "hmm, seçimler sadece rakam olmalı!", "Seçim hatası", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
        
        









        }




    


    }
