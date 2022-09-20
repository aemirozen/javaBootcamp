package homework1;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		 int number = 1;
		 int remainder = number % 2;
		 System.out.println(remainder);
		 boolean isPrime = true;
		 
		 if(number==1) {
			 System.out.println("Sayý asal deðildir");
			 return;
		 }
		 
		 if(number<2) {
			 System.out.println("Geçersiz bir sayý");
		 }
		 
		 for (int i=2; i<number; i++) {
			 if(number % 2 == 0) {
				 isPrime = false;
			 }
		 }
		 
		 if(isPrime) {
			 System.out.println("Sayý asaldýr");
		 }else {
			 System.out.println("Sayý asal deðildir");
		 }

	}

}
