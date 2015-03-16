package com.behr.pacdan.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.behr.pacdan.PacDanGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
                cfg.title = PacDanGame.TITLE;
        cfg.width = PacDanGame.WIDTH;
        cfg.height = PacDanGame.HEIGHT;
        cfg.foregroundFPS = 60;
        //cfg.useGL20 = false;
        cfg.resizable = false;
		new LwjglApplication(new PacDanGame(), cfg);
	}
}
