package week1.day1;

public class Mobile {
	
	private void makeCall() {
		
		System.out.println("makeCall");
		
	}
	
	private void sendMessage() {
		
		System.out.println("sendMessage");

	}
	public static void main(String[] args) {
		
		String mobileModel="Nokia";
	
		float mobileWeight=5.1145f;
		
		boolean isFullCharged=true;
		
		int mobileCost=10000;
		
		char logo='N';
		
		Mobile obj=new Mobile();
		
		obj.makeCall();
		
		obj.sendMessage();
		System.out.println("This is my mobile");
		
		System.out.println(mobileModel);
		
		System.out.println(mobileWeight);
		
		System.out.println(isFullCharged);
		
		System.out.println(mobileCost);
		
		System.out.println(logo);
			
		
	}

}
