// finding middle element 

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

// finding middle element 
public void middle(){
  int count=0;
  
  Node pointer=head;
  if(head==null){
    System.out.println("list is empty");
  }
  else{
    while(head!=null){
      head=head.next;
      count++;
    }
    
    if(count%2==0){  // this is use for printing first element from middle by using even list
      int temp=count/2;
    for(int i=1;i<temp;i++){
      pointer=pointer.next;
    }
    System.out.println();
    System.out.println("middle element is = " + pointer.data);
      
    }
    else{
      int temp=count/2;
    for(int i=0;i<temp;i++){
      pointer=pointer.next;
    }
    System.out.println();
    System.out.println("middle element is = " + pointer.data);
    }
    
    
  }
}
  
  
  
  
  
  public static void main (String[]args){
    LL list = new LL();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(9);
    list.get();
    list.middle();
    
  }
}