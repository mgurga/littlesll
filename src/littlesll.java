
public class littlesll {
	private Node head;
	
	public littlesll() {
        head = null;
    }
	
	public void addNodeToStart(int addData) {
        head = new Node(addData, head);
    }
	
	public void deleteNodeFromStart() {
        if(head != null) {
            head = head.getLink();
        } else {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }
    }
	
	public boolean hasNext() {
        Node position = head;
        if(position.getLink() != null) {
            return true;
        }
        return false;
    }
	
	public int length() {
        int count = 0;
        Node position  = head;
        while(position != null) {
            count++;
            position = position.getLink();
        }
        return count;
    }
	
	public void showList() {
        Node position  = head;
        while (position != null) {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }
	
	private class Node {
		private int data;
	    private Node link;
	    
	    public Node (int data, Node link) {
	        this.data = data;
	        this.link = link;
	    }
	    
	    public int getData() {
	        return data;
	    }

	    public Node getLink() {
	        return link;
	    }
	    
	    public String toString() {
	        return "data: " + data + " links to " + link;
	    }
	    
	}
}

