package studio7;

public class Die {

	private int n;
	public Die() {
		n = 0;
	}
	public Die(int n) {
		this.n = n;
	}
	public int integer(){
		return (int)(Math.random()*n) + 1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die = new Die(6);
		System.out.print(die.integer());
	}

}
