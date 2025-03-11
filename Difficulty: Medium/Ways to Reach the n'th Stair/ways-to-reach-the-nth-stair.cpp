//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    int countWays(int n) {
        // your code here
        if(n==1) return 1;
        if(n==2) return 2;
        
        int first=1;
        int second=2;
        int result=0;
        
        for(int i=3;i<=n;i++){
            result=first+second;
            first=second;
            second=result;
        }
        return result;
    }
};



//{ Driver Code Starts.
int main() {
    // taking total testcases
    int t;
    cin >> t;
    while (t--) {
        // taking stair count
        int m;
        cin >> m;
        Solution ob;
        cout << ob.countWays(m) << endl; // Print the output from our pre computed array

        cout << "~"
             << "\n";
    }
    return 0;
}

// } Driver Code Ends