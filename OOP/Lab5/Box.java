class Box
{
        double wid;
        double height;
        double depth;
    double volume()
    {
        double vol=wid*height*depth;
        return vol;
    }
}
class BoxDemo
{
    public static void main(String args[])
    {
        double vol;
        Box obj= new Box();
        obj.wid=10;
        obj.height=20;
        obj.depth=5;
        vol=obj.volume();
        System.out.println("Volume= "+vol);
    }
}