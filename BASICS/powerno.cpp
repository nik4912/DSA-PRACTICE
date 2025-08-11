#include<iostream>
using namespace std;
long long power (int base, int exponent){
    long long result = 1;
    for(int i =1; i<= exponent; i++){
        result = result * base;
    }
    return result;
}
int main(){
    int base, exponent;
    cout<<"enter base:";
    cin>>base;
    cout<<"enter exponent:";
    cin>>exponent;
    long long result = power(base,exponent);
    cout<<result;

}