package Main.ConcreteQuests;
import Main.AbstractQuest;
import Main.Student;
import java.lang.Math;
 
public class StreakQuest extends AbstractQuest {
    
    private int days;

    public StreakQuest(int id, String title, int days, int basePoints) {
            super(id, title, basePoints);
            if(setDays(days)) 
                throw new IllegalArgumentException("Invalid days");
    }

    //Setter
    public boolean setDays(int days) {
        if (days < 0) return false;
        this.days = days;
        return true;
    }
    
    //Getter
    public int getDays(){
        return this.days;
    }


    //Marks quest as complete and returns associated number of basePoints * hours as "reward"
    @Override
    public int completeFor(Student s) {
        markCompleted();
        return (int) Math.pow(getBasePoints(), days);
    }

}
