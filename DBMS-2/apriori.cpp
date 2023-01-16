#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    // Read CSV file
    vector<vector<string>> data;
    ifstream file("data.csv");
    string line;
    while (getline(file, line)) {
        vector<string> elements;
        string element;
        for (char c : line) {
            if (c == ',') {
                elements.push_back(element);
                element.clear();
            } else {
                element += c;
            }
        }
        elements.push_back(element);
        data.push_back(elements);
    }

    // Set minimum support threshold
    int min_support = 2;

    // Perform Apriori algorithm
    vector<vector<string>> frequent_sets;
    for (int k = 1; k <= data[0].size(); k++) {
        // Generate candidate item sets
        vector<vector<string>> candidates;
        if (k == 1) {
            for (string item : data[0]) {
                candidates.push_back({item});
            }
        } else {
            for (vector<string> set1 : frequent_sets) {
                for (vector<string> set2 : frequent_sets) {
                    if (set1[0] < set2[0]) {
                        vector<string> candidate = set1;
                        candidate.push_back(set2[0]);
                        candidates.push_back(candidate);
                    }
                }
            }
        }

        // Check support for candidate item sets
        vector<vector<string>> frequent;
        for (vector<string> candidate : candidates) {
            int count = 0;
            for (vector<string> row : data) {
                bool contains = true;
                for (string item : candidate) {
                    if (find(row.begin(), row.end(), item) == row.end()) {
                        contains = false;
                        break;
                    }
                }
                if (contains) {
                    count++;
                }
            }
            if (count >= min_support) {
                frequent.push_back(candidate);
            }
        }

        // Update frequent item sets
        frequent_sets = frequent;

        // Print frequent item sets
        for (vector<string> set : frequent_sets) {
            for (string item : set) {
                cout << item << " ";
            }
            cout << endl;
        }
    }

      // Generate association rules
    for (vector<string> set : frequent_sets) {
        for (int i = 0; i < set.size(); i++) {
            vector<string> antecedent(set.begin(), set.begin() + i);
            vector<string> consequent(set.begin() + i, set.end());
            if (!antecedent.empty() && !consequent.empty()) {
                int support = 0;
                for (vector<string> row : data) {
                    bool contains = true;
                    for (string item : set) {
                        if (find(row.begin(), row.end(), item) == row.end()) {
                            contains = false;
                            break;
                        }
                    }
                    if (contains) {
                        support++;
                    }
                }

// Count the number of transactions that contain the antecedent and consequent
// int support = 0;
for (vector<string> transaction : data) {
    bool contains_antecedent = true;
    bool contains_consequent = false;
    for (string item : antecedent) {
        if (find(transaction.begin(), transaction.end(), item) == transaction.end()) {
            contains_antecedent = false;
            break;
        }
    }
    for (string item : consequent) {
        if (find(transaction.begin(), transaction.end(), item) != transaction.end()) {
            contains_consequent = true;
            break;
        }
    }
    if (contains_antecedent && contains_consequent) {
        support++;
    }
}


// Calculate confidence
// double confidence = (double)support / antecedent_support;

                double confidence = ((double)support / count(data.begin(), data.end(), antecedent))*100;
                cout << "Rule: ";
                for (string item : antecedent) {
                    cout << item << " ";
                }
                cout << "-> ";
                for (string item : consequent) {
                    cout << item << " ";
                }
                cout << " (support = " << support << ", confidence = " << confidence << ")" << endl;
            }
        }
    }
}