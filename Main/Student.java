package Main;
public class Student {
    private String name;
    private int points;

    // Methods
    public boolean addPoints(int amount){
        if(amount < 0)return false;
        this.points += amount;
        return true;
    }

    public String toString(){
        return "Name: " + getName() 
                + " " + 
                "Points: " + getPoints();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Student)) return false;
        Student o = (Student)obj;
        if(o.getName() == this.name) return true;
        return super.equals(obj);
    }

    // Hash just based on name because this is the factor we want to be similar
    @Override
    public int hashCode() {
        return 31 *  name.hashCode();
    }

    // Setters
    public boolean setName(String name) {
        if(name == null || name.isBlank()) return false;
        this.name = name;
        return true;
    }

    public boolean setPoints(int points){
        if(points < 0) return false;
         this.points = points;
         return true;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public int getPoints(){
        return this.points;
    }


}
