class Solution {
    public int addDigits(int num) {
        //int num = sc.nextInt();
		
		while(num>=10){
		    int sum =0;
		
		while(num>0){
		   
		    sum = sum + num%10;
		    num=num/10;
		    //System.out.println(""+sum);
		}
		num = sum;
		//System.out.println(""+num);
		//28->10->1
	}
    return num;
    }
        
    }
