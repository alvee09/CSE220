public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int counter= 0;
        for(Node n = head.next; n!=head; n=n.next)
        {
          counter++;
        }
        
        return counter; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
      int counter= countNode();
      for(Node n = head.next; n!=head; n=n.next, counter--)
      {
        if(counter==1)
        {
          System.out.println(n.element+". ");
        }
        else
        {
          System.out.print(n.element+", ");
        }
      } 
    }
    
    public void backwardprint(){
        int counter= countNode();
      for(Node n = head.prev; n!=head; n=n.prev, counter--)
      {
        if(counter==1)
        {
          System.out.println(n.element+". ");
        }
        else
        {
          System.out.print(n.element+", ");
        }
      }     
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
      int index=0;
      int counter= countNode();
      if(idx<0 || idx>=counter)
      {
        return null;
      }
      else 
      {
        for(Node n= head.next; n!=head; n=n.next, index++)
        {
          if(idx==index)
          {
            return n;
          }
        }
      }
      return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
      int index=0;
      int returnValue=-1;
      int counter= countNode();
      for(Node n= head.next; n!=head; n=n.next, index++)
      {
        if(n.element.equals(elem))
        {
          return index;
        }
      }
    return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        Node nm= new Node(elem, null, null);
        if(idx==0)
        {
          Node pred= head;
          Node succ= pred.next;
          nm.next= succ;
          nm.prev= head;
          succ.prev= nm;
          head.next= nm;
        }
        else
        {
          Node pred= nodeAt(idx-1);
          Node succ= pred.next;
          nm.next= succ;
          nm.prev= pred;
          pred.next= nm;
          succ.prev=nm;
        }
        
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
      int counter= countNode();  
      if(index>=0 || index<counter)
      {
        Node removal= nodeAt(index);
        Node succ=removal.next;
        Node pred= removal.prev;
        
        succ.prev= pred;
        pred.next= succ;
        Object temp= removal.element;
        removal.element= null;
        removal.next=null;
        removal.prev= null;
        return temp;
      }
      return null; // please remove this line!
    }
    
    
    
}