
def splitter(expression, myoperator):

    item = expression.split(myoperator)
 
    for x in ['*', '/', '+', '-']:
        if x in item[0]:
            item = [item[0].split(x)[1], item[1]]
        if x in item[1]:
            item = [item[0], item[1].split(x)[0]]

    item = [int(i) for i in item]

    return item


def evaluate(expression):

    looper = 0

    while 1:

        if expression[looper].isdigit() == False:

            item = splitter(expression, expression[looper])

            if   expression[looper] == '+': res = item[0] + item[1]
            elif expression[looper] == '-': res = item[0] - item[1]
            elif expression[looper] == '*': res = item[0] * item[1]
            elif expression[looper] == '/': res = item[0] // item[1]
            else: pass

            expression = expression.replace('{}{}{}'.format(str(item[0]), expression[looper], str(item[1])), str(res))

            looper = 0

        looper += 1

        if looper > len(expression)-1: break

    return expression


expression = input("Please input a math expression: ")
print("{}={}".format(expression, evaluate(expression)))