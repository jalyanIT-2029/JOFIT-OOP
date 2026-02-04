import java.time.LocalDateTime;
import java.util.Scanner;

public class SecretAgent{
    public static Scanner input = new Scanner(System.in);
    String agentId = "016";
    String codeName ;
    int clearanceLevel;
    boolean onMission;
    LocalDateTime lastMissionCompletionTime;

    public SecretAgent(){

    }

    public SecretAgent(String id, String codeName, int clearanceLevel){
        onMission = false;
        lastMissionCompletionTime = null;

    }

    public static String getAgentId(){
        System.out.print("Enter your ID: ");
        String agentId = input.nextLine();
    }
        
    public static getCodename(){

    }
    public static getClearanceLevel(){
        
    }
    public static isOnMission(){
        
    }
    public static getLastMissionCompletionTime(){
        
    }

    public void setCodename(String newCodename){

    }
    public void setClearanceLevel(int level){

    }
}