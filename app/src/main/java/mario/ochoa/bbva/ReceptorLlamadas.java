package mario.ochoa.bbva;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/**
 * Created by saulgarcia on 29/10/17.
 */


public class ReceptorLlamadas extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        call(context);
    }

    public MediaPlayer mPlayer;

    private void call(Context context) {
        PhoneCallListener phoneListener = new PhoneCallListener();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        telephonyManager.listen(phoneListener, PhoneStateListener.LISTEN_CALL_STATE);
    }

    private class PhoneCallListener extends PhoneStateListener {
        public boolean isPhoneCalling = false;
        Boolean wasRinging = false;

        @Override
        public void onCallStateChanged(int state, String incomingNumber) {
            if (TelephonyManager.CALL_STATE_RINGING == state) {
                // phone ringing
                //Aquí ya detectas que el teléfono esta recibiendo una llamada entrante

            }
            if (TelephonyManager.CALL_STATE_OFFHOOK == state) {
                // active
                isPhoneCalling = true;
                if (mPlayer != null && mPlayer.isPlaying()) {
                    mPlayer.setVolume(0, 0);
                }
            }

            if (TelephonyManager.CALL_STATE_IDLE == state) {

                isPhoneCalling = false;
            }

        }
    }
}