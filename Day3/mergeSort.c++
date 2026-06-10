#include <iostream>
#include <vector>
using namespace std;

void merge(vector<int>& arr, int s, int mid, int e) {
    vector<int> temp;

    int i = s;
    int j = mid + 1;

    while (i <= mid && j <= e) {
        if (arr[i] <= arr[j])
            temp.push_back(arr[i++]);
        else
            temp.push_back(arr[j++]);
    }

    while (i <= mid)
        temp.push_back(arr[i++]);

    while (j <= e)
        temp.push_back(arr[j++]);

    for (int k = s; k <= e; k++)
        arr[k] = temp[k - s];
}

void mergeSort(vector<int>& arr, int s, int e) {
    if (s >= e)
        return;

    int mid = s + (e - s) / 2;

    mergeSort(arr, s, mid);
    mergeSort(arr, mid + 1, e);

    merge(arr, s, mid, e);
}

int main() {
    vector<int> arr = {5,4,3,2,1};

    mergeSort(arr, 0, arr.size() - 1);

    for (int x : arr)
        cout << x << " ";

    return 0;
}