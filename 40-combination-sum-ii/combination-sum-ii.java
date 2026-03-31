class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(candidates); 
        
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        
        return ans;
    }

    private void backtrack(int start, int[] arr, int target,
                           List<Integer> curr, List<List<Integer>> ans) {
        //base case
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            //skip duplicates
            if (i > start && arr[i] == arr[i - 1]) continue;

            //stop if element exceeds target
            if (arr[i] > target) break;

            // choose
            curr.add(arr[i]);

            // move forward (i + 1 → no reuse)
            backtrack(i + 1, arr, target - arr[i], curr, ans);

            // backtrack
            curr.remove(curr.size() - 1);
        }
    }
}