#include <bits/stdc++.h>
using namespace std;

long long solve(vector<int>& arr, int i) {
    if (i >= arr.size()) {
        return 0;
    }

    // Take
    long long take = 1LL * arr[i] * i + solve(arr, i + 2);

    // Not take
    long long nottake = solve(arr, i + 1);

    return max(take, nottake);
}

int main() {
    int n;
    cin >> n;

    vector<int> arr(100001, 0);

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        arr[x]++;
    }

    long long ans = solve(arr, 1);
    cout << ans << endl;

    return 0;
}