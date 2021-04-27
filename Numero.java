package miltin.threads.produtorConsumidor;

public class Numero{
 private int numero;
 private boolean disponivel;
 
 Numero(int numero){
 this.numero = numero;
 this.disponivel = false;
 
 }
 public synchronized int consumir(String idThread) {
	 while(this.disponivel == false) {
		 try {
		 this.wait();
	 } catch (InterruptedException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
	 }
	 }
	 
	 
     System.out.println("Consumidor: \t" + idThread + "\t consumiu: \t"  + numero);	
     this.disponivel = false;
     notifyAll();
     return this.numero;
  }
 public synchronized void produzir(String idThread,int valor) {
	 while(this.disponivel == true) {
		 try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 this.disponivel = true;
     this.numero = valor;
     notifyAll();
     System.out.println("Produtor:\t " + idThread + "\t produziu: \t" + valor);
  }
}
