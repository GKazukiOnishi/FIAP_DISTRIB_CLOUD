import java.rmi.RemoteException;

public class HelloImplementation implements HelloInterface {

	@Override
	public void printMessage() throws RemoteException {
		System.out.println("Exemplo de utilização de middleware Java RMI");
	}

}
