package Main;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import Main.RewardUtil;



public class QuestBoard {
    // For this it is assumed that questsById is a general list of all quests for the lifetime of the event and assingments is the list of quests where the key is the student name and value there list of quests.
    Map<Integer, Quest> questsById;
    Map<Student, List<Quest>> assignments;

    public void addQuest(Quest q){
        // questsById already contains key return.
        if(questsById.containsKey(q.getId()))
            throw new IllegalArgumentException("Quest with id " + q.getId() + " does not exist.");
        questsById.put(q.getId(), q);
    }

    public Quest findQuest(int id){
        return questsById.get(id);
    }


    // Util for adding a student to assingments map
    public void addAssignment(Student s){
        if(s == null) return;
        assignments.put(s, null);
    }

    public void assignQuest(Student s, int questId){
        if(s == null || questId < 0) return;
        Quest q = findQuest(questId);
        if(q != null) assignments.get(s).add(q);
    }

    public int completeQuest(Student s, int questId){
        // Since points cannot be negative a -1 indicates a failure to retrive
        if(s == null || questId < 0) return -1;
        return findQuest(questId).completeFor(s);
    }

    public void printAllQuests(){
        // Work around to convert collection to list
        List<Quest> quests = new ArrayList<>(questsById.values());
        RewardUtil.printAll(quests);
    }

    public void printAssignmentsFor(Student s){
        List<Quest> studentQuests = assignments.get(s);
        RewardUtil.printAll(studentQuests);
    }



}
