#include<stdio.h>
#include<bits/stdc++.h>
#include <iostream>
#include <fstream>
#include<string>
using namespace std;

int main(){
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

  
  
}