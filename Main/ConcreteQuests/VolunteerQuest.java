package Main.ConcreteQuests;
import Main.AbstractQuest;
import Main.Student;

// A student completes this by volunteering some number of hours.
public class VolunteerQuest extends AbstractQuest {

    private int hours;

    public VolunteerQuest(int id, String title, int hours, int basePoints) {
            super(id, title, basePoints);
            if(setHours(hours)) 
                throw new IllegalArgumentException("Invalid hours");
    }

    //Setter
    public boolean setHours(int hours) {
        if (hours < 0) return false;
        this.hours = hours;
        return true;
    }
    
    //Getter
    public int getHours(){
        return this.hours;
    }


    //Marks quest as complete and returns associated number of basePoints * hours as "reward"
    @Override
    public int completeFor(Student s) {
        markCompleted();
        return getBasePoints()*getHours();
    }

}
