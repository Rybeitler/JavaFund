import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
        String randLetter = generator.getRandomLetter();
        System.out.println(randLetter);

        ArrayList<String> password = generator.generatePassword();
        System.out.println(password);

        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> shuffledArray = generator.shuffleArray(testArray);
        System.out.println(shuffledArray);
	}
}
