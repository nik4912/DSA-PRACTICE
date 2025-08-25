#include<iostream>
using namespace std;
int fact(int n){
    int fact = 1;
    for(int i=1; i<=n; i++){
        fact = fact*i;
    }
    return fact;
}
int main(){
    int n;
    cout<<"enter a number";
    cin>>n;
    int sum = 0;
    int temp = n;
    while(temp > 0){
        int digit = temp % 10;
        sum = sum + fact(digit);
        temp = temp / 10;
    }
   if (sum == n){
    cout<<"strong no";
   }
   else {
    cout<<"not strong no";
   }

}