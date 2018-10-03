package com.sampler.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sampler.GdxModuleInfoSample;
import com.sampler.GdxSamplerGame;

public class DesktopLauncherGdxModuleInfoSample {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		System.out.println("app = " + Gdx.app);
		
		new LwjglApplication(new GdxModuleInfoSample(), config);
		
		System.out.println("app after = " + Gdx.app);
	}
}
