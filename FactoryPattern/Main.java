public class Main{
    public static void main(String[] args){

        ShapeFactory sf = new ShapeFactory();
        Shape obj = sf.getShape("Rectangle");
        obj.draw();


        // if we would'nt have shape factory
        // we would have to put on multiple if else condition
        // i.e if input == "Circle" => get a Circle obj
        // if input =="Rectangle" => get a Rect obj
        // with factory pattern we can just pass the input and
        // base on the input we will get the obj
    }
}