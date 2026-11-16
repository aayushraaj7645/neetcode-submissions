class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       
       if(flowerbed.length < n || (flowerbed[0] ==1  && n>0 && flowerbed.length ==1) ){
        return false;
       }
       if(flowerbed[0] ==0 && flowerbed.length ==1 && (n==1 || n==0)){
        return true;
       }
       for( int i =0;i<flowerbed.length;i++){
        if(i != 0 && i != flowerbed.length -1){
            if( flowerbed[i] ==1 ){ 
                if(flowerbed[i-1] == 1 || flowerbed[i+1] ==1){
                        return false;
            }
            }else{
                if(flowerbed[i-1] == 0 && flowerbed[i+1] ==0){
                    n--;
                    flowerbed[i]=1;
                }
            }
            

        }else if (i==0){
            if( flowerbed[i] ==0 &&flowerbed[i+1]==0){
                n--;
                 flowerbed[i]=1;
            }
        }
        if(i==flowerbed.length-1){
            if(flowerbed[i] ==0&&flowerbed[i-1]==0){
                n--;
                 flowerbed[i]=1;
            }
        }
        if(n<=0){
                return true;
            }
        
       }
       return false;
        
    }
}