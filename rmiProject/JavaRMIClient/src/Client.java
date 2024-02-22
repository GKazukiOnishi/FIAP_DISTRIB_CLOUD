import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	
	private final static int RMI_PORT = 1099;

	public Client() {}

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry(RMI_PORT);
			HelloInterface stub = (HelloInterface) registry.lookup(HelloInterface.class.getName());
			
			stub.printMessage();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
