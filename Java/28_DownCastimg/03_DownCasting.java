class F 
{ }
class G extends F 
{ }

class H extends G 
{ }

class Test1 
{
    public static void main(String[] args)
    {
        F f1 = new H();
        G g1 = (G) f1;
        H h1 = (H) f1;
    }
}