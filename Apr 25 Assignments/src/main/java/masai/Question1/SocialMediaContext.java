package masai.Question1;

public class SocialMediaContext {
	private SocialMedia socialMedia;
	
	public void setSocialmediaStrategy(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}
	
	public void connect(String name) {
		socialMedia.connect(name);
	}
	
}
