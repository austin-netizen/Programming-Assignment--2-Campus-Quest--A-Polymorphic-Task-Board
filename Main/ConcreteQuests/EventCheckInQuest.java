package Main.ConcreteQuests;
import Main.AbstractQuest;
import Main.Student;

//A student completes this by checking in at an event
public class EventCheckInQuest extends AbstractQuest {

    private String eventName;

    public EventCheckInQuest(int id, String title, String eventName, int basePoints) {
            super(id, title, basePoints);
            if(setEventName(eventName)) 
                throw new IllegalArgumentException("Invalid eventName");
            System.out.println("Method Reached HERE in EventCheckInQuest");
    }

    //Setter
    public boolean setEventName(String eventName) {
        if (eventName == null || eventName.isBlank()) return false;
        this.eventName = eventName;
        return true;
    }

    //Getter
    // Assumes eventName is distinct from title
    public String getEventName(){
        return this.eventName;
    }

    //Marks quest as complete and returns associated number of basePoints as "reward"
    @Override
    public int completeFor(Student s) {
        markCompleted();
        return getBasePoints();
    }
    
}
