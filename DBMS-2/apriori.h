#include <iostream>
#include <vector>
#include <unordered_map>
#include <set>
using namespace std;

void AprioriLarge(vector<vector<string> > &data, double min_support, std::vector<std::vector<std::string> > &frequent_item_sets){
    std::unordered_map<std::string, int> item_counts;
    std::unordered_map<std::string, int> candidate_counts;
    std::vector<std::vector<std::string> > candidates;

    // Find frequent 1-item sets
    for(auto row: data){
        for(auto item: row){
            item_counts[item]++;
        }
    }
    for(auto item: item_counts){
        if(item.second >= min_support * data.size()){
            std::vector<std::string> frequent_item_set = {item.first};
            frequent_item_sets.push_back(frequent_item_set);
            candidate_counts[item.first] = item.second;
        }
    }

    // Find frequent k-item sets
    int k = 2;
    while(frequent_item_sets.size() > 0){
        candidates.clear();
        std::unordered_map<std::string, int> new_candidate_counts;

        // Generate candidate k-item sets
        for(auto item_set_1: frequent_item_sets){
            for(auto item_set_2: frequent_item_sets){
                if(item_set_1.size() < k - 1){
                    continue;
                }
                if(item_set_1[k-2] >= item_set_2[k-2]){
                    continue;
                }
                std::string candidate = "";
                for(int i = 0; i < k - 2; i++){
                    candidate += item_set_1[i] + ",";
                }
                candidate += item_set_1[k-2] + "," + item_set_2[k-2];
                candidates.push_back({candidate});
            }
        }

        // Count occurrences of candidate k-item sets
        for(auto row: data){
            for(auto candidate: candidates){
                int count = 0;
                for(auto item: row){
                    if(candidate[0].find(item) != std::string::npos){
                        count++;
                    }
                }
                if(count == k){
                    new_candidate_counts[candidate[0]]++;
                }
            }
        }

        // Identify frequent k-item sets
        frequent_item_sets.clear();
        for(auto candidate: new_candidate_counts){
            if(candidate.second >= min_support * data.size()){
                frequent_item_sets.push_back({candidate.first});
            }
        }
        k++;
    }
}
