// reversing link list 

class LL2 {
  
  class Node {
    int data ;
    Node next;
    
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  
  Node head = null;
  
  //adding Nodes
  public void add(int value){
    Node newNode = new Node(value);
    
    if(head==null){
      head=newNode;
    }
    else{
      newNode.next=head;
      head=newNode;
    }
    
  }
  
  // traversing list 
  public void get(){
    Node pointer = head;
    if(head==null){
      System.out.println("list doesnt exist");
    }
    else{
      while(pointer!=null){
        System.out.print(pointer.data + " ");
        pointer = pointer.next;
      }
    }
  }
  
  // reversing list
  public void reverse(){
    Node previous = null;
    Node current = head;
    if(head==null){
      System.out.println("list is empty");
    }
    else{
      while(current!=null){
        Node next = current.next;
        current.next=previous;
        
        // update the pointer
        previous = current;
        current = next;
      }
      head=previous;
      System.out.println();
    }
  }
  
  public static void main (String[]args){
    
    LL2 list = new LL2();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.get();
    
    list.reverse();
    list.get();
  }
}