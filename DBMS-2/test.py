from apriori2 import Apriori

if __name__ == '__main__':
    filePath = 'apriori/data2.csv'
    minSup = float(input('Enter Min Support: '))
    minConf = 0.4
    
    #relative support == support count/total num of transaction
    obj = Apriori(minSup, minConf)
    itemCountDict, freqSet = obj.fit(filePath)
    for key, value in freqSet.items():
        print('frequent {}-term set: '.format(key))
        print('-'*20)
        for itemset in value:
            print(list(itemset))

        print()