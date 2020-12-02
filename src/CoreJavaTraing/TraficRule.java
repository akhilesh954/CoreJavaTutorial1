package CoreJavaTraing;

public class TraficRule implements InterfaceConcept,Inteface2Implementation
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceConcept a=new TraficRule();
		Inteface2Implementation tc=new TraficRule();
		tc.TrainRedSignals();
		tc.TrainGreenSignals();
		tc.TrainYellowSignals();
		
         a.traficRedlight();
         a.traficYellolight();
         a.traficGreenlight();
         // Implement multiple interface
	}

	@Override
	public void traficGreenlight() {
		// TODO Auto-generated method stub
		System.out.println(" flash Green implementation");
	}

	@Override
	public void traficRedlight() {
		// TODO Auto-generated method stub
		System.out.println(" flash Red implementation");
	}

	@Override
	public void traficYellolight() {
		// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
		
	}

	@Override
	public void TrainRedSignals() {
		// TODO Auto-generated method stub
		System.out.println(" flash Red implementation");
	}

	@Override
	public void TrainGreenSignals() {
		// TODO Auto-generated method stub
		System.out.println(" flash Green implementation");
	}

	@Override
	public void TrainYellowSignals() {
		// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
		
	}

}
