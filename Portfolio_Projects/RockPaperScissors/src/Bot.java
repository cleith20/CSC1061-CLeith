import java.util.Random;

public class Bot {
	public static Random ran = new Random();
	private int botChoice;
	
	public Bot() {
		botChoice = 0;
	}
	
	public int getBotChoice() {
		return botChoice;
	}
	public void botRandom() {
		botChoice = ran.nextInt(3)+1;
		
	}

}
