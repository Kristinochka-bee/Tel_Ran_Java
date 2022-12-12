
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Student extends Human{

    /*
    Map<String,Integer> studentLessons;
     */

    List<String> lessonsIDs;


    public Student(String name, String secondName) {
        super(name, secondName);
        //studentLessons = new HashMap<String,Integer>();
        lessonsIDs = new LinkedList<>();
    }

    @Override
    void bePresentOnLesson(String lessonID) {
        lessonsIDs.add(lessonID);
    }

    @Override
    public void run() {
        System.out.println("Im student " + getName() + "and im running to University ");
    }

    @Override
    public void walk() {

    }


/*
    //отслеживает колличество посещенных уроков
    @Override
    void bePresentOnLesson(String lessonID) {
        if( !studentLessons.containsKey(lessonID)){
            studentLessons.put(lessonID,1);
        }else {
            Integer value = studentLessons.get(lessonID);
            studentLessons.put(lessonID, value+1);
        }


    }

 */


}
