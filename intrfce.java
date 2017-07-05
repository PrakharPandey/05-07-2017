interface A
{
public void show(int a);
}
class intrfce implements A
{
int data=10;
public void show(int data)
{
int n=data;
System.out.println(n);
}
 public static void main(String args[]){
  intrfce ob=new intrfce();
  A inte=new intrfce();
  ob.show(10);
  inte.show(20);
 }
}
