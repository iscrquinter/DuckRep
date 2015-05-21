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
		
		DucksProcessor dpmxusa=new DucksProcessorMXUSA("PROCESADOR DE PAGOS MX-USA");
		
		dpmxusa.addDuck(dpmxusa.createDuck("Mallard"));
		dpmxusa.addDuck(dpmxusa.createDuck("Redhead"));
		dpmxusa.addDuck(dpmxusa.createDuck("Rubber")); 
		dpmxusa.addDuck(dpmxusa.createDuck("Decoy"));
		
		dpmxusa.processDucks();
	}
}
