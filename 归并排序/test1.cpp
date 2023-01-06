#include<bits/stdc++.h>

using namespace std;

void merge_sort(vector<int> &nums, int l, int r, vector<int> &temp) 
{
    if (l + 1 >= r) 
    {
        return;
    }
    // divide
    int m = l + (r - l) / 2;
    merge_sort(nums, l, m, temp);
    merge_sort(nums, m, r, temp);
    // conquer
    int p = l, q = m, i = l;
    while (p < m || q < r)
    {
        if (q >= r || (p < m && nums[p] <= nums[q]))
            temp[i++] = nums[p++];
        else
            temp[i++] = nums[q++];
    }
    for (i = l; i < r; ++i) 
    {
        nums[i] = temp[i];
    }
}

int main()
{
    vector<int> nums = {2, 5, 9, 3, 1, 6, 4};
    vector<int> temp(nums.size());
    merge_sort(nums, 0, nums.size(), temp);
    for(int i = 0; i < nums.size(); i++){
        cout << nums[i] << " ";
    }
    return 0;
}