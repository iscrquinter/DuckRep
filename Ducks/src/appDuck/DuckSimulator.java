package appDuck;

import frmDuck.DucksProcessor;


public class DuckSimulator {

	public static void main(String[] args) {
		DucksProcessor dpmx= new DucksProcessorMX("PROCESADOR DE PATOS MEXICANO");
		
		dpmx.addDuck(dpmx.createDuck("Mallard"));
		dpmx.addDuck(dpmx.createDuck("Redhead"));
		
		dpmx.processDucks();
				
		DucksProcessor dpusa= new DucksProcessorUSA("PROCESADOR DE PATOS USA");
		
		dpusa.addDuck(dpusa.createDuck("Rubber")); 
		dpusa.addDuck(dpusa.createDuck("Decoy")); 
		
		dpusa.processDucks();
	}
}
