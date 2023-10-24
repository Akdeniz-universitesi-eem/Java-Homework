//Sayı sıralama 5.Soru


import java.util.Scanner;


    public class homework_5{

        public static void main(String[] args) throws Exception 
    {
        
        Scanner scanner = new Scanner(System.in);

        //Sayı sıralama ödevi

         

        int[] sayılar = new int[3];
        
        for (int i = 0 ; i<3 ; i++)
        {
        System.out.println((i+1) + "\'nci sayıyı giriniz.");
        
         sayılar[i]= scanner.nextInt();
     
        }
       
        //arrayı sortlayıp ona göre çıkarmak daha kolay gibi
        // length dışında exception atıyor

        for (int i = 0; i < sayılar.length - 1; i++) 
        {
            for (int j = i + 1; j < sayılar.length; j++) 
            {
                if (sayılar[i] > sayılar[j]) 
                {
                    int a = sayılar[i];
                    sayılar[i] = sayılar[j];
                    sayılar[j] = a;
                }
            }
        }
        
        //küçükten büğüye sıralı zaten

        int esitlik = 0 ;

            for(int i = 0;i<2;i++)
            {
                if(sayılar[i] == sayılar[i+1])
                    esitlik = esitlik +(i+1) ;

            }

    
        switch(esitlik)
        {
            case 1 : 
                System.out.println(sayılar[0] + " = " + sayılar[1] + " < " + sayılar[2]);
                break;
            case 2 : 
                System.out.println(sayılar[0] + " < " + sayılar[1] + " = " + sayılar[2]);
                break;
            case 3 :
                System.out.println(sayılar[0] + " = " + sayılar[1] + " = " + sayılar[2]);
                break;
        default:
            System.out.println(sayılar[0] + " < " + sayılar[1] + " < " + sayılar[2]);
            break;
        }
    }
}
  

       
    
    