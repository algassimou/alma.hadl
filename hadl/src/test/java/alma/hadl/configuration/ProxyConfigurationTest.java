package alma.hadl.configuration;

import static org.junit.Assert.*;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

public class ProxyConfigurationTest {
	private String adresse ;
	private IConfiguration config ;

	@Before 
	public void setUp () {
		try {
			System.out.println("-*******************************-");
			//adresse = InetAddress.getLocalHost().toString() ;
			adresse = "I121V2pc01" ;
			System.out.println(adresse);
			config = new StubConfiguration("//"+adresse+"/config",9800,10) ;
			System.out.println("-*******************************-");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		try {
			IConfiguration proxy = Configuration.getConfiguration("//"+adresse+":9800/config") ;
			assertEquals(proxy.getNextIdentifiant(), config.getNextIdentifiant());
			assertEquals(proxy.getNextIdentifiant(),((StubConfiguration)config).getValeur());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
