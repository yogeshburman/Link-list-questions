// finding max and minumum element in list

class LL {
  
  class Node {
    int data;
    Node next;
    
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  
  Node head = null;
  
  // adding node 
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
  
  // traverse node 
  public void get(){
    Node pointer = head;
    if(head==null){
      System.out.println("list doesnt exist");
    }
    else{
      while(pointer!=null){
        System.out.print( "  " +pointer.data );
        pointer=pointer.next;
      }
    }
  }
  
  // finding max element 
  public void max(){
    Node pointer = head;
    int max = 0;
    if(head==null){
      System.out.println("list doesnt exist");
    }
    else {
      max=pointer.data;  // for assigning first element as max 
      while(pointer!=null){
       if(max<pointer.data){
         max=pointer.data;
       }
       pointer=pointer.next;
      }
      System.out.println();
      System.out.println("max element is = " + max);
    }
  }
  
  
  // finding minimum element in list 
  public void min(){
      Node pointer = head;
      int min = pointer.data; // assign first node data in variable
      if(head==null){
        System.out.println("list is doesnt exist");
      }
      else{
        while(pointer!=null){
           if(min>pointer.data){
             min=pointer.data;
           }
           pointer=pointer.next;
        }
        System.out.println("Minimum element is = " + min);
      }
    }
  
  public static void main (String[]args){
    LL list = new LL();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.get();
    list.max();
    list.min();
  }
}