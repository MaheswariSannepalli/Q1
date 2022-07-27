package javaQPractice;

class musicsystem1{
	 static int sound ;
	// setting sound
	static String setSound(int volume)
	{
		String sound_level = null ; 
		sound = volume ;
		//checking sound 
		if(sound > 100)
		{
		   sound_level =  "high";
		}
		else
		{
			System.out.println("you are playing music");
		}
		return sound_level ; 
	}
}
interface Vehicle{
	void setSound(int volume) ;
	void highSoundAlert() ;
}
class bus1 implements Vehicle
{
	public void setSound(int volume)
	{
		//setting sound 
		if( musicsystem1.setSound(volume) == "high" )
		{
			highSoundAlert();
		}
	}
	public void highSoundAlert()
	{
		System.out.println("beep");
	}
}
class car1 implements Vehicle
{
	public void setSound(int volume)
	{
		if( musicsystem1.setSound(volume) == "high" )
		{
			highSoundAlert();
		}
	}
	public void highSoundAlert()
	{
		System.out.println("volume is high");
	}
}
public class Q1 {

	public static void main(String[] args)
	{
		Vehicle v = new car1();
		v.setSound(101);
		v.setSound(90);
	}
}
