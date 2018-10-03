package com.sampler;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Logger;

public class GdxModuleInfoSample implements ApplicationListener {

	private static final Logger log = new Logger(GdxModuleInfoSample.class.getName(), Logger.DEBUG);
	
	@Override
	public void create() {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		
		log.debug("app = " + Gdx.app);
		log.debug("audio = " + Gdx.audio);
		log.debug("input = " + Gdx.input);
		log.debug("files = " + Gdx.files);
		log.debug("net = " + Gdx.net);
		log.debug("graphics = " + Gdx.graphics);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
}
