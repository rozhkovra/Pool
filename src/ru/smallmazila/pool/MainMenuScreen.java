package ru.smallmazila.pool;

import java.util.List;

import ru.smallmazila.framework.Game;
import ru.smallmazila.framework.Graphics;
import ru.smallmazila.framework.Input.TouchEvent;
import ru.smallmazila.framework.Screen;
import android.app.Activity;

public class MainMenuScreen extends Screen {

	public MainMenuScreen(Game game){
		super(game);
	}
	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		Graphics g = game.getGraphics();
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		game.getInput().getKeyEvents();
		
		int len = touchEvents.size();
		
		for(int i = 0; i < len; i++){
			TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_UP){
				if(inBounds(event, 30, 210, 60, 30)){
					game.setScreen(new GameScreen(game));
					Assets.click.play(1);
					return;
				}
				if(inBounds(event, 110, 210, 60, 30)){
					//game.setScreen(new HelpScreen(game));
					Assets.click.play(1);
					return;
				}
				if(inBounds(event, 190, 210, 50, 30)){
					Activity gameActivity = Activity.class.cast(game);
					Assets.click.play(1);
					gameActivity.finish();
					return;
				}
			}
		}
	}
	
	private boolean inBounds(TouchEvent event, int x, int y, int width, int height){
		if(event.x > x && event.x < x + width - 1 &&
				event.y > y && event.y < y + height - 1)
			return true;
		else
			return false;
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		Graphics g = game.getGraphics();
		
		g.drawPixmap(Assets.background, 0, 0);
		//g.drawPixmap(Assets.logo, x, y)
		//g.drawPixmap(Assets.mainMenu, 0, 0);
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
