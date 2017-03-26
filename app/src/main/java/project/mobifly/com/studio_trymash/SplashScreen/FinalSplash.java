package project.mobifly.com.studio_trymash.SplashScreen;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

import project.mobifly.com.studio_trymash.R;
import project.mobifly.com.studio_trymash.Activity.MainActivity;

public class FinalSplash extends Activity {
    static MediaPlayer song=null;
    static ImageView iv1=null;
    static ImageView iv2=null;
    static ImageView iv3=null;
    static ImageView iv4=null;
    static ImageView iv5=null;
    static ImageView iv6=null;
    static ImageView iv7=null;
    static ImageView iv8=null;
    static ImageView iv9=null;
    static ImageView iv10=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_splash);
        song=MediaPlayer.create(FinalSplash.this, R.raw.ssound);
        song.start();
        Thread stimer=new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(2200);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    MainActivity.mcount=0;
                    MainActivity.level=3;
                    Intent open=new Intent(FinalSplash.this, MainActivity.class);
                    startActivity(open);
                }
            }
        };stimer.start();

        iv1=(ImageView) findViewById(R.id.iv1);
        iv2=(ImageView) findViewById(R.id.iv2);
        iv3=(ImageView)findViewById(R.id.iv3);
        iv4=(ImageView)findViewById(R.id.iv4);
        iv5=(ImageView)findViewById(R.id.iv5);
        iv6=(ImageView)findViewById(R.id.iv6);
        iv7=(ImageView)findViewById(R.id.iv7);
        iv8=(ImageView)findViewById(R.id.iv8);
        iv9=(ImageView)findViewById(R.id.iv9);
        iv10=(ImageView)findViewById(R.id.iv10);
        //wel=(ImageView)findViewById(R.id.wel);

        iv1.setImageResource(R.drawable.f);
        iv2.setImageResource(R.drawable.i);
        iv3.setImageResource(R.drawable.n);
        iv4.setImageResource(R.drawable.a);
        iv5.setImageResource(R.drawable.l);
        iv6.setImageResource(R.drawable.l1);
        iv7.setImageResource(R.drawable.v);
        iv8.setImageResource(R.drawable.v);
        iv9.setImageResource(R.drawable.v);
        iv10.setImageResource(R.drawable.l2);
        Animation a1=AnimationUtils.loadAnimation(FinalSplash.this, R.anim.show);
        iv1.startAnimation(a1);
        iv2.startAnimation(a1);
        iv3.startAnimation(a1);
        iv4.startAnimation(a1);
        iv5.startAnimation(a1);
        iv6.startAnimation(a1);
        iv7.startAnimation(a1);
        iv8.startAnimation(a1);
        iv9.startAnimation(a1);
        iv10.startAnimation(a1);
        a1.setAnimationListener(new AnimationListener() {

            @Override
            public void onAnimationStart(Animation arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation arg0) {
                // TODO Auto-generated method stub
                Animation a2=AnimationUtils.loadAnimation(FinalSplash.this, R.anim.rshow);
                iv1.startAnimation(a2);
                iv2.startAnimation(a2);
                iv3.startAnimation(a2);
                iv4.startAnimation(a2);
                iv5.startAnimation(a2);
                iv6.startAnimation(a2);
                iv7.startAnimation(a2);
                iv8.startAnimation(a2);
                iv9.startAnimation(a2);
                iv10.startAnimation(a2);
                a2.setAnimationListener(new AnimationListener() {

                    @Override
                    public void onAnimationStart(Animation arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onAnimationRepeat(Animation arg0) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void onAnimationEnd(Animation arg0) {
                        // TODO Auto-generated method stub
                        iv1.setImageDrawable(null);
                        iv2.setImageDrawable(null);
                        iv3.setImageDrawable(null);
                        iv4.setImageDrawable(null);
                        iv5.setImageDrawable(null);
                        iv6.setImageDrawable(null);
                        iv7.setImageDrawable(null);
                        iv8.setImageDrawable(null);
                        iv9.setImageDrawable(null);
                        iv10.setImageDrawable(null);

                    }
                });

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.final_splash, menu);
        return true;
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        song.release();
        finish();
    }


}
