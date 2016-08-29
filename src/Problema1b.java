public final class Problema1b {
	static java.util.Scanner ingresar = new java.util.Scanner (System.in);
	public static void GuestGame(){
		int answer= (int) Math.floor(Math.random() * 100 + 1);
		int guess = 0;
		int numGuesses = 1;
		System.out.println("adivine un numero");
		while(guess != answer){
			if(numGuesses <= 7){
				guess = ingresar.nextInt();  
				if(guess < answer){
					System.out.println("mas alto");
				}
				else if(guess > answer){
					System.out.println("mas bajo");
				}
				else{
					System.out.println("GANASTE!");
					break;
				}
				numGuesses = numGuesses + 1;
			}
			else{
				if(numGuesses > 7){
					System.out.println("Perdiste TT^TT");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int ans ;
		do{
			GuestGame();
			System.out.println("desea jugar otra vez?(1/2)");
			ans=ingresar.nextInt();			
		}
		while(ans == 1);
	}
}
