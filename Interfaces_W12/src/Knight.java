
public class Knight extends Humanoid implements IFightBehavior, IPhysics { //extends humanoid but still implements IMoveBehavior
	//you can also implement IFight Behavior
	//All the methods in IMoveBehavior inherited

	@Override
	public void move(double distance) {
		System.out.println("The knight ran " + distance + " meters");
		
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collide() {
		// TODO Auto-generated method stub
		
	}

	
}
