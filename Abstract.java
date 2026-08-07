

abstract class Demo {
     int x; 
     void sayMyName() {
    	 System.out.println("my name is BABBLU");
     }
     abstract void sayMyAge();
}


public class Abstract extends Demo {

	@Override
	void sayMyAge() {
		System.out.println("Age in sub class is:25");
		
	}
	
			public static void main(String[]args) {
				Abstract ad = new Abstract();
				System.out.println(ad.x);
				ad.sayMyName();
				ad.sayMyAge();
				
				
						
}
}