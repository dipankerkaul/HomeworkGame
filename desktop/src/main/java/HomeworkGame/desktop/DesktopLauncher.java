
/*
package HomeworkGame.desktop;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import HomeworkGame.HomeworkGame;

/** Launches the desktop (LWJGL) application. */
/*public class DesktopLauncher {
	public static void main(String[] args) {
		createApplication();
	}

	private static LwjglApplication createApplication() {
		return new LwjglApplication(new HomeworkGame(), getDefaultConfiguration());
	}

	private static LwjglApplicationConfiguration getDefaultConfiguration() {
		LwjglApplicationConfiguration configuration = new LwjglApplicationConfiguration();
		configuration.title = "HomeworkGame";
		configuration.width = 640;
		configuration.height = 480;
		//// This prevents a confusing error that would appear after exiting normally.
		configuration.forceExit = false;
		
		for (int size : new int[] { 128, 64, 32, 16 }) {
			configuration.addIcon("libgdx" + size + ".png", FileType.Internal);
		}
		return configuration;
	}
}
*/

package HomeworkGame.desktop;

import HomeworkGame.HomeworkGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
public class DesktopLauncher
{
	public static void main (String[] args)
	{
		HomeworkGame myGame = new HomeworkGame();
		LwjglApplication launcher
				= new LwjglApplication( myGame, "The Missing Homework", 800, 600 );
	}
}