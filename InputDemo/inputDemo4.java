class Input4{
	int x = 30;
	static int y = 40;
	void fun(){
		System.out.println(" In fun");
	}
	static void run(){
		System.out.println(" In run");
	}
	public static void main(String [] args){
		Input4 obj = new Input4();
		System.out.println(obj.x);
		 System.out.println(obj.y);
		 obj.fun();
		 obj.run();
	}
}
                                                  
