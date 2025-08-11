#include<iostream>
using namespace std;
int main(){
    int a;
    cout<<"enter a first number";
    cin>>a;
    int b;
    cout<<"enter a second number";
    cin>>b;
    int c;
    cout<<"enter a third number";
    cin>>c;
    if(a>=b && a>=c){
        cout<<"the greatest number is"<< a;

    }
    else if (b>=a && b>=c){
        cout<<"the greatest number is"<<b;
    }
    else{
         cout<<"the greatest number is"<<c;
    }
}
