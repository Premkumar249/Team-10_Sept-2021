class DeletePos {
	Node2 head;
	
	static class Node2
	{
		int data;
		Node2 next;
		
		Node2(int d)
		{
			data = d;
			next = null;
		}
}

	public void DeletePos(int pos)
	{
		if(head == null)
		{
			return;
		}
		Node2 n = head;
		if(pos == 0)
		{
			head = n.next;
		}
		for(int i = 0; n!=null && i<pos-1; i++)
			n = n.next;
		if(n==null)
			return;
		n.next = n.next.next;
			
	}
	
	void display()
	{
		Node2 n = head;
		while(n != null)
		{
			System.out.print(n.data +"|");
			n = n.next;
		}
		System.out.print("NULL");
	}
	public static void main(String[] args) {
		DeletePos l2 = new DeletePos();
		
		l2.head = new Node2(18);
		l2.head.next = new Node2(12);
		l2.head.next.next = new Node2(13);
		l2.head.next.next.next = new Node2(11);
		l2.head.next.next.next.next = new Node2(17);
		l2.display();
		System.out.println();
		l2.DeletePos(1);
		l2.display();
		System.out.println();
		l2.head = new Node2(98);
		l2.head.next = new Node2(24);
		l2.head.next.next = new Node2(32);
		l2.head.next.next.next = new Node2(17);
		l2.head.next.next.next.next = new Node2(74);
		l2.display();
		System.out.println();
		l2.DeletePos(0);
		l2.display();
	}

}
