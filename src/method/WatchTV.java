package method;

public class WatchTV {

	public static void main(String[] args) {
		TV tv = new TV( 7, 20, false);  	
        
        tv.status();	
        
 
        tv.power( true );
        tv.volume( 120 );
        tv.status();		          
        
        tv.volume( false );
        tv.status();
        
        tv.volume( 256 ); //0이 되게 해야함
        tv.status();
      
        System.out.println("===");
        tv.channel( 0 );
        tv.status();		          
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        tv.status();

        tv.power( false );
        tv.status();      	

	}

}
