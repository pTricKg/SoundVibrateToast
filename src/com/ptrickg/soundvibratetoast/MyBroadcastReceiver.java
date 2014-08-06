package com.ptrickg.soundvibratetoast;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
  @Override
  // onRecieve from method startAlert from AlarmActivity
  public void onReceive(Context context, Intent intent) {
    Toast.makeText(context, "Irradiation of brain cells commence!.",
        Toast.LENGTH_LONG).show();
    // Vibrate the mobile phone
    Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    vibrator.vibrate(2000);
    
    // Play something for tablet, doesn't vibrate when asked to
    MediaPlayer mPlayer = MediaPlayer.create(context, R.raw.braincells);
    mPlayer.start();
  }

} 