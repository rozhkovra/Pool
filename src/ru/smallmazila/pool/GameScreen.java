package ru.smallmazila.pool;

import java.util.List;

import ru.smallmazila.framework.Game;
import ru.smallmazila.framework.Graphics;
import ru.smallmazila.framework.Input.TouchEvent;
import ru.smallmazila.framework.Screen;
import ru.smallmazila.pool.math.BallPosition;
import android.graphics.Rect;

public class GameScreen extends Screen {
	World world;
	public static Rect pocketRect = new Rect(400, 0, 400 + 100, 100);
	public static Rect cueBallRect = new Rect(430, 140, 430 + 22, 140 + 22);
	public static Rect ballRect = new Rect(430, 100, 430 + 22, 100 + 22);
	public static Rect cueRect = new Rect(0, 315, 0 + 160, 315 + 10);
	
	public GameScreen(Game game){
		super(game);
		world = new World();
	}
	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		game.getInput().getKeyEvents();
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		Graphics g = game.getGraphics();
		g.clear(0xffffff);
		
		drawWorld(world);
	}
	
	private void drawWorld(World world){
		Graphics g = game.getGraphics();
		
		// draw background
		g.clear(0xff9f6342);
		//draw table
		g.drawRect(Table.LEFT, Table.TOP, Table.TABLE_WIDTH, Table.TABLE_HEIGHT, 0xff22b14c);
		//draw pockets
		g.drawPixmap(Assets.objects
					, Pocket.TOPLEFTX
					, Pocket.TOPLEFTY
					, pocketRect.left
					, pocketRect.top
					, pocketRect.width()
					, pocketRect.height());
		g.drawPixmap(Assets.objects
					, Pocket.TOPMIDDLEX
					, Pocket.TOPMIDDLEY
					, pocketRect.left
					, pocketRect.top
					, pocketRect.width()
					, pocketRect.height());
		g.drawPixmap(Assets.objects
					, Pocket.TOPRIGHTX
					, Pocket.TOPRIGHTY
					, pocketRect.left
					, pocketRect.top
					, pocketRect.width()
					, pocketRect.height());
		g.drawPixmap(Assets.objects
					, Pocket.BOTTOMLEFTX
					, Pocket.BOTTOMLEFTY
					, pocketRect.left
					, pocketRect.top
					, pocketRect.width()
					, pocketRect.height());
		g.drawPixmap(Assets.objects
					, Pocket.BOTTOMMIDDLEX
					, Pocket.BOTTOMMIDDLEY
					, pocketRect.left
					, pocketRect.top
					, pocketRect.width()
					, pocketRect.height());
		g.drawPixmap(Assets.objects
					, Pocket.BOTTOMRIGHTX
					, Pocket.BOTTOMRIGHTY
					, pocketRect.left
					, pocketRect.top
					, pocketRect.width()
					, pocketRect.height());
		
		//CueBall
		g.drawPixmap(Assets.objects
					, CueBall.STARTX
					, CueBall.STARTY
					, cueBallRect.left
					, cueBallRect.top
					, cueBallRect.width()
					, cueBallRect.height());
		int startBallX = BallPosition.firstBallStartX();
		int startBallY = BallPosition.firstBallStartY();
		//FirstBall
		g.drawPixmap(Assets.objects
					, startBallX
					, startBallY
					, ballRect.left
					, ballRect.top
					, ballRect.width()
					, ballRect.height());

		int ballX = (int)(startBallX + 2*Ball.BALL_RADIUS*0.866);
		int ballY = startBallY + Ball.BALL_RADIUS;
		//SecondBall
		g.drawPixmap(Assets.objects
					, ballX
					, ballY
					, ballRect.left
					, ballRect.top
					, ballRect.width()
					, ballRect.height());
		ballY = startBallY - Ball.BALL_RADIUS;
		//ThirdBall
		g.drawPixmap(Assets.objects
					, ballX
					, ballY
					, ballRect.left
					, ballRect.top
					, ballRect.width()
					, ballRect.height());
		startBallX = ballX;
		startBallY = ballY;
		ballX = (int)(startBallX + 2*Ball.BALL_RADIUS*0.866);
		ballY = startBallY + Ball.BALL_RADIUS;
		//FourBall
		g.drawPixmap(Assets.objects
				, ballX
				, ballY
				, ballRect.left
				, ballRect.top
				, ballRect.width()
				, ballRect.height());
		ballY = startBallY - Ball.BALL_RADIUS;
		//FifthBall
		g.drawPixmap(Assets.objects
					, ballX
					, ballY
					, ballRect.left
					, ballRect.top
					, ballRect.width()
					, ballRect.height());
		ballY = startBallY + 3*Ball.BALL_RADIUS;
		//FifthBall
		g.drawPixmap(Assets.objects
					, ballX
					, ballY
					, ballRect.left
					, ballRect.top
					, ballRect.width()
					, ballRect.height());
		
		g.drawPixmap(Assets.objects
				, CueBall.STARTX - Cue.CUE_LENGTH - Ball.BALL_RADIUS
				, Table.TOP+Table.TABLE_HEIGHT/2
				, cueRect.left
				, cueRect.top
				, cueRect.width()
				, cueRect.height());
		//g.drawRect(0, 0, Table.TABLE_WIDTH, Table.TABLE_HEIGHT, 0xff22b14c);
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
