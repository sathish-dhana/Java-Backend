package masai.Question1;

public class Demo {
	public static void main(String[] args) {
		
	// any social media strategy.
	SocialMediaContext context = new SocialMediaContext();
	
	// Setting Facebook strategy.
	context.setSocialmediaStrategy(new FacebookStrategy());
	context.connect("Lokesh");
	
	// Setting Twitter strategy.
	context.setSocialmediaStrategy(new TwitterStrategy());
	context.connect("Lokesh");
	
	// Setting GooglePlus strategy.
	context.setSocialmediaStrategy(new GooglePlusStrategy());
	context.connect("Lokesh");
	

	// Setting Orkut strategy.
	context.setSocialmediaStrategy(new OrkutStrategy());
	context.connect("Lokesh");
	}
}
