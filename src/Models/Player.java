package Models;

public final class Player extends Person implements Role {

	private String number;

	public Player(String name, Gender gender, int age,String number) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public void defending() {
		// TODO Auto-generated method stub
		
		System.out.println("The Player is defending");
		
	}

	@Override
	public void pressing() {
		// TODO Auto-generated method stub
		System.out.println("The Player is pressing");
	}

	@Override
	public void attacking() {
		// TODO Auto-generated method stub
		System.out.println("The Player is attacking");
	}

}
