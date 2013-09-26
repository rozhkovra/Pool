package ru.smallmazila.pool.test;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class PoolStartScreenTest extends Activity {
	class RenderView extends View {
		Bitmap background;
		Rect dst = new Rect();
		
		public RenderView(Context context){
			super(context);
			
			InputStream inputStream = null;
			try{
				AssetManager assetManager = context.getAssets();
				inputStream = assetManager.open("background.png");
				background = BitmapFactory.decodeStream(inputStream);
				inputStream.close();
			}catch(IOException e){
				
			}finally{
				try{
					if(inputStream != null)
						inputStream.close();						
				}catch(IOException e){					
				}
			}
		}
		
		protected void onDraw(Canvas canvas){
			dst.set(0, 0, 480, 320);
			canvas.drawBitmap(background, null, dst, null);
			invalidate();
		}
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(new RenderView(this));
	}
	
}
