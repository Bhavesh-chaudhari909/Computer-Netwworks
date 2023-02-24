import java.io.*; 
import java.rmi.*; 
public class rmiClient
{
public static void main(String sdfs[])throws Exception
{
try{
float a,b,c,d ; 
int e,f; 
String rr;
rmiInterface ri=(rmiInterface)Naming.lookup(sdfs[0]);
BufferedReader br = new BufferedReader(newInputStreamReader(System.in)); 
do{
System.out.println("1.Add()\n2.Multiply()\n3.Divide()\n4.Exit()\nEnterU'R choice:"); 
int sw=Integer.parseInt(br.readLine());
switch(sw)
{
case 1:
System.out.println("Enter the First Value"); 
a=Float.parseFloat(br.readLine()); 
System.out.println("Enter the Second Value");
b=Float.parseFloat(br.readLine()); 
System.out.println("The Added Value Is:"+ri.add(a,b)); 
break;
case 2:
System.out.println("Enter the First Value"); 
e=Integer.parseInt(br.readLine()); 
System.out.println("Enter the Second Value"); 
f=Integer.parseInt(br.readLine());
System.out.println("The Added Value Is:"+ri.multiply(e,f)); 
break;
case 3:
System.out.println("Enter the First Value"); 
c=Float.parseFloat(br.readLine()); 
System.out.println("Enter the Second Value"); 
d=Float.parseFloat(br.readLine()); 
System.out.println("The Added Value Is:"+ri.divide(c,d));
 break;
case 4:
System.exit(0); 
break;
}
System.out.println("Do u Want to Continue 1/0"); 
rr=br.readLine();
}
while(rr.equalsIgnoreCase("1"));
}
catch(Exception e)
{
System.out.println("Error"+e);
}}}