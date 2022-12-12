import java.util.ArrayList;
import java.util.List;

public class DrawMovingObject {

    List<MoveToUnivercity> objts = new ArrayList<>();

    public void addObj (MoveToUnivercity obj){
        objts.add(obj);
    }
    public void drawEveryoneRunning(){
        for (MoveToUnivercity obj : objts){
            obj.run();
        }
    }

}
