#include<iostream>
using namespace std;
bool prime (int n){
    if (n<2) return false;
    for (int i=2; i*i<=n; i++){
        if(n%i==0){
            return false; 
        }

        return true;
    }
}
int main(){
int num ;
cout<<"enter a number";
cin>>num;
if(prime(num)){
    cout<<"is prime";

}
else {
    cout<<"is nor prime";

}
}