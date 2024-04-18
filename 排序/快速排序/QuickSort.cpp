#include<iostream>
#include<vector>

using namespace std;

void Quick_sort(vector<int>& nums, int l, int r){
    if(l + 1 > r){
        return;
    }
    int first = l, last = r - 1;
    int key = nums[first];
    while(first < last){
        while(first < last && key <= nums[last]){
            last--;
        }
        nums[first] = nums[last];
        while(first < last && key >= nums[first]){
            first++;
        }
        nums[last] = nums[first];
    }
    nums[first] = key;
    Quick_sort(nums, l, first);
    Quick_sort(nums, first + 1, r);
}

int main()
{
    vector<int> nums = {2, 5, 9, 3, 1, 6, 4};
    Quick_sort(nums, 0, nums.size());
    for(int i = 0; i < nums.size(); i++){
        cout << nums[i] << " ";
    }
    return 0;
}
