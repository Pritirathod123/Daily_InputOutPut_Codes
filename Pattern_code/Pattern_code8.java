class Pattern8{
        public static void main(String [] args){
        int num = 9;
	char ch = 'B';
                for(int i= 1;i<=9;i++){
		if(num%2==1){
			System.out.print(num + " ");
		}
		else{
                      System.out.print(ch + " ");
		}
			ch++;
		        num--;

                }
		
        }
}
