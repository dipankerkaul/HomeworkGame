package HomeworkGame.desktop;

import HomeworkGame.HomeworkGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
public class Launcher
{
    public static void main (String[] args)
    {
        HomeworkGame myGame = new HomeworkGame();
        LwjglApplication launcher
                = new LwjglApplication( myGame, "The Missing Homework", 800, 600 );
    }
}