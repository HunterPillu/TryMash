///android gmap api v2
//go first link
//get stratted
//go debug....somthing option......
///copy a cmd into notepad
//then paste the our eclipse debug key store path into "  " and then edited cmd run on cmd prompt

//open google api consol.....
//go net create project
//project name   then go further and google map android api v2
//then go again up and go to API Access ......go to eclipse and create proj for using GApi......Go to ...create new android key....then paste  here shai   into a blang space then add semicolon....and then write hereour package name....  click and then we get our google android Api key... 
//add api key to our aap
//copy  
//go aap ,,manifest......application...copy metadata....copy Api key here in name att
//then copy permissions from net...and paste into manifest....
//copy user feature...
//paste in manifest....
//now for adding map;
//copy fragment tag and paste into the aap.....xml file...
///open android sdk manager...go extra library...go to google play services...if not then import from...folder..
//google play services_lib....import....
//eclips debug store...
package project.mobifly.com.studio_trymash.Utils;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import project.mobifly.com.studio_trymash.Activity.EndActivity;
import project.mobifly.com.studio_trymash.Activity.MainActivity;
import project.mobifly.com.studio_trymash.R;
import project.mobifly.com.studio_trymash.SplashScreen.FinalSplash;
import project.mobifly.com.studio_trymash.SplashScreen.NextSplash;

class Common extends ImageView
{
Handler handle=null;
Context cont=null;

int num=0;
	public Common(Context context) {
		super(context);
		cont=context;
		/*setImageResource(R.drawable.apple);
		setY(0);
		setX(120.0F);*/
		handle=new Handler();
		new Thread()
		{
			@Override
			public void run()
			{ 
				for(int i=1;i<= MainActivity.height/2-60;i++)
				{
					if(!MainActivity.pause)
					{
						
					handle.post(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							setY(getY()+2);
							if(MainActivity.fetch==1)
							{
								Toast t=Toast.makeText(cont, Constant.TIME_UP,Toast.LENGTH_SHORT);//////..........not working............///////
								t.show();
							}
}
						
					}); 
					} 
					else
					{
						i--;
					}
					try {
						if(MainActivity.level==0)
						{
						Thread.sleep(25);
						//MainActivity.iv.setBackgroundResource(R.drawable.l1blankbg);
						}
						else
						{
							if(MainActivity.level==2)
							{
							Thread.sleep(25);
							//MainActivity.iv.setBackgroundResource(R.drawable.blankbg);
							}
							else
							{
								Thread.sleep(30);
								//MainActivity.iv.setBackgroundResource(R.drawable.l3blankbg);
							}
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
//////////////////////From Hereeeeeeeeeeeeeeeeeeeee////////////////////////
				
				if(MainActivity.selectedFruitArr.contains(Common.this))
				{
					handle.post(new Runnable() {
						@Override
						public void run() {
							//Toast.makeText(cont, "Selected", Toast.LENGTH_SHORT).show();
							MainActivity.selectedFruitArr.remove(Common.this);
							MainActivity.selected=null;  //////////for removing select item//
							if((MainActivity.selectedFruitArr.size())==1)
							{
								if(MainActivity.level==0)
								{
								MainActivity.iv.setBackgroundResource(R.drawable.l1bg11);
								}
								else
								{
									if(MainActivity.level==2)
									{
										MainActivity.iv.setBackgroundResource(R.drawable.bg11);
									}
									else
									{
										MainActivity.iv.setBackgroundResource(R.drawable.l3bg11);
									}
								}
								//MainActivity.iv.setImageDrawable(null);
							}
							if((MainActivity.selectedFruitArr.size())==2)
							{
								if(MainActivity.level==2)
								{
									MainActivity.iv.setBackgroundResource(R.drawable.bg22);
								}
								else
								{
									MainActivity.iv.setBackgroundResource(R.drawable.l3bg22);
								}
								//MainActivity.iv.setImageDrawable(null);
							}
							if((MainActivity.selectedFruitArr.size())==3)
							{
								if(MainActivity.level==3)
								{
									MainActivity.iv.setBackgroundResource(R.drawable.l3bg33);
								}
								
								//MainActivity.iv.setImageDrawable(null);
							}
							if((MainActivity.selectedFruitArr.size())==0)
							{
								if(MainActivity.level==0)
								{
									MainActivity.iv.setBackgroundResource(R.drawable.l1blankbg);
									MainActivity.iv.setImageDrawable(null);
								}
								else
								{
									if(MainActivity.level==2)
									{
										MainActivity.iv.setBackgroundResource(R.drawable.blankbg);
										MainActivity.iv.setImageDrawable(null);
									}
									else
									{
										MainActivity.iv.setBackgroundResource(R.drawable.l3blankbg);
										MainActivity.iv.setImageDrawable(null);
									}
								}
								
							}
							
						}
					});
					
				}
				handle.post(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						Common.this.setVisibility(View.GONE);
						
					}
				});
				
			//////new////////////////////////
				
			}
		}.start();
		
		setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				ImageView img=(ImageView)arg0;
				MainActivity.ssong=MediaPlayer.create(cont, R.raw.blop);
				MainActivity.ssong.start();
				//Toast.makeText(cont, "Clicked "+img.getTag(), Toast.LENGTH_LONG).show();
				
///////////////done..............................................//////////////////////////////////////////////////////			
				
				if(MainActivity.selected!=null)
				{
					if(!(MainActivity.selected.equals(img.getTag().toString())))
					{
						
						MainActivity.a--;
						MainActivity.tv.setText(Constant.SCORE+MainActivity.a);
			        	
						for(int i=0;i<MainActivity.selectedFruitArr.size();i++)
						{
							
							ImageView chImage=(ImageView) MainActivity.selectedFruitArr.get(i);
							chImage.setImageResource(Integer.parseInt(MainActivity.fruitsMap.get(MainActivity.selected).toString()));
					
						}
						MainActivity.selectedFruitArr.removeAll(MainActivity.selectedFruitArr);
						MainActivity.selected=img.getTag().toString();

						MainActivity.selectedFruitArr.add(img);
        
						
					}
					else
					{
					if(MainActivity.selected.equals(img.getTag().toString()))
					{
					if(!MainActivity.selectedFruitArr.contains(img))
					{
					MainActivity.selectedFruitArr.add(img);
					}
					}
					}
         
				
				}
				else
				{
					MainActivity.selected=img.getTag().toString();

				if(!MainActivity.selectedFruitArr.contains(img))
					{
						MainActivity.selectedFruitArr.add(img);
					}

			
				}
///////////////done..............................................//////////////////////////////////////////////////////			
				int acount=MainActivity.selectedFruitArr.size();
				if(acount==1)
				{
					ImageView let1=(ImageView) MainActivity.selectedFruitArr.get(0);
					if(MainActivity.level==0)
					{
						MainActivity.iv.setBackgroundResource(R.drawable.l1bg11);
					}
					else
					{
						if(MainActivity.level==2)
						{
							MainActivity.iv.setBackgroundResource(R.drawable.bg11);
						}
						else
						{
							MainActivity.iv.setBackgroundResource(R.drawable.l3bg11);
						}
					}
					
					/*if((let1.getTag().toString())=="apple")
							{
						
						MainActivity.iv.setImageResource(R.drawable.apple);
							}
					if((let1.getTag().toString())=="mango")
					{
				
				MainActivity.iv.setImageResource(R.drawable.shalu);
					}
					
					if((let1.getTag().toString())=="Grapes")
					{
				
				MainActivity.iv.setImageResource(R.drawable.grapes);
					}
					if((let1.getTag().toString())=="strawberry")
					{
				
				MainActivity.iv.setImageResource(R.drawable.strawberry);
					}
					if((let1.getTag().toString())=="orange")
					{
				
				MainActivity.iv.setImageResource(R.drawable.orange);
					}
					if((let1.getTag().toString())=="pear")
					{
				
				MainActivity.iv.setImageResource(R.drawable.pear);
					}
					if((let1.getTag().toString())=="lichee")
					{
				
				MainActivity.iv.setImageResource(R.drawable.lichee);
					}
					if((let1.getTag().toString())=="anar")
					{
				
				MainActivity.iv.setImageResource(R.drawable.anar);
					}*/
				}
				if(acount==2)
				{
					ImageView let1=(ImageView) MainActivity.selectedFruitArr.get(0);
					if(MainActivity.level==0)
					{
						MainActivity.iv.setBackgroundResource(R.drawable.l1bg22);
					}
					else
					{
						if(MainActivity.level==2)
						{
							MainActivity.iv.setBackgroundResource(R.drawable.bg22);
						}
						else
						{
							MainActivity.iv.setBackgroundResource(R.drawable.l3bg22);
						}
					}
					
				/*	if((let1.getTag().toString())=="apple")
							{
						
						MainActivity.iv.setImageResource(R.drawable.apple);
							}
					if((let1.getTag().toString())=="mango")
					{
				
				MainActivity.iv.setImageResource(R.drawable.shalu);
					}
					
					if((let1.getTag().toString())=="Grapes")
					{
				
				MainActivity.iv.setImageResource(R.drawable.grapes);
					}
					if((let1.getTag().toString())=="strawberry")
					{	
				MainActivity.iv.setImageResource(R.drawable.strawberry);
					}
					if((let1.getTag().toString())=="orange")
					{
				
				MainActivity.iv.setImageResource(R.drawable.orange);
					}
					if((let1.getTag().toString())=="pear")
					{
				
				MainActivity.iv.setImageResource(R.drawable.pear);
					}
					if((let1.getTag().toString())=="lichee")
					{
				
				MainActivity.iv.setImageResource(R.drawable.lichee);
					}
					if((let1.getTag().toString())=="anar")
					{
				
				MainActivity.iv.setImageResource(R.drawable.anar);
					}*/
				}
				if(acount==3)
				{
					ImageView let1=(ImageView) MainActivity.selectedFruitArr.get(0);
					//MainActivity.iv.setBackgroundResource(R.drawable.bg33);
/*Animation animn=AnimationUtils.loadAnimation(getContext(), R.anim.temp);
					
					MainActivity.iv.startAnimation(animn);*/
					if(MainActivity.level==2)
					{
						MainActivity.iv.setBackgroundResource(R.drawable.bg33);
					}
					else
					{
						MainActivity.iv.setBackgroundResource(R.drawable.l3bg33);
					}
					/*if((let1.getTag().toString())=="apple")
							{
						
						MainActivity.iv.setImageResource(R.drawable.apple);
							}
					if((let1.getTag().toString())=="mango")
					{
				
				MainActivity.iv.setImageResource(R.drawable.shalu);
					}
					
					if((let1.getTag().toString())=="Grapes")
					{
				
				MainActivity.iv.setImageResource(R.drawable.grapes);
					}
					if((let1.getTag().toString())=="strawberry")
					{
				
				MainActivity.iv.setImageResource(R.drawable.strawberry);
					}
					if((let1.getTag().toString())=="orange")
					{
				
				MainActivity.iv.setImageResource(R.drawable.orange);
					}
					if((let1.getTag().toString())=="pear")
					{
				
				MainActivity.iv.setImageResource(R.drawable.pear);
					}
					if((let1.getTag().toString())=="lichee")
					{
				
				MainActivity.iv.setImageResource(R.drawable.lichee);
					}
					if((let1.getTag().toString())=="anar")
					{
				
				MainActivity.iv.setImageResource(R.drawable.anar);
					}*/
				}
				if(acount==4)
				{
					ImageView let1=(ImageView) MainActivity.selectedFruitArr.get(0);
						MainActivity.iv.setBackgroundResource(R.drawable.l3bg44);
					
					/*if((let1.getTag().toString())=="apple")
							{
						
						MainActivity.iv.setImageResource(R.drawable.apple);
							}
					if((let1.getTag().toString())=="mango")
					{
				
				MainActivity.iv.setImageResource(R.drawable.shalu);
					}
					
					if((let1.getTag().toString())=="Grapes")
					{
				
				MainActivity.iv.setImageResource(R.drawable.grapes);
					}
					if((let1.getTag().toString())=="strawberry")
					{
				
				MainActivity.iv.setImageResource(R.drawable.strawberry);
					}
					if((let1.getTag().toString())=="orange")
					{
				
				MainActivity.iv.setImageResource(R.drawable.orange);
					}
					if((let1.getTag().toString())=="pear")
					{
				
				MainActivity.iv.setImageResource(R.drawable.pear);
					}
					if((let1.getTag().toString())=="lichee")
					{
				
				MainActivity.iv.setImageResource(R.drawable.lichee);
					}
					if((let1.getTag().toString())=="anar")
					{
				
				MainActivity.iv.setImageResource(R.drawable.anar);
					}*/
				}
				MainActivity.iv.setImageResource(Integer.parseInt(MainActivity.fruitsMap.get(MainActivity.selected).toString()));
				
				//////////////////////////////////////main logic\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
				if(MainActivity.level==0)
				{
				if(MainActivity.selectedFruitArr.size()==2)
				{
					MainActivity.selected=null;
					 MainActivity.chImage1=(ImageView) MainActivity.selectedFruitArr.get(0);
					 MainActivity.chImage2=(ImageView) MainActivity.selectedFruitArr.get(1);
					 //MainActivity.chImage3=(ImageView) MainActivity.selectedFruitArr.get(2);
					
					Animation anim1=AnimationUtils.loadAnimation(getContext(), R.anim.uniquesplash3anim);
					MainActivity.chImage1.startAnimation(anim1);
					MainActivity.chImage2.startAnimation(anim1);
					//MainActivity.chImage3.startAnimation(anim1);
					anim1.setAnimationListener(new AnimationListener() {
						@Override
						public void onAnimationStart(Animation arg0) {
							// TODO Auto-generated method stub
							MainActivity.iv.setBackgroundResource(R.drawable.l1bg22);
							MainActivity.chImage1.setImageResource(R.drawable.crush);
							MainActivity.chImage2.setImageResource(R.drawable.crush);
							//MainActivity.chImage3.setImageResource(R.drawable.crush);
						}
						
						@Override
						public void onAnimationRepeat(Animation arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void onAnimationEnd(Animation arg0) {
							// TODO Auto-generated method stub
							MainActivity.iv.setBackgroundResource(R.drawable.l1blankbg);
							MainActivity.iv.setImageDrawable(null);
							MainActivity.chImage1.setImageDrawable(null);
							MainActivity.chImage2.setImageDrawable(null);
							//MainActivity.chImage3.setImageDrawable(null);
						}
					});
					
					MainActivity.selectedFruitArr.removeAll(MainActivity.selectedFruitArr);	
					MainActivity.csong=MediaPlayer.create(cont, R.raw.crushs);
					MainActivity.csong.start();
					MainActivity.mcount++;
					/*MainActivity.iv.setBackgroundResource(R.drawable.blankbg);
					MainActivity.iv.setImageDrawable(null);
					MainActivity.aiv.setImageResource(R.drawable.finalarrow);*/
					Animation anim=AnimationUtils.loadAnimation(getContext(), R.anim.myanim);
					MainActivity.aiv.startAnimation(anim);
					anim.setAnimationListener(new AnimationListener() {
						
						@Override
						public void onAnimationStart(Animation arg0) {
							// TODO Auto-generated method stub
							
							MainActivity.aiv.setImageResource(R.drawable.finalarrow);
						}
						
						@Override
						public void onAnimationRepeat(Animation arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void onAnimationEnd(Animation arg0) {
							// TODO Auto-generated method stub
							 MainActivity.aiv.setImageDrawable(null);
							 MainActivity.a=MainActivity.a+20;
							 if(MainActivity.mcount==1)
								{
								 MainActivity.buciv.setBackgroundResource(R.drawable.one);		
								}
								if(MainActivity.mcount==2)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.two);	
									//MainActivity.tv.setText("Score : 20");
								}
								if(MainActivity.mcount==3)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.three);	
									//MainActivity.tv.setText("Score : 30");
									
									
								//	MainActivity.act.finish();
								}
								if(MainActivity.mcount==4)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.four);	
									//MainActivity.tv.setText("Score : 30");
								}
								if(MainActivity.mcount==5)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.five);	
									//MainActivity.tv.setText("Score : 30");
								}
								if(MainActivity.mcount==6)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.six);	
									//MainActivity.tv.setText("Score : 30");
								}
								if(MainActivity.mcount==7)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.seven);
									//MainActivity.tv.setText("Score : 30");
								}
								if(MainActivity.mcount==8)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.eight);	
									//MainActivity.tv.setText("Score : 30");
									if(MainActivity.level==0)
									{
										//MainActivity.bgsong.release();
									Toast t=Toast.makeText(cont, Constant.FIRST_LEVEL_COMPLETED,Toast.LENGTH_SHORT);
									t.show();									
									Intent in1=new Intent(cont, NextSplash.class);
									in1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
									cont.startActivity(in1);
									MainActivity.act.finish();
									}									
								}
								MainActivity.tv.setText(Constant.SCORE+MainActivity.a);
								
						}
					});	       
				}
				}
				else
				{
					if(MainActivity.level==2)
					{
				if(MainActivity.selectedFruitArr.size()==3)
				{
					MainActivity.selected=null;										
					 MainActivity.chImage1=(ImageView) MainActivity.selectedFruitArr.get(0);
					 MainActivity.chImage2=(ImageView) MainActivity.selectedFruitArr.get(1);
					 MainActivity.chImage3=(ImageView) MainActivity.selectedFruitArr.get(2);
					
					Animation anim1=AnimationUtils.loadAnimation(getContext(), R.anim.splash3anim);
					MainActivity.chImage1.startAnimation(anim1);
					MainActivity.chImage2.startAnimation(anim1);
					MainActivity.chImage3.startAnimation(anim1);
					anim1.setAnimationListener(new AnimationListener() {
						@Override
						public void onAnimationStart(Animation arg0) {
							// TODO Auto-generated method stub
							MainActivity.iv.setBackgroundResource(R.drawable.bg33);
							MainActivity.chImage1.setImageResource(R.drawable.crush);
							MainActivity.chImage2.setImageResource(R.drawable.crush);
							MainActivity.chImage3.setImageResource(R.drawable.crush);
						}
						
						@Override
						public void onAnimationRepeat(Animation arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void onAnimationEnd(Animation arg0) {
							// TODO Auto-generated method stub
							MainActivity.iv.setBackgroundResource(R.drawable.blankbg);
							MainActivity.iv.setImageDrawable(null);
							MainActivity.chImage1.setImageDrawable(null);
							MainActivity.chImage2.setImageDrawable(null);
							MainActivity.chImage3.setImageDrawable(null);
						}
					});
					
					MainActivity.selectedFruitArr.removeAll(MainActivity.selectedFruitArr);	
					MainActivity.csong=MediaPlayer.create(cont, R.raw.crushs);
					MainActivity.csong.start();
					MainActivity.mcount++;
					/*MainActivity.iv.setBackgroundResource(R.drawable.blankbg);
					MainActivity.iv.setImageDrawable(null);
					MainActivity.aiv.setImageResource(R.drawable.finalarrow);*/
					Animation anim=AnimationUtils.loadAnimation(getContext(), R.anim.myanim);
					MainActivity.aiv.startAnimation(anim);
					anim.setAnimationListener(new AnimationListener() {
						
						@Override
						public void onAnimationStart(Animation arg0) {
							// TODO Auto-generated method stub
							
							MainActivity.aiv.setImageResource(R.drawable.finalarrow);
						}
						
						@Override
						public void onAnimationRepeat(Animation arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void onAnimationEnd(Animation arg0) {
							// TODO Auto-generated method stub
							 MainActivity.aiv.setImageDrawable(null);
							 MainActivity.a=MainActivity.a+20;
							 if(MainActivity.mcount==1)
								{
								 MainActivity.buciv.setBackgroundResource(R.drawable.one);			
								}
								if(MainActivity.mcount==2)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.two);	
									//MainActivity.tv.setText("Score : 20");
								}
								if(MainActivity.mcount==3)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.three);	
									//MainActivity.tv.setText("Score : 30");
									
									
								//	MainActivity.act.finish();
								}
								if(MainActivity.mcount==4)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.four);	
									//MainActivity.tv.setText("Score : 30");
								}
								if(MainActivity.mcount==5)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.five);	
									//MainActivity.tv.setText("Score : 30");
								}
								if(MainActivity.mcount==6)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.six);	
									//MainActivity.tv.setText("Score : 30");
								}
								if(MainActivity.mcount==7)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.seven);
									//MainActivity.tv.setText("Score : 30");
								}
								if(MainActivity.mcount==8)
								{
									MainActivity.buciv.setBackgroundResource(R.drawable.eight);	
									//MainActivity.tv.setText("Score : 30");
									
									if(MainActivity.level==2)
									{
										
										Toast t1=Toast.makeText(cont, Constant.SECOND_LEVEL_COMPLETED,Toast.LENGTH_SHORT);
										t1.show();
										Intent nin=new Intent(cont,FinalSplash.class);
										nin.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
										cont.startActivity(nin);
										MainActivity.act.finish();
									}
								}
								
								
								/*if(MainActivity.mcount>=11)
								{
									Toast t=Toast.makeText(cont, "Sorry!!!! your bucket is going to Fill",15000);
									t.show();
									//MainActivity.buciv.setImageResource(R.drawable.fillb);	
									//MainActivity.tv.setText("Score : 30");
								}*/
								//MainActivity.a=MainActivity.a+20;
								MainActivity.tv.setText(Constant.SCORE+MainActivity.a);
								
						}
					});
			       
				}	//MainActivity.buciv.setImageResource(R.drawable.buc);
				}
					else
					{			
							if(MainActivity.selectedFruitArr.size()==4)
							{
								MainActivity.selected=null;														
								 MainActivity.chImage1=(ImageView) MainActivity.selectedFruitArr.get(0);
								 MainActivity.chImage2=(ImageView) MainActivity.selectedFruitArr.get(1);
								 MainActivity.chImage3=(ImageView) MainActivity.selectedFruitArr.get(2);
								 MainActivity.chImage4=(ImageView) MainActivity.selectedFruitArr.get(3);
								
								
								Animation anim1=AnimationUtils.loadAnimation(getContext(), R.anim.splash3anim);
								MainActivity.chImage1.startAnimation(anim1);
								MainActivity.chImage2.startAnimation(anim1);
								MainActivity.chImage3.startAnimation(anim1);
								MainActivity.chImage4.startAnimation(anim1);
								
								anim1.setAnimationListener(new AnimationListener() {
									@Override
									public void onAnimationStart(Animation arg0) {
										// TODO Auto-generated method stub
										MainActivity.iv.setBackgroundResource(R.drawable.l3bg44);
										

										MainActivity.chImage1.setImageResource(R.drawable.crush);
										MainActivity.chImage2.setImageResource(R.drawable.crush);
										MainActivity.chImage3.setImageResource(R.drawable.crush);
										MainActivity.chImage4.setImageResource(R.drawable.crush);
										
										
									}
									
									@Override
									public void onAnimationRepeat(Animation arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void onAnimationEnd(Animation arg0) {
										// TODO Auto-generated method stub
										MainActivity.iv.setBackgroundResource(R.drawable.l3blankbg);
										MainActivity.iv.setImageDrawable(null);
										MainActivity.chImage1.setImageDrawable(null);
										MainActivity.chImage2.setImageDrawable(null);
										MainActivity.chImage3.setImageDrawable(null);
										MainActivity.chImage4.setImageDrawable(null);
										
									}
								});
								
								MainActivity.selectedFruitArr.removeAll(MainActivity.selectedFruitArr);	
								MainActivity.csong=MediaPlayer.create(cont, R.raw.crushs);
								MainActivity.csong.start();
								MainActivity.mcount++;
								/*MainActivity.iv.setBackgroundResource(R.drawable.blankbg);
								MainActivity.iv.setImageDrawable(null);
								MainActivity.aiv.setImageResource(R.drawable.finalarrow);*/
								Animation anim=AnimationUtils.loadAnimation(getContext(), R.anim.myanim);
								MainActivity.aiv.startAnimation(anim);
								anim.setAnimationListener(new AnimationListener() {
									
									@Override
									public void onAnimationStart(Animation arg0) {
										// TODO Auto-generated method stub
										
										MainActivity.aiv.setImageResource(R.drawable.finalarrow);
									}
									
									@Override
									public void onAnimationRepeat(Animation arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void onAnimationEnd(Animation arg0) {
										// TODO Auto-generated method stub
										 MainActivity.aiv.setImageDrawable(null);
										 MainActivity.a=MainActivity.a+20;
										 if(MainActivity.mcount==1)
											{
											 MainActivity.buciv.setBackgroundResource(R.drawable.one);	
											}
											if(MainActivity.mcount==2)
											{
												MainActivity.buciv.setBackgroundResource(R.drawable.two);	
												//MainActivity.tv.setText("Score : 20");
											}
											if(MainActivity.mcount==3)
											{
												MainActivity.buciv.setBackgroundResource(R.drawable.three);	
												//MainActivity.tv.setText("Score : 30");
												
												
											//	MainActivity.act.finish();
											}
											if(MainActivity.mcount==4)
											{
												MainActivity.buciv.setBackgroundResource(R.drawable.four);	
												//MainActivity.tv.setText("Score : 30");
											}
											if(MainActivity.mcount==5)
											{
												MainActivity.buciv.setBackgroundResource(R.drawable.five);	
												//MainActivity.tv.setText("Score : 30");
											}
											if(MainActivity.mcount==6)
											{
												MainActivity.buciv.setBackgroundResource(R.drawable.six);	
												//MainActivity.tv.setText("Score : 30");
											}
											if(MainActivity.mcount==7)
											{
												MainActivity.buciv.setBackgroundResource(R.drawable.seven);
												//MainActivity.tv.setText("Score : 30");
											}
											if(MainActivity.mcount==8)
											{
												MainActivity.buciv.setBackgroundResource(R.drawable.eight);	
												//MainActivity.tv.setText("Score : 30");
												
													if(MainActivity.level==3)	
													{
													Toast t1=Toast.makeText(cont,Constant.GAME_OVER,Toast.LENGTH_SHORT);
													t1.show();
													Intent nin=new Intent(cont,EndActivity.class);
													nin.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
												    cont.startActivity(nin);
													MainActivity.act.finish();
													}
												
											}
											
											
											/*if(MainActivity.mcount>=11)
											{
												Toast t=Toast.makeText(cont, "Sorry!!!! your bucket is going to Fill",15000);
												t.show();
												//MainActivity.buciv.setImageResource(R.drawable.fillb);	
												//MainActivity.tv.setText("Score : 30");
											}*/
											//MainActivity.a=MainActivity.a+20;
											MainActivity.tv.setText(Constant.SCORE+MainActivity.a);
											
									}
								});
							}
						
					}
				}
			///////////////////////////////////////main logic////////////////////////////////////////////////////////////
				if(img.getTag()==Constant.APPLE)
				{
					//String astr=img.getTag().toString();
					setImageResource(R.drawable.smallappbck);	
					
					//MainActivity.iv.setImageResource(R.drawable.apple);
					
					
				}
				
				if(img.getTag()==Constant.ORANGE)
				{
					setImageResource(R.drawable.orangebackground);
					//MainActivity.iv.setImageResource(R.drawable.apple);
				}
				if(img.getTag()==Constant.STRAWBERRY)
				{
					setImageResource(R.drawable.strawberrybackground);
					//MainActivity.iv.setImageResource(R.drawable.apple);
				}
				if(img.getTag()==Constant.GRAPES)
				{
					setImageResource(R.drawable.grapesbackground);
					//MainActivity.iv.setImageResource(R.drawable.apple);
				}
				if(img.getTag()==Constant.MANGO)
				{
					setImageResource(R.drawable.mangobackground);
					//MainActivity.iv.setImageResource(R.drawable.apple);
				}
				if(img.getTag()==Constant.PEAR)
				{
					setImageResource(R.drawable.pearback);
					//MainActivity.iv.setImageResource(R.drawable.apple);
				}
				if(img.getTag()==Constant.LICHEE)
				{
					setImageResource(R.drawable.licheeback);
					//MainActivity.iv.setImageResource(R.drawable.apple);
				}
				if(img.getTag()==Constant.ANAR)
				{
					setImageResource(R.drawable.anarback);
					//MainActivity.iv.setImageResource(R.drawable.apple);
				}
			}
		});
		
		
	}
	
}

public class Fruits {
public static class Apple extends Common
	{

		public Apple(Context context) {
			super(context);
			setImageResource(R.drawable.apple);
			int r=new Random().nextInt(MainActivity.width-50);
			setY(0);
			setX(r);
			setTag(Constant.APPLE);
			// TODO Auto-generated constructor stub
		}
	}
	public static class Orange extends Common
	{

		public Orange(Context context) {
			super(context);
			setImageResource(R.drawable.orange);
			int r=new Random().nextInt(MainActivity.width-50);
			setY(0);
			setX(r);
			setTag(Constant.ORANGE);
			// TODO Auto-generated constructor stub
		}
	}
	public static class Strawberry extends Common
	{

		public Strawberry(Context context) {
			super(context);
			setImageResource(R.drawable.strawberry);
			int r=new Random().nextInt(MainActivity.width-50);
			setY(0);
			setX(r);
			setTag(Constant.STRAWBERRY);
			// TODO Auto-generated constructor stub
		}
	}
	public static class Grapes extends Common
	{
		public  Grapes(Context context) {
			super(context);
			setImageResource(R.drawable.grapes);
			int r=new Random().nextInt(MainActivity.width-50);
			setY(0);
			setX(r);
			setTag(Constant.GRAPES);
			// TODO Auto-generated constructor stub
		}
	}
	public static class Mango extends Common
	{

		public Mango(Context context) {
			super(context);
			setImageResource(R.drawable.shalu);
			int r=new Random().nextInt(MainActivity.width-50);
			setY(0);
			setX(r);
			setTag(Constant.MANGO);
			// TODO Auto-generated constructor stub
		}
	}
	public static class Anar extends Common
	{

		public Anar(Context context) {
			super(context);
			setImageResource(R.drawable.anar);
			int r=new Random().nextInt(MainActivity.width-50);
			setY(0);
			setX(r);
			setTag(Constant.ANAR);
			// TODO Auto-generated constructor stub
		}
	}
	public static class Lichee extends Common
	{

		public Lichee(Context context) {
			super(context);
			setImageResource(R.drawable.lichee);
			int r=new Random().nextInt(MainActivity.width-50);
			setY(0);
			setX(r);
			setTag(Constant.LICHEE);
			// TODO Auto-generated constructor stub
		}
	}
	public static class Pear extends Common
	{

		public Pear(Context context) {
			super(context);
			setImageResource(R.drawable.pear);
			int r=new Random().nextInt(MainActivity.width-50);
			setY(0);
			setX(r);
			setTag(Constant.PEAR);
			// TODO Auto-generated constructor stub
		}
	}
}




