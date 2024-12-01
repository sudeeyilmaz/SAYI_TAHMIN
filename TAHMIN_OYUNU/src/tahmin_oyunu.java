import java.util.*;
public class tahmin_oyunu {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
        Random rnd = new Random();
        int sayi1,sayi2,sayi3,sayi4,sayi5;
        int pc = rnd.nextInt(1,100+1);
        int [] dizi = new int[5];
        
       
        System.out.println("Rastgele bir sayı tutuldu.");
        System.out.println("1.Tahmin sayınızı giriniz: ");
        System.out.print("Kullanıcı: ");
        sayi1 = a.nextInt();
        
        System.out.println("Rastgele bir sayı tutuldu.");
        System.out.println("2.Tahmin sayınızı giriniz: ");
        System.out.print("Kullanıcı: ");
        sayi2 = a.nextInt();
        
        System.out.println("Rastgele bir sayı tutuldu.");
        System.out.println("3.Tahmin sayınızı giriniz: ");
        System.out.print("Kullanıcı: ");
        sayi3 = a.nextInt();
        
        System.out.println("Rastgele bir sayı tutuldu.");
        System.out.println("4.Tahmin sayınızı giriniz: ");
        System.out.print("Kullanıcı: ");
        sayi4 = a.nextInt();
        
        System.out.println("Rastgele bir sayı tutuldu.");
        System.out.println("5.Tahmin sayınızı giriniz: ");
        System.out.print("Kullanıcı: ");
        sayi5 = a.nextInt();
        
       
        
        
        System.out.println("Tuttuğum sayı: " + pc);
        System.out.println("Tahminleriniz: ");
       
        int fark1 = Math.abs(pc-sayi1);
        int fark2 = Math.abs(pc-sayi2);
        int fark3 = Math.abs(pc-sayi3);
        int fark4 = Math.abs(pc-sayi4);
        int fark5 = Math.abs(pc-sayi5);
    
    	    
        int[] tahminler = {sayi1, sayi2, sayi3, sayi4, sayi5};
        int[] enYakinFarklar = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE};
        int[] enYakinSayilar = {0, 0, 0, 0,0};

        for (int tahmin : tahminler) {
            int fark = Math.abs(pc - tahmin);

            for (int i = 0; i < enYakinFarklar.length; i++) {
                if (fark < enYakinFarklar[i]) {
                  
                    for (int j = enYakinFarklar.length - 1; j > i; j--) {
                        enYakinFarklar[j] = enYakinFarklar[j - 1];
                        enYakinSayilar[j] = enYakinSayilar[j - 1];
                    }
                    
                    enYakinFarklar[i] = fark;
                    enYakinSayilar[i] = tahmin;
                    break;
                }
            }
        }

        for (int i = 0; i < enYakinSayilar.length; i++) {
            System.out.println(enYakinSayilar[i] + " en yakın " + (i + 1) + ". Sayı ve " + enYakinFarklar[i] + " sayı uzaklıkta.");
        }
    

      

        	
        	
    	  
        	
        
       
        
	}

}
