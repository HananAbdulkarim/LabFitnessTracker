# LabFitnessTracker
This program show all details about workout (distance, duration,type, calories burned)
this code use the Inheritance logic as we can see here
``` java
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
````
and it ask the user to enter manually the variables values
