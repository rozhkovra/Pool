package ru.smallmazila.pool;

public class World {
	public static final int BALL_COUNT = 15;
	public Table table;
	public Cue cue;
	public CueBall cueBall;
	public Ball[] balls;
	
	public World() {
		this.table = new Table();
		this.cue = new Cue();
		this.cueBall = new CueBall();
		this.balls = new Ball[BALL_COUNT];
		for(int i = 0; i < BALL_COUNT; i++)
			balls[i] = new Ball();
	}
}
