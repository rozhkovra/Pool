package ru.smallmazila.pool;

public class Table {
	public final static int POCKETS_COUNT = 6;
	public static final int TABLE_WIDTH = 400;
	public static final int TABLE_HEIGHT = 200;
	public static int TOP = 60;
	public static int LEFT = 40;
	public Pocket[] pockets;
	
	public Table(){
		this.pockets = new Pocket[POCKETS_COUNT];
		for(int i = 0; i < POCKETS_COUNT; i++)
			pockets[i] = new Pocket(); 
	}
}
