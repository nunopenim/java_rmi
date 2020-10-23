import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Params extends Remote {
    String pingMe() throws RemoteException;
}
