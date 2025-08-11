#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter a number:";
    cin>>n;
    int rev =0;
    while(n>0){
        int digit = n%10;
         rev = rev*10 + digit;
         n =n/10;
    }
    if(n==rev){
        cout<<"palindrome";
    }
    else{
        cout<<"not palindrome";
    }
    
}