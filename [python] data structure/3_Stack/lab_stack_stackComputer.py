from stack import Stack

# expression = "43-15*+"
expression = "15+2-6*"

mystack = Stack()

for i in range(len(expression)):

    if expression[i] >= "0" and expression[i] <= "9":
        mystack.Push(expression[i])

    if expression[i] == "+":
        mystack.Push(int(mystack.Pop()) + int(mystack.Pop()))
    elif expression[i] == "-":
        mystack.Push(-(int(mystack.Pop()) - int(mystack.Pop())))
    elif expression[i] == "*":
        mystack.Push(int(mystack.Pop()) * int(mystack.Pop()))
    elif expression[i] == "/": 
        mystack.Push(int(mystack.Pop()) // int(mystack.Pop()))


print("\"{}\" = {}".format(expression, mystack.Pop()))
