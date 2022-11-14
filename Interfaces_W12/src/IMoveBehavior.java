
public interface IMoveBehavior {
	
	public final double GRAVITY = 9.8;  //has to be final, but see you can have constants in interfaces
	
	public void move(double distance);  //method signature ends with SEMICOLON    //every class moves differently
	public  void jump(double height);
	public void fall();
	public void die();

}
