import java.util.Scanner;
public class MediaSimples {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int media;
		
		System.out.println("Digite a 1ª nota: ");
		a = sc.nextInt();
		System.out.println("Digite a 2ª nota: ");
		b = sc.nextInt();
		System.out.println("Digite a 3ª nota: ");
		c = sc.nextInt();
		
		media = (a + b + c) / 3;
		
		System.out.println("Sua média é:"+ media);
		
		if((media >= 50)) {
			System.out.println("Aprovado!!!");
		} else if( media <= 49) {
			System.out.print("Reprovado!!!");
		}
		

	}

}