package ru.smallmazila.pool.math;

import ru.smallmazila.pool.Table;

public class BallPosition {	
	public static int firstBallStartX(){
		return Table.LEFT+3*Table.TABLE_WIDTH/4-25;
	}
	
	public static int firstBallStartY(){
		return Table.TOP+Table.TABLE_HEIGHT/2-25;
	}
}
