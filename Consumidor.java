package miltin.threads.produtorConsumidor;

public class Consumidor extends Thread{
    Numero numero;
    
    Consumidor(Numero numero) {
    	this.numero = numero;
    }
    
    @Override
    public void run() {
    	int valor = 0;
    	
    	for(int k=0; k<10; k++) {
    		valor = this.numero.consumir(this.getName());
    		try {
    	    	   sleep((int) (Math.random()*100));
    	    	   } catch (InterruptedException e) {
    	    		   // TODO Auto-generated catch block
    	    		   e.printStackTrace();
    	    	   }
    	}
    }
}
