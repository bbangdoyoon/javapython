'''
문제1
정수형 나눗셈의 결과를 출력하는 함수를 만들어보자. 
그래서 이 함수가 호출되면 다음의 실행 결과를 보이도록 해보자.

>>>int_div(5,2)
몫:2
나머지:1
'''

def int_div(a,b):
    print('value',a//b)
    print('value',a%b)

int_div(5,2)
print("1시 30분인데 혹시 바쁜가요?")