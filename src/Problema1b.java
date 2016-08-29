public final class Problema1b {
	static java.util.Scanner ingresar = new java.util.Scanner (System.in);
	public static void GuestGame(){
		int answer= (int) Math.floor(Math.random() * 100 + 1);
		int guess = 0;
		int numGuesses = 1;
		while(guess != answer){
			if(numGuesses <= 7){
				System.out.println("adivine un numero");
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
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//char[] ans = new char[1];
		do{
			GuestGame();
			System.out.println("desea jugar otra vez?(Y/N)");
			//ans=ingresar.nextchar();			
		}
		while(true);//ans[0] == 'Y' || ans ==[0] 'y');
	}
}
