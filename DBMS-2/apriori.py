import csv

# A function to return the frequent item sets with a minimum support
def apriori(dataset, min_support):
    C1 = {}
    for transaction in dataset:
        for item in transaction:
            if item in C1:
                C1[item] += 1
            else:
                C1[item] = 1
    
    # Remove items with support less than min_support
    C1 = {k:v for k,v in C1.items() if v >= min_support}
    L1 = list(C1.keys())

    L = [L1]
    k = 2
    while (len(L[k-2]) > 0):
        Ck = {}
        for i in range(len(L[k-2])):
            for j in range(i+1, len(L[k-2])):
                a = list(L[k-2][i])
                a.sort()
                b = list(L[k-2][j])
                b.sort()
                if a[0:k-2] == b[0:k-2]:
                    c = a + [b[k-2]]
                    c.sort()
                    Ck[frozenset(c)] = 0
        for transaction in dataset:
            for item in Ck:
                if item.issubset(transaction):
                    Ck[item] += 1

        Lk = set(item for item in Ck if Ck[item] >= min_support)
        L.append(Lk)
        k += 1
    return L

# Read data from CSV file
transactions = []
with open('data.csv') as csvfile:
    reader = csv.reader(csvfile,delimiter=",")
    for row in reader:
        transactions.append(row)
# Calculate the confidence of the association rules
frequent_item_sets = apriori(transactions, min_support=2)
print(frequent_item_sets)
confidence = {}
for k in range(1, len(frequent_item_sets)):
    for itemset in frequent_item_sets[k]:
        for item in itemset:
            antecedent = frozenset([item])
            consequent = itemset - antecedent
            if antecedent in confidence:
                confidence[antecedent][consequent] = frequent_item_sets[k][itemset] / frequent_item_sets[k-1][antecedent]
            else:
                confidence[antecedent] = {consequent: frequent_item_sets[k][itemset] / frequent_item_sets[k-1][antecedent]}

# Print the confidence of the association rules
            for antecedent in confidence:
                for consequent in confidence[antecedent]:
                    # print("(((((((((((((((((")
                    print("Rule: {} -> {}  Confidence: {}".format(antecedent, consequent, confidence[antecedent][consequent]))

# Run Apriori algorithm
print("JJJJJJJJJJJJJJJJJJJJ")