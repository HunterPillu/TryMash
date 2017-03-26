package project.mobifly.com.studio_trymash.Activity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import project.mobifly.com.studio_trymash.R;

public class FirstActivity extends Activity {
    static Button sg=null;
    static Button hs=null;
    static Button eg=null;
    static Button ss=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        sg=(Button) findViewById(R.id.sg);
        hs=(Button) findViewById(R.id.hs);
        eg=(Button) findViewById(R.id.eg);
        ss=(Button) findViewById(R.id.ss);
        sg.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in2=new Intent(FirstActivity.this, MainActivity.class);
                startActivity(in2);
            }
        });
        hs.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in=new Intent(FirstActivity.this, HighScoreActivity.class);
                startActivity(in);
            }
        });
        ss.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent in1=new Intent(FirstActivity.this, SoundSettingsActivity.class);
                startActivity(in1);
            }
        });
        eg.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }

}
