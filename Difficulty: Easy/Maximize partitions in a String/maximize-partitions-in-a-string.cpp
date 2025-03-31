//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    int maxPartitions(string &s) {
        // code here
        unordered_map<char,int>mapend; 

        for(int i = 0; i< s.size(); i++){
           mapend[s[i]]  = i; 
        }
        int count = 0; 
        for(int i = 0 ; i< s.size();i++){
            int next = mapend[s[i]]; 
            
            int k = i+1; 
            while(k<next){
                next = max(next,mapend[s[k++]]); 
            }
            count++; 
            i = next; 
        }

        return count;
    }
};


//{ Driver Code Starts.

int main() {
    int tc;
    cin >> tc;

    for (int i = 0; i < tc; ++i) {
        string s;
        cin >> s;
        Solution obj;
        cout << obj.maxPartitions(s) << endl;
        cout << "~" << endl;
    }

    return 0;
}

// } Driver Code Ends