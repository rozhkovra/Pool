package ru.smallmazila.pool.test;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class PoolTableTest extends Activity {
	class TableView extends View {
		Paint paint;
		
		public TableView(Context context){
			super(context);
			paint = new Paint();
		}
		
		protected void onDraw(Canvas canvas){
			//canvas.drawColor(Color.GREEN);
			canvas.drawRGB(34, 177, 76);
		}
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(new TableView(this));
	}
}
