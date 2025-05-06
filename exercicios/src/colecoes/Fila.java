package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
/*Sempre o primeiro elemento a ser modificado é o primeiro a entrara na Fila. Comportamento da fila é de First in, First out (FiFo), o primeiro
 * elemento a entrar é o primeiro elemento a sair. Por isso, quando usamos o peek(), ele sempre irá retornar o primeiro elemento da fila, no caso
 * a Ana. Quando utilizamos o poll(), seguirá a ordem FiFo: Ana->Bia->Carlos->Daniel...*/
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		/*Diferença de add() e offer(): Ambos adicionam elementos na fila!
		 * Em caso de fila com tamanho predeterminado, no caso do add() irá retornar uma exceção caso a fila esteja completa. No caso do offer() 
		 * irá retornar um valor booleano true ou false se foi adicionado ou não a fila: se a fila tiver espaço livre, é adicionado e retorna 
		 * true, se a fila estiver cheia, não é adicionado e retorna false.*/
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		/*Diferença de peek() e element(): Ambos obtém o próximo elemento da fila! (Sem remover)
		 *A diferença é quando a fila estiver vazia. no peek() irá retornar null, no element() retornará uma exceção. */
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		/*Diferença de pool() e remove(): Ambos obtém o próximo elemento da fila e remove!
		 *A diferença é quando a fila estiver vazia. no poll() irá retornar null, no remove() retornará uma exceção. */
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
//		fila.size() -> retorna o tamanho da fila
//		fila.clear() -> limpa a fila
//		fila.isEmpty() -> retorna um boolean true se a fila estiver vazia e false se tiver algum elemento.
//		fila.contains() -> verifica se contém o elemento que passamos como parâmetro dentro da fila
		
	}
}
