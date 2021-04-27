package miltin.threads.produtorConsumidor;

public class Numero0 {
	int numero;
	 Numero0(int numero){
	 this.numero = numero;
	 }
	 public synchronized int get(String idThread) {
	  System.out.println("Consumidor: \t" + idThread + "\t consumiu: \t");	
		
	  return this.numero;
	  }
	 public synchronized void produzir(String idThread,int valor) {
	  this.numero = valor;
	  System.out.println("Produtor:\t " + idThread + "\t produziu: \t");
	  }
}
