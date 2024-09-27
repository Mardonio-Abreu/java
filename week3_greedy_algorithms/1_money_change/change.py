def change(money):
    # write your code here
    coins = 0
    while money >= 10:
        money = money - 10
        coins = coins + 1

    while money >= 5:
        money = money - 5
        coins = coins + 1

    coins = coins + money

    return coins


if __name__ == '__main__':
    m = int(input())
    print(change(m))

""" for i in range(1, 1001):
    print(i, " ", change(i)) """