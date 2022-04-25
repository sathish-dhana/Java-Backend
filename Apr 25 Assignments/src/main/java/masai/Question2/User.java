package masai.Question2;

public class User {
	int userId;
	String name;
	boolean CurrentlyReading;
	MemberShip membershipPlan;
	
	
	public User(int userId, String name, boolean currentlyReading, MemberShip membershipPlan) {
		super();
		this.userId = userId;
		this.name = name;
		this.CurrentlyReading = currentlyReading;
		this.membershipPlan = membershipPlan;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isCurrentlyReading() {
		return CurrentlyReading;
	}


	public void setCurrentlyReading(boolean currentlyReading) {
		CurrentlyReading = currentlyReading;
	}


	public MemberShip getMembershipPlan() {
		return membershipPlan;
	}


	public void setMembershipPlan(MemberShip membershipPlan) {
		this.membershipPlan = membershipPlan;
	}
		
}
