package ru.smallmazila.pool;

import ru.smallmazila.framework.Screen;
import ru.smallmazila.framework.impl.AndroidGame;

public class PoolGame extends AndroidGame {
	@Override
	public Screen getStartScreen(){
		return new LoadingScreen(this);
	}
}
