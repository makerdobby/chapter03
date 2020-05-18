package method;

public class TV {

	private int channel;
	private int volume;
	private boolean power;
	public TV(int channel, int volume, boolean power) {
		
	}
	
	public void status(){
		System.out.println("["+this.channel+","+this.volume+","+this.power+"]");
	}
	
	public void power( boolean on) {
		
	}
	public void channel( int channel) {
		channel(true);
		
	}
	public void channel( boolean up) {
		System.out.println("hi");
	}
	
	public void volume( int volume) {
		
	}

}
