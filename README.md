# Client-Server-Application

Code target: Create a Java client-server application.
---------------------------------------------------------------------------------
The application possess the following characteristics:

a- Keep client and server apps distinct.
b- Connections done via socket API.
c-Server simultaneously connects to many clients.
d- For testing reasons, the client should submit a string to the server, and the server should return with the string's length (for example, if the client transmits "count this line" as a string, the server's response should be 15). 


Server:
---------------------------------------------------------------------------------
1- Create a Server socket channel.
2- Bind the server socket channel to the IP address and Port
3- Wait and Accept the client socket connection.
4- Printing the address of the client.
5- Creating a reader for reading the content on the socket input stream.
6- Reading the content of the socket input stream.  


Client:
---------------------------------------------------------------------------------
1- Register host and port. The connection won't actually be established until I call connect.
2- Establishes the connection, and then the socket will be passed to handle the connection.
3- This is the method I will override when making a network client for the needed task.
4- The default version sends a single line ("Waiting for the client …") to the server reads one line of response, prints it and then exits.
5- The hostname of the server I am contacting.
6- The port connection will be made on.
