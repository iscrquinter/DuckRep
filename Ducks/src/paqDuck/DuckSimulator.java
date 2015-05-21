package paqDuck;


public class DuckSimulator {

	public static void main(String[] args) {
		DucksProcessor dpmx= new DucksProcessorMX("PROCESADOR DE PATOS MEXICANO");
		
		dpmx.addDuck(dpmx.createDuck("Mallard"));
		dpmx.addDuck(dpmx.createDuck("Redhead"));
		
		dpmx.processDucks();
				
		DucksProcessor dpusa= new DucksProcessorMX("PROCESADOR DE PATOS USA");
		
		dpusa.addDuck(dpusa.createDuck("Mallard"));
		dpusa.addDuck(dpusa.createDuck("Redhead"));
		
		dpmx.processDucks();
	}
}
