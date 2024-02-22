import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends HelloImplementation {

	private static final int RMI_PORT = 1099;
	
	public Server() {}
	
	public static void main(String[] args) {
		try {
			HelloImplementation obj = new HelloImplementation();
			HelloInterface stub = (HelloInterface) UnicastRemoteObject.exportObject(obj, RMI_PORT);
			
			Registry registry = LocateRegistry.createRegistry(RMI_PORT);
			registry.bind(HelloInterface.class.getName(), stub);
			System.out.println("Servidor em execução...");
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
