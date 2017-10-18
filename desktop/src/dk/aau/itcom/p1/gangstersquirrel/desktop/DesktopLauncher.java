package dk.aau.itcom.p1.gangstersquirrel.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import dk.aau.itcom.p1.gangstersquirrel.MainGameClass;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.foregroundFPS = 60;
		config.width = MainGameClass.WIDTH;
		config.height = MainGameClass.HEIGHT;
		config.resizable = false;

		new LwjglApplication(new MainGameClass(), config);
	}
}
