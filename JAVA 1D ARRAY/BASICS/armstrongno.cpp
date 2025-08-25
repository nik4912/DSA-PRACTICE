#include<iostream>
#include<cmath>
using namespace std;
int main(){
    int num,original,rem,sum=0;
    cout<<"eneter a number: ";
    cin>>num;
    original =num;
    int digits = log10(num)+1;
   
    while(num>0){
        rem = num%10;
        sum = sum + pow(rem,digits);
        num = num/10;
}
    if (sum == original){
        cout<<" number is armstrong";
    }
    else {
        cout<<"number is not armstrong";
    }

}