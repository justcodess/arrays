package arrays;

import java.util.Scanner;

public class array_test {

	public static void main(String[] args) {
		int dogrucevap=0;
		Scanner input=new Scanner(System.in);
		
		String[] f= {"A","a","B","b","C","c","D","d","A","a"};
		
		System.out.printf("1. Hangi ülke en çok sera gazı yaymaktadır?");
		System.out.printf("A:Çin\nB:Hindistan\nC:Amerika\nD:Japonya");
		String cevap1=input.nextLine();
		
		if(f[0].equals(cevap1)||f[1].equals(cevap1)) {
			System.out.printf("DOGRU CEVAP\n");
			dogrucevap++;
			}
		else{
				System.out.printf("YANLIS CEVAP\n");	
			}
			
		
		System.out.printf("2. Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?");
		System.out.printf("A:Jüpiter\nB:Venüs\nC:Mars\nD:Merkür");
		String cevap2=input.nextLine();
		
		if(f[2].equals(cevap2)||f[3].equals(cevap2)) {
			System.out.printf("DOGRU CEVAP\n");
			dogrucevap++;
			}
			else {
				System.out.printf("YANLIS CEVAP\n");	
			}
			
		
		
		System.out.printf("3. Hangi tür ampul en az enerjiyi tüketir?");
		System.out.printf("A:Akkor Ampul\nB:Halojen Ampul\nC:Kompakt Floresan Ampul");
		String cevap3=input.nextLine();
		
		if(f[4].equals(cevap3)||f[5].equals(cevap3)) {
			System.out.printf("DOGRU CEVAP\n");
			dogrucevap++;
			}
			else {
				System.out.printf("YANLIS CEVAP\n");	
			}
			
			
		
		System.out.printf("4. İklim değişikliği nedeniyle yılda kaç kişi ölmektedir?");
		System.out.printf("A:1500\nB:100.000\nC:150.000\nD:500.000");
		String cevap4=input.nextLine();
		
		if(f[6].equals(cevap4)||f[7].equals(cevap4)) {
			System.out.printf("DOGRU CEVAP\n");
			dogrucevap++;
			}
			else {
				System.out.printf("YANLIS CEVAP\n");	
			}
			
		
		
		
		System.out.printf("5. Küresel ısınmaya karşı en savunmasız hayvan hangisidir?");
		System.out.printf("A:Kar Leoparı\nB:Kutup Ayısı\nC:Deniz Gergedanı\nD:Tukan");
		String cevap5=input.nextLine();
		
		if(f[8].equals(cevap5)||f[9].equals(cevap5)) {
			System.out.printf("DOGRU CEVAP\n");
			dogrucevap++;
			}
			else {
				System.out.printf("YANLIS CEVAP\n");	
			}
			
			
		
		
		
		switch(dogrucevap) {
		
		case 5:
			System.out.printf("\n\nmukemmel");
			break;
			
		case 4:
			System.out.printf("\n\ncok iyi");
			break;
			
		default:
			System.out.printf("\n\niyi");
			break;
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
