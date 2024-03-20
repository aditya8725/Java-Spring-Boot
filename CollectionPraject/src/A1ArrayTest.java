public class A1ArrayTest 
{
	public static void main(String[] args) 
	{
		int n=10;
		System.out.println("Num : "+n);
		
		int score[] = {10,20,30,40,50};
		for(int i=0;i<score.length;i++)
		{
			System.out.println("score"+ score[i]);
		}
		
		
		System.out.println("---------------");
		
		
		int team[] = new int[5];
		team[0] = 11;
		team[1] = 12;
		team[2] = 13;
		team[3] = 14;
		team[4] = 15;
		
		for(int i=0;i<team.length;i++)
		{
			System.out.println("Team"+ team[i]);
		}
		
		System.out.println("---------------");
		
		Kite kitesArray[] = new Kite[5];
		
		kitesArray[0] = new Kite("Red","Jack",50);
		kitesArray[1] = new Kite("Green","Jane",60);
		kitesArray[2] = new Kite("Blue","Jim",70);
		kitesArray[3] = new Kite("Black","Jill",80);
		kitesArray[4] = new Kite("White","Julie",90);

		for (int i = 0; i < kitesArray.length; i++) {
			System.out.println("Kite is : "+kitesArray[i]);
		}
		
		System.out.println("---------");
		
		Kite kites[] = {
				new Kite("Cyan","Ramesh",255),
				new Kite("LightGreen","Haresh",155),
				new Kite("LightRed","Jayesh",255),
				new Kite("LightPurple","Rajesh",355),
				new Kite("Magenta","Ritesh",455),
				new Kite("Blue","Paresh",555),
		};
		for (int i = 0; i < kites.length; i++) {
			System.out.println("Kite is : "+kites[i]);
		}	
	}
}



class Kite
{
	String color;
	String owner;
	int length;

	public Kite(String color, String owner, int length) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + "]";
	}
	
	
	
}
