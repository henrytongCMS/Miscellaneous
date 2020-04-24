import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

client.connect(('192.168.137.10', 65432)) # This is for raspberry Pi
#client.connect(('localhost', 65432))

print("Enter 'exit' to exit") 

while True: 

    #print(u'From server receive: ' + client.recv(1024).decode())
    
    data = input(" -> ")
    client.sendall(data.encode('utf-8'))

    if( data == b'exit' ):    
        #client.send(b'exit')
        break
    
client.close()