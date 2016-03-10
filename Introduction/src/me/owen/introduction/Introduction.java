package me.owen.introduction;

public class Introduction {
	
	public static void main(String[] args) {
		Introduction obj = new Introduction();
		obj.runDice();
		obj.runArt();
				
	}
	private void runDice(){
		System.out.println("--- Dice ---");
		System.out.println();
		System.out.println("oooooooooooo");
		System.out.println("o          o");
		System.out.println("o  #    #  o");
		System.out.println("o    #     o");
		System.out.println("o  #    #  o");
		System.out.println("o          o");
		System.out.println("oooooooooooo");
	}
	public void runArt(){
		System.out.println("  ___   _      _   ____    _   _");
		System.out.println(" / _ \\  \\\\    //  | ___|  | \\ | |");
		System.out.println("( (_) )  \\\\/\\//   | __|   |  \\| |");
		System.out.println(" \\___/    \\/\\/    |____|  |_\\___|");	
	}
}
