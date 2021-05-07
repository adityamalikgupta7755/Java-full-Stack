interface Camera
{
    void takePhoto();
}

interface Phone
{
    void call();
}
class Iphone12 implements Camera, Phone
{
    public void takePhoto()
    {
        System.out.println("Photo capture");
    }
    public void call()
    {
        System.out.println("call connected");
    }
}

class Test2
{
    public static void main(String [] arg)
    {
        Camera c = new Iphone12();
        c.takePhoto();
        
        Phone p = new Iphone12();
        p.call();
    }
}