package decent.sample;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.go();
	}

	private void go() {
		System.out.println("Hello I!");
		System.out.println("Hello We!");
		System.out.println("Hello World!");
		System.out.println("Hello Universe!");
		System.out.println("Hello Multiverses!");
		goFurther();
	}

	private void goFurther() {
		System.out.println("... and further where no man has gone before!");
		boolean shallGo = true;
		if (shallGo) {
			goEvenFurther();
		}
	}

	private void goEvenFurther() {
		System.out.println("... and further into layers!");
		for (int i=0; i<5; i++) {
			for (int j=0; i<5; i++) {
				for (int k=0; i<5; i++) {
					System.out.println("  " +i+" -> "+j+" -> "+k + " !");
				}
			}
		}
	}

}
