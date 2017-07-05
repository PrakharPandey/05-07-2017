public class MySingleton
{
public static MySingleton myInstance()
{
MySingleton instance=null;
if(instance==null)
{
instance=new MySingleton();
}
return instance;
}
private MySingleton()
{
}
public String testString()
{
return "MySingleton instance used";
}
}