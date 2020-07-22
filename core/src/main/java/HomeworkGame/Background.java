package HomeworkGame;
//Hello
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.graphics.g2d.Animation;
public class Background extends BaseActor
{
    public Animation hallway;
    public Animation classroom;
    public Animation scienceLab;
    public Animation library;
    public Background(float x, float y, Stage s)
    {
        super(x,y,s);
        hallway = loadTexture("bg-hallway.jpg");
        classroom = loadTexture("bg-classroom.jpg");
        scienceLab = loadTexture("bg-science-lab.jpg");
        library = loadTexture("bg-library.jpg");
        setSize(800,600);
    }
}