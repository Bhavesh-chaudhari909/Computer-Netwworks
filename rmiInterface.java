import java.rmi.*;
public interface rmiInterface extends Remote
{
public int add(float a,float b)throws RemoteException; 
public int multiply(int a,int b)throws RemoteException; 
public float divide(float a,float b)throws RemoteException;
}