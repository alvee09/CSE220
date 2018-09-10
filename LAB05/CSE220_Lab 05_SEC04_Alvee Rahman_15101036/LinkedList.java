public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head = new Node( a[0], null);
    Node n= head;
    for(int i= 1; i<a.length; i++)
    {
      if(i==1)
      {
        head.next= new Node(a[i], null);
        n= n.next;
      }
      else
      {
        n.next= new Node(a[i], null);
        n= n.next;
      }
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count= 0;
    for( Node n= head; n!=null; n= n.next)
    {
      count++;
    }
    return count; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    Node n= head;
    for(int i= 1; n!=null; i++)
    {
      int counter = countNode();
      if(i== counter)
      {
        System.out.println(n.element+".");
        n= n.next;
      }
      else
      {
        System.out.print(n.element+", ");
        n =n.next;
      }
    }
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int counter= countNode();
    if(idx<0 || idx>=counter)
    {
      return null;
    }
    else
    {
      Node n = head;
      for(int i=0; i<=idx;  i++)
      {
       if(i==idx)
       {
         return n;
       }
       else
       {
         n= n.next;
       }
      }
      return null;
    }
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    Node n = nodeAt(idx);
    if(n==null)
    {
      return null;
    }
    else
    {
      return n.element;
    }
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    Node n= nodeAt(idx);
    if(n== null)
    {
      return null;
    }
    else
    {
      Object temp = n.element;
      n.element= elem;
      return temp;
    }
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    Node n= head;
    for(int i =0; n!= null; i++)
    {
      if(n.element== elem)
      {
        return i;
      }
      n= n.next;
    }
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
   Node n= head;
    for(int i =0; n!= null; i++)
    {
      if(n.element== elem)
      {
        return true;
      }
      n= n.next;
    }
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node newHead= new Node(null , null);

    Node m= head;
    for(Node n= newHead; n!=null; n= n.next)
    {
      n.element= m.element;
      n.next= m.next;
      m = m.next;
    }
    return newHead; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node newhead= new Node(null, null);
    int counter =countNode();
    Node nm= newhead;
    for(int i= counter-1; i>=0; i--)
    {
      if(i==counter-1)
      {
        nm.element= get(i);
      }
      else
      {
        nm.next= new Node(get(i), null);
        nm=nm.next;
      }
    }
    return newhead; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    Node pred= head;
    if(idx==0)
      {
        Node temp = pred;
        head = new Node(elem, temp);
      }
      else
      {
        for(int i= 1; i< idx; i++)
        {
          pred= pred.next;
        }
        Node temp= pred.next;
        pred.next= new Node(elem, temp);
      }
    
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    Node pred= head;
    Object elem= null;
    if(index==0)
      {
        Node temp = pred;
        elem= pred.element;
        head = pred.next;
        return elem;
      }
      else
      {
        for(int i= 1; i<index; i++)
        {
          pred= pred.next;
        }
        elem= pred.next.element;
        pred.next= pred.next.next;
      }
    return elem; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    Node n =head;
    for( n= head; n.next!=null; n=n.next){
    }
    n.next= head;
    head= head.next;
    n.next.next= null;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    Node n =head;
    for( n= head; n.next.next!=null; n=n.next){
    }
    n.next.next= head;
    head= n.next;
    n.next = null;
  }
  
}