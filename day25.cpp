class Solution {
public:
    vector<int> asteroidCollision(vector<int>& nums) {
        stack<int>st;
        vector<int>res;
        bool ok=false;
        for(int i=0;i<nums.size();i++){
            if(nums[i]<0 && ok==false){
                res.push_back(nums[i]);
            }else if(nums[i]>0){
                ok=true;
                st.push(nums[i]);
            }else if(nums[i]<0 && ok==true){
                bool ok1=false;
                while(st.size()>0 && st.top()<=abs(nums[i]) && st.top()>0 && ok1==false){
                    if(st.top()==abs(nums[i]) && st.top()>0)ok1=true;
                    st.pop();
                }
                if(st.size()==0 && ok1==false){
                    res.push_back(nums[i]);
                }
            }
        }
        vector<int>temp;
        while(st.size()>0){
            temp.push_back(st.top());
            st.pop();
        }
        reverse(temp.begin(),temp.end());
        for(auto it:temp){
            res.push_back(it);
        }
        return res;
    }
};
