package project.mobifly.com.studio_trymash.DatabaseHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import project.mobifly.com.studio_trymash.Utils.Constant;

public class Mydb extends SQLiteOpenHelper{

	public Mydb(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		arg0.execSQL(Constant.CREATE_TABLE_QUERY);
		for(int i=1;i<=10;i++)
		{
			arg0.execSQL("insert into rscore(id,name,score) values('"+i+"','kajal',30)");
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
