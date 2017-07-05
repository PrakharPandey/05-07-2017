class Tree
{
 private int data=30;
class Node
{
 void msg()
{
System.out.println("data is "+data);
}
}
 public static void main(String args[]){
  Tree ob=new Tree();
  Tree.Node obj=ob.new Node();
  obj.msg();
 }
}
