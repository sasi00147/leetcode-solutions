class Solution {
    public int maxProfit(int[] prices) {
        //initially buyprice having large value(assumption)
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            // if buy price less than selling price  then profit will generated
            if(buyprice<prices[i]){
                //calculating the profit
                int profit=prices[i]-buyprice;
                maxProfit=Math.max(profit,maxProfit);
            }
            
            else{
                //if buy price greater than selling price then loss generated 
                //to prevent this updating buyprice to selling price 
                buyprice=prices[i];
            } 
              
        }
        return maxProfit;
      

       
    }
    
}
