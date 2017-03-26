package project.mobifly.com.studio_trymash.Activity;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import project.mobifly.com.studio_trymash.R;

public class SoundSettingsActivity extends Activity {
    static Button b1=null,b2=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_settings);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                MainActivity.sound=true;
                b1.setBackgroundColor(Color.YELLOW);
                b2.setBackgroundColor(0);
            }
        });
        b2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                MainActivity.sound = false;
                b2.setBackgroundColor(Color.YELLOW);
                b1.setBackgroundColor(0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sound_settings, menu);
        return true;
    }

}
