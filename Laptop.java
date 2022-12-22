public class Laptop
{
	private String color;
	private Windows windows;
	private Press press;
	private Button button;

	public Laptop(String color){
		this.color = color;
		windows = new Windows();
		press = new Press();
		button = new Button();	
	}

	public void setColor(String color){
		this.color = color;
	}
	public String open(){
		return windows.openWindows;
	}
}
