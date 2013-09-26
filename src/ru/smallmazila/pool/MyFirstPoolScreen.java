package ru.smallmazila.pool;

import ru.smallmazila.framework.Game;
import ru.smallmazila.framework.Graphics.PixmapFormat;
import ru.smallmazila.framework.Pixmap;
import ru.smallmazila.framework.Screen;

public class MyFirstPoolScreen extends Screen {
	Pixmap background;
	int x;
	
	public MyFirstPoolScreen(Game game){
		super(game);
		background = game.getGraphics().newPixmap("background.png", PixmapFormat.RGB565);
	}
	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		x += 50 * deltaTime;
		if(x > 100)
			x = 0;
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		game.getGraphics().clear(0);
		game.getGraphics().drawPixmap(background, x, 0, 0, 0, background.getWidth(), background.getHeight());
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
		background.dispose();
	}

}
