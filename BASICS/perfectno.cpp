#include<iostream>
using namespace std;
int main(){
    int n;
    int sum =0;
    cout<<"eneter a number";
    cin>>n;
     for(int i=1;i<=n;i++){
        if(n%i==0){
         sum = sum + i;
        }
        }
        if (sum == n){
            cout<<"the perfect";
        }
        else {
            cout<<"not perfect";
        }
     }

