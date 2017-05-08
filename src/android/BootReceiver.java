package rodolfojnn.cordova.plugin.bootstart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.ionic.starter.MainActivity;


public class BootReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
	}
}
