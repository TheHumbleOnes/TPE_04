package de.hs_mannheim.tpe.imb.ss14.g02.uebung4.Collatz;



public class CollatzMethode implements Runnable {

	private long start;
	private long ende;
	Long max = 0L;
	Long iterierungen = 0L;
	

	public CollatzMethode(long start, long ende) {
		this.start = start;
		this.ende = ende;
	}

	public void run() {

				

		for ( long i = this.start; i <= this.ende; i++) {

			long temp = i;
			long collatz = 0;
			while (temp != 1) {
				if (temp % 2 == 0) {
					temp /= 2;
					collatz++;
				} else {
					temp = ((3 * temp) + 1);
					collatz++;
				}
			}
			
			maxLength(i, collatz); 
			
		}
		System.out.println("Längste Folge mit " + iterierungen + " Iterationen bei Zahl " + max);
		
		
//		Set<Map.Entry<Long, Long>> entrySet = map.entrySet();
//		long max = 0;
//		long index = 0;
//		for (Map.Entry<Long, Long> entry : entrySet) {
//			long key = entry.getKey();
//			long value = entry.getValue();
//			if (value > max) {
//				max = value;
//				index = key;
//			}
//		}
//		System.out.println(index + " " + max);
	}
	
	private void maxLength(Long i, Long collatz){
		
		if(collatz > iterierungen){
			iterierungen = collatz;
			max = i;
		}
		
	}
	public String toString(){
		return "Längste Folge mit " + iterierungen + " Iterationen ist bei Zahl " + max;
	}

}
