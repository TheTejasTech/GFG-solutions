class Solution {
  public:
    int idx = 0; 
void findLeaves(const vector<int>& preorder, vector<int>& leaves, int minVal, int maxVal) {
    if (idx >= preorder.size())
        return;

    int val = preorder[idx];
    if (val < minVal || val > maxVal)
        return;

    idx++;  
    int current = val;
 
    int prevIdx = idx;
    findLeaves(preorder, leaves, minVal, current - 1); 
    bool leftSubtreeExists = idx != prevIdx;

    prevIdx = idx;
    findLeaves(preorder, leaves, current + 1, maxVal);  
    bool rightSubtreeExists = idx != prevIdx;
 
    if (!leftSubtreeExists && !rightSubtreeExists) {
        leaves.push_back(current);
    }
}


    vector<int> leafNodes(vector<int>& preorder) {
        // code here
        
    vector<int> leaves;
    idx = 0;
    findLeaves(preorder, leaves, INT_MIN, INT_MAX);
    return leaves;
    }
};