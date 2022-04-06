package shape;

/**
 *
 * @author mhddf
 */

public class Square extends Rectangle{
    public Square() {
        super.setWidth(0);
        super.setLength(0);
    }
    
    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return super.getWidth();
    }
    
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public String toString(){
        return "Super[" + super.toString() + ",width=" + super.getWidth() + ",length=" + super.getLength() + "]";
    }
    
    @Override
    public double getArea(){
        return super.getArea();
    }
    
    @Override
    public double getPerimeter(){
        return super.getPerimeter();
    }
}
