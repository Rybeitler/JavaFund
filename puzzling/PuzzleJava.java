import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava{
    public ArrayList<Integer> getTenRolls(){
        Random randMachine = new Random();
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i=0; i<10;i++){
            rolls.add(randMachine.nextInt(21));
        }
        return rolls;
    }

    public String getRandomLetter(){
        Random randMachine = new Random();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int randNum = randMachine.nextInt(26);
        String randLetter = alphabet[randNum];
        return randLetter;
    }

    public ArrayList<String> generatePassword(){
        Random randMachine = new Random();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        ArrayList<String> password = new ArrayList<String>();
        for (int i=0; i<8; i++){
            String randLetter = alphabet[randMachine.nextInt(26)];
            password.add(randLetter);
        }
        return password;
    }

    public ArrayList<Integer> shuffleArray(ArrayList<Integer>shuffleMe){
        Random randMachine = new Random();
        Integer temp1 = 0;
        Integer temp2 = 0;
        for(int i=0; i<5; i++){
            int rand1 = randMachine.nextInt(10);
            int rand2 = randMachine.nextInt(10);
            temp1 = shuffleMe.get(rand1);
            temp2 = shuffleMe.get(rand2);
            shuffleMe.set(rand1, temp2);
            shuffleMe.set(rand2, temp1);
        }
        return shuffleMe;
    }
}