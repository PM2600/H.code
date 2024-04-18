#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

void BubbleSort(vector<int>& v){
    for(int i = 0; i < v.size() - 1; i++){
        for(int j = 0; j < v.size() - 1 - i; j++){
            if(v[j] > v[j + 1]){
                int temp = v[j];
                v[j] = v[j + 1];
                v[j + 1] = temp;
            }
        }
    }
}

int main(){
    vector<int> v = {3, 5, 2, 9, 7, 1, 6};
    BubbleSort(v);
    for(int x : v){
        cout << x << ' ';
    }
    return 0;
}