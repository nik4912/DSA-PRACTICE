#include<iostream>
using namespace std;
int main(){
    int t1 =0, t2=1,nextTerm =0, n;
    cout<<"enter a no of terms";
    cin>>n;
    cout<<"Fibonacci series :"<< t1 <<"," <<t2;
    for(int i=3;i<=n;i++){
        nextTerm = t1+t2;
        cout<<','<< nextTerm;
        t1 =t2;
        t2 = nextTerm;
    }
    cout<<endl;
}