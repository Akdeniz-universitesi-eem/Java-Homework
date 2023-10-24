import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;



        public class Homework_6 {
            public static int mid(int x, int y, int z) 
        {
            int orta;
            if ((x <= y && y <= z) || (z <= y && y <= x)) 
            {
                orta = y;
            } 
            else if ((y <= x && x <= z) || (z <= x && x <= y)) 
            {
                orta = x;
            } 
            else 
            {
                orta = z;
            }
            return orta;
        }


        
            public static void main(String[] args) throws Exception
            {
                Scanner scanner = new Scanner(System.in);
                // methot ödevi array daha uygun olurdu ama öncekinde kullandım farklı olsun .
                    System.out.println("1.sayıyı gir: ");
                    int say1 = scanner.nextInt();

                    System.out.println("2. sayıyı gir: ");
                    int say2 = scanner.nextInt();

                    System.out.println("3. sayıyı gir: ");
                    int say3 = scanner.nextInt();

                    int ortası = mid(say1 , say2 , say3 );

                    System.out.println("mid: " + ortası);

                    scanner.close();

            }
            








        }