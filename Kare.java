import java.util.Scanner;

public class Kare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir Kenarın Uzunluğunu Giriniz: ");
		int x= scanner.nextInt();
		
		//alanı x2
		//çevresi 4x
		
		int alan=(int)Math.pow(x, 2);
		int cevre=4*x;
		
		System.out.println(alan);
		System.out.println(cevre);
	}
}
