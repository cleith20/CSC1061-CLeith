
public class Play {
	private User user;
	private Bot bot;
	
	
	public Play() {
		user = new User();
		bot = new Bot();
	}
	
	public void play() {
		System.out.println("Select one:\n1. Rock\n2. Paper\n3. Scissors");
		user.selection();
		bot.botRandom();
		if(user.getUserChoice() == bot.getBotChoice()) {
			System.out.println("Draw");
		}
		else if (user.getUserChoice() == 1 && bot.getBotChoice() == 2) {
			System.out.println("You: Rock\nCPU: Paper\n\nYou lose :(");
		}
		else if (user.getUserChoice() == 2 && bot.getBotChoice() == 3) {
			System.out.println("You: Paper\nCPU: Scissors\n\nYou lose :(");;
		}
		else if (user.getUserChoice() == 3 && bot.getBotChoice() == 1) {
			System.out.println("You: Scissors\nCPU: Rock\n\nYou lose :(");
		}
		else if (user.getUserChoice() == 2 && bot.getBotChoice() == 1) {
			System.out.println("You: Paper\nCPU: Rock\n\nYou win :)");
		}
		else if (user.getUserChoice() == 3 && bot.getBotChoice() == 2) {
			System.out.println("You: Scissors\nCPU: Paper\n\nYou win :)");
		}
		else{
			System.out.println("You: Rock\nCPU: Scissors\n\nYou win :)");
		}
	}
	

}
