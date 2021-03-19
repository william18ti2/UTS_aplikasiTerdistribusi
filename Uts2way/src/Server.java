import java.net.*;
import java.io.*;
class Server{
    public static void main(String args[])throws Exception{
        ServerSocket newSocket=new ServerSocket(433);
        Socket connect=newSocket.accept();
        DataInputStream input=new DataInputStream(connect.getInputStream());
        DataOutputStream output=new DataOutputStream(connect.getOutputStream());
        BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));

        String msgServer="";
        String msgClient="";
        while(!msgServer.equals("end")){
            msgServer=input.readUTF();
            System.out.println("Client message: "+msgServer);
            System.out.print("Server message: ");
            msgClient=keyboard.readLine();
            if (msgClient.equals("") && msgClient.equals(null)) {
                continue;
            }
            else{
                output.writeUTF(msgClient);
                output.flush();
            }
        }
        output.close();
        connect.close();
        newSocket.close();
    }}