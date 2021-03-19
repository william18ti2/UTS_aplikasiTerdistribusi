import java.net.*;
import java.io.*;
class Client{
    public static void main(String args[])throws Exception{
        Socket connect=new Socket("localhost",433);
        DataInputStream input=new DataInputStream(connect.getInputStream());
        DataOutputStream output=new DataOutputStream(connect.getOutputStream());
        BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));

        String msgClient="";
        String msgServer="";
        while(!msgClient.equals("stop")){
            System.out.print("Client message : ");
            msgClient=keyboard.readLine();
            if (msgClient.equals("") && msgClient.equals(null)) {
                continue;
            }
            else{
                output.writeUTF(msgClient);
                output.flush();
            }
            msgServer=input.readUTF();
            System.out.println("Server message: "+msgServer);
        }

        output.close();
        connect.close();
    }}