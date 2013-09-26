package ru.smallmazila.pool;

import ru.smallmazila.framework.Game;
import ru.smallmazila.framework.Graphics;
import ru.smallmazila.framework.Graphics.PixmapFormat;
import ru.smallmazila.framework.Screen;
import android.util.Log;

public class LoadingScreen extends Screen {

	public LoadingScreen(Game game){
		super(game);
	}
	
	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		Log.d("LoadingScreen", "start LoadingScreen");
		Graphics g = game.getGraphics();
		Assets.background = g.newPixmap("background.png", PixmapFormat.RGB565);
		Assets.logo = g.newPixmap("logo.jpg", PixmapFormat.ARGB4444);
		Assets.mainMenu = g.newPixmap("MainMenu.png", PixmapFormat.ARGB4444);
		Assets.objects = g.newPixmap("objects.png", PixmapFormat.ARGB4444);
		
		Assets.click = game.getAudio().newSound("click.ogg"); 
		Log.d("LoadingScreen", "draw LoadingScreen");
		
		game.setScreen(new MainMenuScreen(game));
		
	}

	@Override
	public void present(float deltaTime) {
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
