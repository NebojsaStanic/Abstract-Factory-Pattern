
public class AbstractFactoryPatternDemo {
	
	public static void main(String[]  args){
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		Shape shape1 = shapeFactory.getShape("circle");
		
		shape1.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Color color1 = colorFactory.getColor("blue");
		
		color1.fill();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		
		shape2.draw();
		
		Color color2 = colorFactory.getColor("red");
		
		color2.fill();
		
		Shape shape3 = shapeFactory.getShape("square");
		
		shape3.draw();
		
		
		Color color3 = colorFactory.getColor("green");
		
		color3.fill();
		
	}

}
