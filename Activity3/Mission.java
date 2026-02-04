import java.time.LocalDate;
import java.util.Random;
public class Mission {
    String missionTarget;
    LocalDate missionDeadline;
    int difficulty;

    public Mission(){
        Random randomGenerator = new Random();
        String [] missions= {"Retrieve stolen data", "Infiltrate enemy base", "Rescue hostage"};
        int missionTarget = randomGenerator.nextInt(missions.length);
        int difficulty = randomGenerator.nextInt(10 + 1);


    }

    public static int getMissionTarget(){

    }

    public static String getMissionDeadline(){

    } 

    public static int getDifficulty(){

    }

    
}
