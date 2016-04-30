
public class ColorFactory extends AbstractFactory{

	@Override
	Shape getShape(String shape) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if(color==null){
			return null;
		}
		
		if(color.equalsIgnoreCase("red")){
			return new Red();
		}
		else if(color.equalsIgnoreCase("blue")){
			return new Blue();
		}
		else if(color.equalsIgnoreCase("green")){
			return new Green();
		}
		
		return null;
	}

}
