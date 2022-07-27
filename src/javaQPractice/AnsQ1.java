package javaQPractice;

//Single car and vehicle   and single music system

class MusicSystem{
	 static int sound ;
	static String setSound(int volume)
	{
		String sound_level = null ; 
		sound = volume ;
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

class Bus 
{
	public static void setSound(int volume)
	{
		if( MusicSystem.setSound(volume) == "high" )
		{
			highSoundAlert();
		}
	}
	public static void highSoundAlert()
	{
		System.out.println("beep");
	}
}
class Car 
{
	public static void setSound(int volume)
	{
		if( MusicSystem.setSound(volume) == "high" )
		{
			highSoundAlert();
		}
	}
	public static void highSoundAlert()
	{
		System.out.println("volume is high");
	}
}
public class AnsQ1 {

	public static void main(String[] args)
	{
		Car.setSound(101);
		Car.setSound(90);
	}
}
