package a.gautham.volumecontroll;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.service.quicksettings.TileService;

import androidx.annotation.RequiresApi;

public class VolumeTile extends TileService {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onClick() {
        super.onClick();

        AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, AudioManager.ADJUST_SAME, AudioManager.FLAG_SHOW_UI);

    }
}
