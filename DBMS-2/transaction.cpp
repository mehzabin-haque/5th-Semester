#include<stdio.h>
// #include<bits/stdc++.h>
#include<vector>
#include<set>
#include<map>
#include <iostream>
#include <fstream>
#include<string>
#define NODE 100
using namespace std;

int graph[NODE][NODE] ={0};
int adj_mtx[NODE][NODE] = {0};

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

int main() {
    string text;
    string storeX[100];
    string storeY[100];
    ifstream r("test.txt");
    int xi=0,yi=0;
while (getline (r, text)) {
    
    for(int j=0;j<text.length();j++){
      if(text[j]=='X'){
        storeX[xi++]=text;
        cout<< text<<endl;
      }
      else if(text[j]=='Y'){
       storeY[yi++]=text;
        //cout<< text<<endl;
      }
    }
  
}
  
  for(int i=0;i<xi;i++){
    if(storeX[i].find("r") != std::string::npos){
      for(int j=i;j<xi;j++){
        if(storeX[j+1].find("w") != std::string::npos ){
          cout << storeX[i] << " to " << storeX[j+1] << endl;
        }
      }
    }
    else if(storeX[i].find("w") != std::string::npos){
      for(int j=i;j<xi;j++){
        if((storeX[j+1].find("w") != std::string::npos) || (storeX[j+1].find("r") != std::string::npos )){
          cout << storeX[i] << " to " << storeX[j+1] << endl;
        }
      }
    }
  }

  for(int i=0;i<yi;i++){
    if(storeY[i].find("r") != std::string::npos){
      for(int j=i;j<yi;j++){
        if(storeY[j+1].find("w") != std::string::npos ){
          cout << storeY[i] << " to " << storeY[j+1] << endl;
        }
      }
    }
    else if(storeY[i].find("w") != std::string::npos){
      for(int j=i;j<yi;j++){
        if((storeY[j+1].find("w") != std::string::npos) || (storeY[j+1].find("r") != std::string::npos )){
          cout << storeY[i] << " to " << storeY[j+1] << endl;
        }
      }
    }
  }

  //  bool res;
  //  res = hasCycle();
  //  if(res)
  //     cout << "The graph has cycle." << endl;
  //  else
  //     cout << "The graph has no cycle." << endl;
}
