from sys import stdin


def optimal_value(capacity, weights, values):
    
    # write your code here

    items = []

    for i in weights:
        items.append({'weight': weights[i], 'value': values[i], 'value_per_unit': values[i]/weights[i]})

    
    print(items)
    
    
    




if __name__ == "__main__":
    data = list(map(int, stdin.read().split()))
    n, capacity = data[0:2]
    values = data[2:(2 * n + 2):2]
    weights = data[3:(2 * n + 2):2]
    opt_value = optimal_value(capacity, weights, values)
    print("{:.10f}".format(opt_value))
