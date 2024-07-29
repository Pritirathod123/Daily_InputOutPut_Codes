class PatternPrint1{
	public static void main(String [] args){
		int rows = 4;
		for(int i = 0; i<rows;i++){

			for(int j = i ; j<rows ; j++){
				System.out.print(j + 1 + " ");
			}

			System.out.println();
		}
	}
}

