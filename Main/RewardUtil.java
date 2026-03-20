package Main;
import java.util.List;

public class RewardUtil {
    public static<T> void printAll(List<T> item){
        for (T t : item) {
            System.out.println(t.toString() + "\n");
        }
    }

    public static int sumPoints(List<? extends Student> students){
        
        int sum = 0;

        for (Student student : students) {
            sum += student.getPoints();
        }

        return sum;
    }
}
