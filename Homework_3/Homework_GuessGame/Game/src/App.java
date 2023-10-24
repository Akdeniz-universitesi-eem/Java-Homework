import javax.swing.JOptionPane;

import Homework_tools.numberStuff;


public class App 
{
    public static void main(String[] args) throws Exception 
    {
        playGame();
    }

    public static void playGame() 
    {
        //number and input
        int guessNum = numberStuff.createRandomNumber(1, 100);
        //zero as start out of range
        int userInput = 0;

        
        boolean guessedCorrect = false;
        JOptionPane.showMessageDialog(null, "Sayı aralığı 1-100");

        while (!guessedCorrect) 
        {
            try {
                //Take user input
                String input = JOptionPane.showInputDialog(null, "Sayı ? ");


                if (input == null) 
                {  //Cancel or close
                    JOptionPane.showMessageDialog(null, "Kapansın mı ?");
                    return;
                }
                userInput = Integer.parseInt(input);

                //user input correct ?
                if (userInput == guessNum) 
                {
                    guessedCorrect = true;
                    JOptionPane.showMessageDialog(null, "Kazandın!");
                } 
                else if (userInput < guessNum) 
                {
                    JOptionPane.showMessageDialog(null, "Yukarı");
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Aşağı");
                }
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Tam sayı giriniz!", "HATA!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
        


    

