# 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

# What is the sum of the digits of the number 21000?


number = str(2**1000)
res = 0
for digit in number:
    res += int(digit)
print (res)
