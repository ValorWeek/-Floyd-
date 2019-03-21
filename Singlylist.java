
public class Singlylist<T> extends Object {
	private static final char[] removeAll = null;
	public Node<T> head;

	public Singlylist() {
		this.head = new Node<T>();
	}

	public Singlylist(T[] values) {
		this();
		Node<T> rear = this.head;
		for (int i = 0; i < values.length; i++) {
			rear.next = new Node<T>(values[i], null);
			rear = rear.next;
		}
	}

	public int count() {
		int count = 0;
		for (Node<T> p = this.head.next; p != null; p = p.next)
			count++;
		return count;
	}

	public boolean equals(Object obj)// 比较相等
	{
		if (this == obj)
			return true;
		if (obj instanceof Singlylist<?>) {
			Node<T> p = ((Singlylist<T>) obj).head.next;
			Node<T> q = this.head.next;
			if (this.count() == ((Singlylist<T>) obj).count()) {
				for (int i = 0; i < this.count(); i++)
					if (!(p.data.equals(q.data)))
						return false;
					else {
						p = p.next;
						q = q.next;
					}
			}
			if (p == null && q == null)
				return true;
		}
		return false;
	}

	public static void main(String args[]) {
		String values[] = { "A", "B", "C", "D", "E", "1" };
		Singlylist<String> list = new Singlylist<String>(values);
		String values2[] = { "A", "B", "C", "D", "E", "1" };
		Singlylist<String> list2 = new Singlylist<String>(values2);
		System.out.println(list.equals(list2));
	}
}
