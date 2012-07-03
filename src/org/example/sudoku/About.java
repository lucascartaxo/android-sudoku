package org.example.sudoku;

import android.app.Activity;
import android.os.Bundle;

public class About extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_Dialog);
		setContentView(R.layout.about);
	}

}
