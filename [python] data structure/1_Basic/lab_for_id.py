
NUMID = 22099131  # tsmc
STRID = str(NUMID)

def parse_str(id):

    if( len(id) != 8 ):
        print("Should be 8 digits!")
        return False

    sum = 0
    pos = -2
    for weight in range(2,9):
        sum += int(id[pos]) * weight
        pos -= 1

    return True if(sum%10 == int(id[-1])) else False


def parse_int(id):

    if( id < 10000000 or id > 99999999 ):
        print("Should be 8 digits!")
        return False


    digit = 1
    sum = 0
    for weight in range(2,9):
        sum += (id//10**digit%10) * weight
        digit += 1

    return True if(sum%10 == id%10) else False


print(parse_str(STRID))
print(parse_int(NUMID))