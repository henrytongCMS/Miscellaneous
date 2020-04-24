import socket
from threading import Thread


def recieveInput(connect, host, port):
    
    is_active = True
    
    while is_active:
        
        client_input = connect.recv(1024).decode("utf8")
        
        if "exit" in client_input:
            print(u"The client {}:{} has disconnected.".format(host, port))
            connect.close()
            is_active = False
            
        else:
            print("The client {}:{} say: {}".format(host, port, client_input))
            #connect.sendall("Received.".encode("utf8"))


server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server.bind(('localhost', 65432))
server.listen(5)

print(server.getsockname())
print('waiting for connect...')


# Infinite loop- do not reset for every requests
while True:
    
    connect, (host, port) = server.accept()
    
    print(u"The client {}:{} has connected.".format(host, port))
    
    Thread(target=recieveInput, args=(connect, host, port)).start()


server.close()