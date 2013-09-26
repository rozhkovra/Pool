package ru.smallmazila.pool;

import ru.smallmazila.framework.Audio;
import ru.smallmazila.framework.FileIO;
import ru.smallmazila.framework.Game;
import ru.smallmazila.framework.Graphics;
import ru.smallmazila.framework.Input;
import ru.smallmazila.framework.Screen;
import android.app.Activity;

public class MyFirstPoolGame implements Game {

	@Override
	public Input getInput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileIO getFileIO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Audio getAudio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScreen(Screen screen) {
		// TODO Auto-generated method stub

	}

	@Override
	public Screen getCurrentScreen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Screen getStartScreen() {
		// TODO Auto-generated method stub
		return new MyFirstPoolScreen(this);
	}

}
