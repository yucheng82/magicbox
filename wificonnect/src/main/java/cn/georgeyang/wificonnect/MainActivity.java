package cn.georgeyang.wificonnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import online.magicbox.lib.PluginActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PluginActivity.init("cn.georgeyang.wificonnect","magicbox");
        Intent intent = PluginActivity.buildIntent(this,MainSlice.class);
        startActivity(intent);

        finish();
    }
}
