package Main;
public abstract class AbstractQuest implements Quest {
 private int id;
 private String title;
 private int basePoints;
 private boolean completed;

 public AbstractQuest (int id, String title, int basePoints)  {
    if(setId(id) == false)
        throw new IllegalArgumentException("Invalid id");
    if(setTitle(title) == false)
        throw new IllegalArgumentException("Invalid title");
    if(setBasePoints(basePoints) == false)
        throw new IllegalArgumentException("Invalid basePoints");
    if(markIncomplete() == false)
        throw new IllegalStateException("Failed to mark incomplete in AbstractQuest");
 }


// Complete Method
    public abstract int completeFor(Student s);

 // Common getters
 public int getId() {
     return this.id;
 }
 public String getTitle() {
     return this.title;
 }
 public int getBasePoints() {
     return this.basePoints;
 }
 public boolean isCompleted() {
     return this.completed;
 }

 // Setters
 public boolean markCompleted() {
     this.completed = true;
     return true;
 }

 public boolean markIncomplete() {
     this.completed = false;
     return true;
 }

 public boolean setId(int id) {
    if (id < 0) return false;
    this.id = id;
    return true;
 }

 public boolean setTitle(String title){
    if (title == null || title.isBlank()) return false;
    this.title = title;
    return true;
 }

 public boolean setBasePoints(int basePoints) {
    if (basePoints < 0) return false;
    this.basePoints = basePoints;
    return true;
 }



}
