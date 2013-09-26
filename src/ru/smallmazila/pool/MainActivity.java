package ru.smallmazila.pool;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity 
							implements View.OnClickListener {
	Button button;
	int touchCount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		button = new Button(this);
		button.setText("Touch me!");
		button.setOnClickListener(this);
		setContentView(button);
	}
	
	public void onClick(View v){
		touchCount++;
		button.setText("This is a new Pool!!!");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
