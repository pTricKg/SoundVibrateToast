package com.ptrickg.soundvibratetoast;

<<<<<<< HEAD
import com.ptrickg.soundvibratetoast.R;

=======
>>>>>>> 2a91c9836768df1d02da7a398cc0dcc8dede5956
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AlarmActivity extends Activity {
<<<<<<< HEAD
  
/** Called when the activity is first created. */
=======

/** Video code has not been tested but works elsewhere
 * eeh
 */

    //Initialize variable for video view
	//VideoView displays while MediaController plays
	VideoView vView;
	MediaController vCont;
>>>>>>> 2a91c9836768df1d02da7a398cc0dcc8dede5956

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
<<<<<<< HEAD
=======
	
	//find vView
		vView = (VideoView) findViewById(R.id.videoView);
		//create controller
		vCont = new MediaController(this);
		//set controller to play video view
		vView.setMediaController(vCont);
		//set path to video form res/raw
		Uri video= Uri.parse("android.resource://com.pTricKg.soundVibarateToast/" + R.raw.data_asks_spock);
		//set path to video from sdcard
		vView.setVideoPath("android.resource://com.pTricKg.soundVibrateToast/" + R.raw.data_asks_spock); 
		// setting parsed video 
		vView.setVideoURI(video);
		vView.requestFocus();
		vCont.show();
		vView.start();
>>>>>>> 2a91c9836768df1d02da7a398cc0dcc8dede5956
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