from stack import Stack


expression="((A+(B*C))-D)"
# expression="(A+B*(C-D))"

results = ""
mystack = Stack()


for i in range(len(expression)):
    
    if expression[i] >= "A" and expression[i] <= "Z":
        results += expression[i]

    else:

        mystack.Push(expression[i])

        if expression[i] == ")":

            mystack.Pop() # pop ")"

            while mystack.stack[mystack.top] != "(":
                results += mystack.Pop()

            mystack.Pop() # pop "("
        

print("postfix of expression\"{}\" is: {}".format(expression, results))