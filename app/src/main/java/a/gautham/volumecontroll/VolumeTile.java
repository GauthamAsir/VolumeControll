package a.gautham.volumecontroll;

import android.content.Context;
import android.media.AudioManager;
import android.service.quicksettings.TileService;

public class VolumeTile extends TileService {

    @Override
    public void onClick() {
        super.onClick();

        AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
        audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC, AudioManager.ADJUST_SAME, AudioManager.FLAG_SHOW_UI);

    }
}
