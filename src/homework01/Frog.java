package homework01;

public class Frog implements canJump,canSwim{
@Override
public void jump() {
	System.out.println("青蛙跳了！！");
	
}
@Override
	public void swim() {
		System.out.println("青蛙游泳了！！");
		
	}
public static void main(String[] args) {
	
		Frog frog1 = new Frog();
		frog1.jump();
		frog1.swim();
}
}
