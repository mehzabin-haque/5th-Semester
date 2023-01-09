#include<iostream>
#include<fstream>
#include<vector>
#include<set>
#include<map>
#include<string>
using namespace std;

#define NODE 100

bool flag=false;
int graph[NODE][NODE] = {0};

 bool dfs(int curr, set<int>&wSet, set<int>&gSet, set<int>&bSet) {
   //moving curr to white set to grey set.
   wSet.erase(wSet.find(curr));
   gSet.insert(curr);

   for(int v = 0; v < NODE; v++) {
      if(graph[curr][v] != 0) {    //for all neighbour vertices
         if(bSet.find(v) != bSet.end())
            continue;    //if the vertices are in the black set
         if(gSet.find(v) != gSet.end())
            return true;    //it is a cycle
         if(dfs(v, wSet, gSet, bSet))
            return true;    //cycle found
      }
   }

   //moving v to grey set to black set.
   gSet.erase(gSet.find(curr));
   bSet.insert(curr);
   return false;
}

bool hasCycle() {
   set<int> wSet, gSet, bSet;    //three set as white, grey and black
   for(int i = 0; i<NODE; i++)
      wSet.insert(i);    //initially add all node into the white set

   while(wSet.size() > 0) {
      for(int current = 0; current < NODE; current++) {
         if(wSet.find(current) != wSet.end())
            if(dfs(current, wSet, gSet, bSet))
               return true;
      }
   }
   return false;
}

int main()
{
    vector<string> trans;
    string readFile;
    ifstream file;
    file.open("test.txt");
    while(getline(file, readFile))
    {
        trans.push_back(readFile);
    }

    // cout << " Transaction going : " << endl;
    
    for(int i=0;i<trans.size();i++){
        for(int j=i+1;j<trans.size();j++){
            if(trans[i][3] == trans[j][3]){
                if((trans[i][0] == 'r' && trans[j][0]=='w') || (trans[i][0] == 'w')){  
                    int x_num = int(trans[i][1])-49;
                    int y_num = int(trans[j][1])-49;
                    if(x_num != y_num){
                        // cout << trans[i][1] << " from " << trans[j][1] << endl;
                        graph[x_num][y_num] = 1;
                    }
                }
            }
        }
    }
        

    flag=hasCycle();

    if(flag){
        cout << "Conflict Serialization Not Possible" << endl;
    }
    
    else{
        cout << "Conflict Serialization Possible" << endl;
    }

    
}