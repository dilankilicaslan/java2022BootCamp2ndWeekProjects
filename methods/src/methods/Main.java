package methods;

public class Main {

	public static void main(String[] args) {
	
		sayiBulma();
		
	}
	
	public static void sayiBulma() {

		int[] sayilar= new int[] {1,2,3,4,5,0};
		int aranacak =5 ;
		boolean varMi=false;
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		
		}
		if(varMi) {
			mesajVer("Sayı mevcut :" + aranacak);
		}else {
			mesajVer("Sayı mevcut değil." + aranacak);
		}
	
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}


