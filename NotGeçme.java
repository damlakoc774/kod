import java.util.Scanner;
public class NotGeçme {

	private static String isim;

	public static <n> void main(String[] args) {
		//vize1%30---vize2%30---- final%40--- GEÇME NOTU 60
		
		Scanner scan = new Scanner (System.in);
		System.out.println("İsminizi Giriniz: ");
		String isim = scan.nextLine();
		
		System.out.print("Soyadınızı Giriniz: ");
        String soyad = scan.nextLine();
    
        System.out.print("Dersinizi Giriniz: ");
		String dersIsmı = scan.nextLine();
		
		System.out.print("Vize1 notunu giriniz: ");
		double vize1 = scan.nextDouble();
		
		System.out.print("Vize2 notunu giriniz: ");
		double vize2 = scan.nextDouble();
		
		System.out.print("Final notunu giriniz: ");
		double finalNot = scan.nextDouble();
		
		double sonuc = (vize1*0.3) + (vize2*0.3) + (finalNot*0.4);
	
			if(sonuc>=60) {
			System.out.println("Dersten geçmiştir :) ");
			
			}
			else{
				System.out.println("Dersten kaldınız :/ " );
			}
		
	}

}
