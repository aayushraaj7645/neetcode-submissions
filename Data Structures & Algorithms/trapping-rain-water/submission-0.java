class Solution {
    public int trap(int[] height) {
        int j =0;
        int area =0;
        int finalArea = 0;
        int index =0;
        int i =0;
     while((i<height.length)&&(j<height.length)){
       
            if(j>i){
                int length = Math.min(height[i],height[j]);
                int breadth = j-i-1;
                area = length*breadth;
                finalArea += area;
                i = index;
            }
           
             if(height[j]!=0){
            index = j;
        }
         j++;
            
        }
        return finalArea;
    }
}
