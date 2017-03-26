package project.mobifly.com.studio_trymash.SplashScreen;

import android.media.MediaPlayer;
import android.view.animation.Animation.AnimationListener;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import project.mobifly.com.studio_trymash.Activity.FirstActivity;
import project.mobifly.com.studio_trymash.R;

public class Splash extends Activity {
    static MediaPlayer song = null;
    static ImageView iv1 = null;
    static ImageView iv2 = null;
    static ImageView iv3 = null;
    static ImageView iv4 = null;
    static ImageView iv5 = null;
    static ImageView iv6 = null;
    static ImageView iv7 = null;
    static ImageView wel = null;

    //static ImageView iv1=null;
    //static ImageView iv2=null;
    //static ImageView iv3=null;
    //static TextView show=null;
    //static Boolean temp=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        song = MediaPlayer.create(Splash.this, R.raw.ssound);
        song.start();
        Thread stimer = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent open = new Intent(Splash.this, FirstActivity.class);
                    startActivity(open);
                }
            }
        };
        stimer.start();

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv5 = (ImageView) findViewById(R.id.iv5);
        iv6 = (ImageView) findViewById(R.id.iv6);
        iv7 = (ImageView) findViewById(R.id.iv7);
        wel = (ImageView)findViewById(R.id.wel);
                Animation wa = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.show);
        wel.startAnimation(wa);
        wa.setAnimationListener(new AnimationListener() {

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
                iv1.setBackgroundResource(R.drawable.blackt);
                iv2.setBackgroundResource(R.drawable.blackr);
                iv3.setBackgroundResource(R.drawable.blacky);
                Animation a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.show);
                iv1.startAnimation(a);
                iv2.startAnimation(a);
                iv3.startAnimation(a);
                a.setAnimationListener(new AnimationListener() {

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
						/*iv1.setBackground(null);
						iv2.setBackground(null);
						iv3.setBackground(null);
						iv1.setText("T");
						iv2.setText("R");
						iv3.setText("Y");*/
                                               iv1.setBackgroundResource(R.drawable.blackt);
                                               iv2.setBackgroundResource(R.drawable.blackr);
                                               iv3.setBackgroundResource(R.drawable.blacky);

                                               iv4.setBackgroundResource(R.drawable.blackm);
                                               iv5.setBackgroundResource(R.drawable.blacka);
                                               iv6.setBackgroundResource(R.drawable.blacks);
                                               iv7.setBackgroundResource(R.drawable.blackh);
                                               Animation a1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.show);
                                               iv4.startAnimation(a1);
                                               iv5.startAnimation(a1);
                                               iv6.startAnimation(a1);
                                               iv7.startAnimation(a1);
                                               a1.setAnimationListener(new AnimationListener() {

                                                   @Override
                                                   public void onAnimationStart(Animation arg0) {
                                                       // TODO Auto-generated method stub

                                                   }

                                                   @Override
                                                   public void onAnimationRepeat(Animation arg0) {
                                                       // TODO Auto-generated method stub

                                                   }

                                                   ////////////////////////
                                                   @Override
                                                   public void onAnimationEnd(Animation arg0) {
                                                       // TODO Auto-generated method stub
                                                       iv4.setBackgroundResource(R.drawable.blackm);
                                                       iv5.setBackgroundResource(R.drawable.blacka);
                                                       iv6.setBackgroundResource(R.drawable.blacks);
                                                       iv7.setBackgroundResource(R.drawable.blackh);
                                                   }
                                                   ////////////////////////
                                               });
                                           }
                                       }
                );
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.splash, menu);
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