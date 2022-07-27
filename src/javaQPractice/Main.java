package javaQPractice;
//Multiple music systems and Multiple vehicles

 class MusicSystem2{
	 int sound = 10;
	// setting sound
	String setSound(int veh_sound)
	{
		sound = veh_sound ; 
		//checking sound 
		if(sound > 100)
		{
			return "high";
		}
		return "normal";
	}
}
class Bus2 {
	
	MusicSystem2 ms = new MusicSystem2();
	public void setMusicSystem(int sound )
	{
		//setting sound 
		if(ms.setSound(sound) == "high")
		{
			highSound() ;
		}
		System.out.println("you are playing music in your bus");
	}
	public void highSound()
	{
		System.out.println("beep");
	}
}
class Car2 {
	MusicSystem2 ms = new MusicSystem2();
	public void setMusicSystem(int sound )
	{
		if(ms.setSound(sound) == "high")
		{
			highSound() ;
		}
		System.out.println("you are playing music in your bus");
	}
	public void highSound()
	{
		System.out.println("volume is high");
	}
}

public class Main {

	public static void main(String[] args)
	{

		Bus2 v1 = new Bus2();
		v1.setMusicSystem(150);
	
	}
}
