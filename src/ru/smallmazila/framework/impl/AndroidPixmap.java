package ru.smallmazila.framework.impl;

import ru.smallmazila.framework.Graphics.PixmapFormat;
import ru.smallmazila.framework.Pixmap;
import android.graphics.Bitmap;

public class AndroidPixmap implements Pixmap {
	Bitmap bitmap;
	PixmapFormat format;
	
	public AndroidPixmap(Bitmap bitmap, PixmapFormat format){
		this.bitmap = bitmap;
		this.format = format;
	}
	
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return bitmap.getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return bitmap.getHeight();
	}

	@Override
	public PixmapFormat getFormat() {
		// TODO Auto-generated method stub
		return format;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		bitmap.recycle();
	}

}
