package videorentalsystem;


import videorentalsystem.Video;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitish Joshi
 */
class VideoStore extends Video
{
        Video obj=new Video();
	String[] videos=new String[10];
	int[] rate=new int[10];
	int i=0;
	
	void addVideo(String title)
	{
	
	videos[i++]=title;	
	}
	void checkOut(String nm)
	{
	
		int j,index=0;
		for(j=0;j<3;j++)
		{
			if(videos[j].equals(nm))
			{
				index=j;
			}
		}
		being_checkedout(index);
	}
	void returnVideo(String nm)
	{
		int j,index=0;
		for(j=0;j<3;j++)
		{
			if(videos[j].equals(nm))
			{
				index=j;
			}
		}
		being_returned(index);
	}
	void receiveRating(int n, int no )
	{
		rate[n]=no;
		receive_a_rating(n,no);
	}
	void listInventory()
	{
		int i;
		
		for(i=0;i<3;i++)
		{
		    if(flag[i]==true)
			System.out.println("Title: "+ videos[i]+"\nFlag: " +flag[i]+"\nRating: "+user_rating[i]+"\n");
                    
		}
		
	}
}
