import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		ArrayList<IMoveBehavior> charList = new ArrayList<IMoveBehavior>();
				
		for (int i = 0; i<10; i++) {
			charList.add(new Elf());
			charList.add(new Troll());
			charList.add(new Knight());
			charList.add(new GiantBoulder());
		}
		
		charList.get(5).move(10);  //5th element performs move 10, in this case knight
		charList.get(7).move(10);
		charList.get(4).move(100);
		
		System.out.println(charList.get(7) instanceof Knight);  //returns false because item in position 7 is a troll not a knight. If Troll put in there, then true
		//instance of compares two objects and sees if they are the same
		
		//System.out.println(charList.size());  //we have 10 elfs, trolls, knights in my list so size 30
		
		//IMoveBehavior c1= new Knight();  //Arraylist with interface as data type
		//We are not declaring it of type knight, but as part of the interface
		//IMoveBehavior c2 = new Troll(); //Instantiated through the interface
	
	}

}
