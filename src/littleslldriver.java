
public class littleslldriver {
	public static void main(String[] args) {
		littlesll sll = new littlesll();
		sll.addNodeToStart(5);
		sll.addNodeToStart(52);
		sll.addNodeToStart(-20);
        
		sll.showList();
        System.out.println("The list length is: " + sll.length());
        System.out.println();
        
        sll.deleteNodeFromStart();
        sll.showList();
        System.out.println("The list length is now: " + sll.length());
	}
}
