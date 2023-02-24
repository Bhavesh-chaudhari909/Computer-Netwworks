import java.rmi.*; 
import java.rmi.server.*; 
import java.io.*;
public class rmiServer extends UnicastRemoteObject implementsrmiInterface
{
public rmiServer()throws RemoteException
{}
public int add(float a,float b)throws RemoteException
{
int c;c=(int)(a+b); 
return(c);
}
public int multiply(int a,int b)throws RemoteException
{
int c; 
c=(int)a*b; 
return(c);
}
public float divide(float a,float b)throws RemoteException
{
c=(float)a/b;return(c);
}
public static void main(String args[])throws Exception
{
try{
rmiServer rs=new rmiServer(); 
Naming.rebind(args[0],rs);
}
catch(Exception e)
{
System.out.println("Error"+e);
}}}