class InputDemo1{
	void fun(){
		System.out.println(" In fun method");
	}
	static void run(){
		System.out.println(" In run method ");
	}
	public static void main(Stringn[] args){
		System.out.println(" In  main method ");
		run();
		InputDemo obj = new InputDemo();
		obj.fun();
	}
}
