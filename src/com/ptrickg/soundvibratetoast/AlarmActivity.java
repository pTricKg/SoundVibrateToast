package com.ptrickg.soundvibratetoast;

import com.ptrickg.soundvibratetoast.R;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AlarmActivity extends Activity {
  
/** Called when the activity is first created. */

/** Video code has not been tested but works elsewhere

    //Initialize variable for video view
	//VideoView displays while MediaController plays
	VideoView vView = null;
	MediaController vCont = null;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
	
	//find vView
		vView = (VideoView) findViewById(R.id.videoView);
		//create controller
		vCont = new MediaController(this);
		//set controller to play video view
		vView.setMediaController(vCont);
		//set path to video form res/raw
		Uri video= Uri.parse("android.resource://com.pTricKg.soundVibarateToast/" + R.raw.data_asks_spock);
		//set path to video from sdcard
		//vView.setVideoPath("mnt/sdcard/Movies/data_asks_spock.mp4"); 
		// setting parsed video 
		vView.setVideoURI(video);
		vView.requestFocus();
		vCont.show();
		vView.start();
  }

  public void startAlert(View view) {
    EditText text = (EditText) findViewById(R.id.time);
    int i = Integer.parseInt(text.getText().toString());
    Intent intent = new Intent(this, MyBroadcastReceiver.class);
    PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 234324243, intent, 0);
    AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
    alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
        + (i * 1000), pendingIntent);
    Toast.makeText(this, "Let irradiation commence in " + i + " seconds",
        Toast.LENGTH_LONG).show();
  }

} 