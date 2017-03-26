package project.mobifly.com.studio_trymash.Activity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import project.mobifly.com.studio_trymash.R;
import project.mobifly.com.studio_trymash.Utils.Constant;

public class EndActivity extends Activity {
    static EditText eet=null;
    static Button sub=null;
    static int id=0;
    static int scr=0;
    static ImageView iv=null;
    static String str=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        eet=(EditText) findViewById(R.id.eet);
        sub=(Button)findViewById(R.id.sub);
        iv=(ImageView) findViewById(R.id.iv);
        MainActivity.level=0;
        final SQLiteDatabase sqlte=openOrCreateDatabase(Constant.DB, MODE_PRIVATE, null);
        Cursor cs=sqlte.rawQuery(Constant.SELECT_MIN_SCORE_QUERY,null);
        if(cs.moveToNext())
        {
            if(MainActivity.a>=cs.getInt(1))
            {
                scr=cs.getInt(1);
                id=cs.getInt(0);
			/*////	Toast to1=Toast.makeText(EndActivity.this,"minimun score is '"+scr+"' and id is '"+id+"'" , 19000);
				to1.show();////*/


                eet.setVisibility(View.VISIBLE);
                sub.setVisibility(View.VISIBLE);
            }

        }

        sub.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                str=eet.getText().toString();
                if(str!=null)
                {
                    sqlte.execSQL("update rscore set name='"+str+"',score='"+MainActivity.a+"' where id='"+id+"'");
		/*///	Toast t=Toast.makeText(EndActivity.this,"Score Updated Successfully", 10000);
			t.show();///*/
                    Intent go=new Intent(getApplicationContext(), HighScoreActivity.class);
                    startActivity(go);
                }
                else
                {
                    Toast ttt=Toast.makeText(getApplicationContext(), Constant.ENTER_NAME_REQUEST,Toast.LENGTH_SHORT);
                    ttt.show();
                }

            }

        });
        iv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ine = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(ine);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.end, menu);
        return true;
    }

}
