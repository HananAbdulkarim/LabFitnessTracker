import java.util.Scanner;
class Workout{
    String type;
    int duration;
    void showWorkout(){
        System.out.println("Workout type: "+type+",\nDuration: "+duration+" minutes");
    }
}
class RunningWorkout extends Workout{
    double distance;
    void showDetails(){
        showWorkout();
        double calories= distance*60;
        System.out.println("Distance: "+distance+"Km \ncalories burned: "+calories);
    }
}
public class Main{
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        RunningWorkout r= new RunningWorkout();
        System.out.println("Enter workout type: ");
        r.type= input.nextLine();
        System.out.println("Enter duration(minutes): ");
        r.duration=input.nextInt();
        System.out.println("Enter distance(Km): ");
        r.distance=input.nextDouble();
        System.out.println("----Workout Summary-----");
        r.showDetails();

    }
}