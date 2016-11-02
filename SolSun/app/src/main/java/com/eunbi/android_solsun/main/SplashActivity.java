package com.eunbi.android_solsun.main;

import com.eunbi.android_solsun.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class SplashActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Window win = getWindow();
		win.requestFeature(Window.FEATURE_NO_TITLE);
		//win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_splash);
		
		Handler handlerSplash = new Handler(){
			public void handleMessage(Message msg){
				Intent intent = new Intent(getApplication(), MainActivity.class);
				startActivity(intent);
				finish();
			}
		};
		handlerSplash.sendEmptyMessageDelayed(0, 2000);
	}
}
