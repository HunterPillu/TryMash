package project.mobifly.com.studio_trymash.Utils;

import android.os.Handler;

import project.mobifly.com.studio_trymash.Activity.MainActivity;

public class Timer {
	Handler thandle=new Handler();
	int i=0;
	/////////////////////////////static int fetch=0;
	public  void myThread()
	{
Thread t=new Thread()
{	
@Override
public void run()
{
	
	
	if(MainActivity.level==0)
	{
		MainActivity.fetch=30;
	for(i=0;i<=30;i++)
	{
	thandle.post(new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			if(!MainActivity.pause)
			{
			MainActivity.fetch=MainActivity.fetch-1;
			
			if(MainActivity.fetch<10 )
			MainActivity.ttv.setText(Constant.ZERO+MainActivity.fetch+"");
			else
				MainActivity.ttv.setText(MainActivity.fetch+"");
			if(MainActivity.fetch==0)
			{
				/*Toast t=Toast.makeText(MainActivity.act, "Sorry time is Up....",4000);//////..........not working............///////
				t.show();*/
				finish();
				System.exit(0);
			}
						}
			else
			{
				i--;
			}
		}

		private void finish() {
			// TODO Auto-generated method stub
			
		}
	});
	try {
		
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}
	else
	{
	if(MainActivity.level==2)
	{
		MainActivity.fetch=55;
	for(i=0;i<=55;i++)
	{
	thandle.post(new Runnable() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			if(!MainActivity.pause)
			{
				MainActivity.fetch=MainActivity.fetch-1;
			if(MainActivity.fetch<10 )
			{
			MainActivity.ttv.setText(Constant.ZERO+MainActivity.fetch+"");
			}
			else
			{
				MainActivity.ttv.setText(MainActivity.fetch+"");
			}
			if(MainActivity.fetch==0)
			{
				/*Toast t=Toast.makeText(MainActivity.act, "Sorry time is Up....",4000);//////..........not working............///////
				t.show();*/
				finish();
				System.exit(0);
			}
			}
			else
			{
				i--;
			}
		}

		private void finish() {
			// TODO Auto-generated method stub
			
		}
	});
	try {
		
			
			Thread.sleep(1850);
			
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}
	else
	{
		MainActivity.fetch=125;
		for(i=0;i<=125;i++)
		{
		thandle.post(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				if(!MainActivity.pause)
				{
					MainActivity.fetch=MainActivity.fetch-1;
				if(MainActivity.fetch<10)
				MainActivity.ttv.setText(Constant.ZERO+MainActivity.fetch+"");
				else
					MainActivity.ttv.setText(MainActivity.fetch+"");
				if(MainActivity.fetch==0)
				{
					/*Toast t=Toast.makeText(MainActivity.act, "Sorry time is Up....",4000);//////..........not working............///////
					t.show();*/
					finish();
					System.exit(0);
				}
				}
				else
				{
					i--;
				}
			}

			private void finish() {
				// TODO Auto-generated method stub
				
			}
		});
		try {
			
				
				Thread.sleep(2100);
				
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	}
	
}
};
t.start();
}
}