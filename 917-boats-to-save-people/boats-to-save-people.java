class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        int boats=0;
        int sum=0;
        Arrays.sort(people);
        int i=0, j=n-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
}