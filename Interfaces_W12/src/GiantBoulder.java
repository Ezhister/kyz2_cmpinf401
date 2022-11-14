
public class GiantBoulder implements IMoveBehavior {  //Not humanoid so it doesn't extend from humanoid

	@Override
	public void move(double distance) {
		System.out.println("The giant boulder rolled for " + distance + " miles");
		
	}

	@Override
	public void jump(double height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die() {  //dying might mean it crumbles to pieces 
		// TODO Auto-generated method stub
		
	}

}
