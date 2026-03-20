package Main;
// Quest interface

public interface Quest {

    public int getId();

    public String getTitle();

    public int getBasePoints();

    public boolean isCompleted();

    public int completeFor(Student s);
//     Critical rule: completeFor must:
// • update the quest’s completion state,
// • award points to the student (directly or indirectly),
// • and return the number of points awarded.
// Design note: The board should call quest.completeFor(student) without needing to know
// the concrete quest type. This is the point of the interface and polymorphic dispatch.
    
}