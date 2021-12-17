class MyHashMap {
  final Node[] nodes = new Node[10000];
      
  public MyHashMap() {
  }
  
  public void put(int key, int val) {
    int i = idx(key);
    if (nodes[i] == null)
      nodes[i] = new Node(-1, -1);
    Node prev = find(nodes[i], key);
    if (prev.next == null) {
      prev.next = new Node(key, val);
    } else {
      prev.next.val = val;
    }

  }
  
  public int get(int key) {
    int i = idx(key);
    if (nodes[i] == null) return -1;
    Node prev = find(nodes[i], key);
    if (prev == null) return -1;
    return prev.next == null ? -1 : prev.next.val;
  }
  
  public void remove(int key) {
    int i = idx(key);
    if (nodes[i] == null) return;
    Node prev = find(nodes[i], key);
    if (prev.next == null) return;
    prev.next = prev.next.next;
  }

  public int idx(int key) {
    return Integer.hashCode(key) % nodes.length;
  }

  public Node find(Node head, int key) {
    Node prev = null;
    while (head != null && head.key != key) {
      prev = head;
      head = head.next;
    }
    return prev;
  }
  
  class Node {
      int key, val;
      Node next;

      public Node (int key, int val) {
        this.key = key;
        this.val = val;
        next = null;
      }
  }
}

/**
* Your MyHashMap object will be instantiated and called as such:
* MyHashMap obj = new MyHashMap();
* obj.put(key,value);
* int param_2 = obj.get(key);
* obj.remove(key);
*/