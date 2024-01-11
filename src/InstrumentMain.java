
public class InstrumentMain {

	public static void main(String[] args) {
		 
//		Instrument i=null;
//		i=new Guitar();
//		i.play();
//		i=new Piano();
//		i.play();
		Instrument iarr[]= new Instrument[5];
		iarr[0]=new Guitar();
		iarr[1]=new Piano();
		iarr[2]=new Piano();
		iarr[3]=new Guitar();
		iarr[4]=new Piano();
		display(iarr);
	}
	
	public static void display(Instrument iarr[]) {
		for(int i=0; i<iarr.length; i++) {
			if(iarr[i] instanceof Guitar) {
				iarr[i].play();
			}
		}
		
	}

}
