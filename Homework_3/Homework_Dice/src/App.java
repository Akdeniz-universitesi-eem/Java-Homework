import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import Homework_tools.numberStuff;


//A lot of googling... constructor method give me a headache :(
public class App {

    //Dice Stuff
    private void rollDice() 
    {
        
        int dice1 = numberStuff.createRandomNumber(1, 6);
        int dice2 = numberStuff.createRandomNumber(1, 6);

        //dice images
        try 
        {
            //getResorce can be a problem but it working in this case so i left it like this
            ImageIcon dice1Icon = new ImageIcon(ImageIO.read(getClass().getResource("/diceFaces/dice" + dice1 + ".png")));
            ImageIcon dice2Icon = new ImageIcon(ImageIO.read(getClass().getResource("/diceFaces/dice" + dice2 + ".png")));


        
            //images dont fit rescale 
            Image dice1Image = dice1Icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            Image dice2Image = dice2Icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);  
        


            dice1Label.setIcon(new ImageIcon(dice1Image));
            dice2Label.setIcon(new ImageIcon(dice2Image));

        } 
        catch (IOException ex) 
        {
            System.out.println("Error!!!");
        }
    }

    private JFrame frame;
    private JButton rollButton;
    private JLabel dice1Label, dice2Label;

    public App() {
        frame = new JFrame("Zar Simulator");

        //google says it is more simple to use FlowLayout
        frame.setLayout(new FlowLayout());
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        //panel and button
        JPanel panel = new JPanel();
        rollButton = new JButton("Zar AT");

        
        
        
        //sizes
        panel.setPreferredSize(new Dimension(1200, 300));
        rollButton.setPreferredSize(new Dimension(250, 50));


        //font
        rollButton.setFont(new Font("Arial", Font.BOLD, 30));



        //listener
        rollButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                rollDice();
            }
        }
        );



        dice1Label = new JLabel();
        dice2Label = new JLabel();



        panel.add(rollButton);
        panel.add(dice1Label);
        panel.add(dice2Label);
        


        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) 
    {
        //Gui update
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new App();
            }
        });
    }



}
