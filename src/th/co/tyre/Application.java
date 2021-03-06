package th.co.tyre;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("--------- GalaxyNote 8 \n");
		GalaxyNote8 note8 = new GalaxyNote8();
		note8.useGearVR();
		note8.usePen();
		note8.googlePlay();
		note8.phoneCall();
		note8.sms();
		note8.internetSurfing();
		
		System.out.println();
		
		System.out.println("---------- Galaxy S8 \n");
		GalaxyS8 s8 = new GalaxyS8();
		s8.useGearVR();
		s8.googlePlay();
		s8.phoneCall();
		s8.sms();
		s8.internetSurfing();
		
		// --------------------
		
		System.out.println("---------------------------------- \n");
		
		System.out.println("---------- iPhone X \n");
		IphoneX iphoneX = new IphoneX();
		iphoneX.appStore();
		iphoneX.faceID();
		iphoneX.phoneCall();
		iphoneX.sms();
		iphoneX.internetSurfing();
		
		System.out.println("\n ---------- iPhone 8 \n");
		Iphone8 iphone8 = new Iphone8();
		iphone8.touchID();
		iphone8.appStore();
		iphone8.phoneCall();
		iphone8.sms();
		iphone8.internetSurfing();
		
		
		

	}

}
