package functions;

public class Tangent extends Unary {
	
	public Tangent(Quantity q) {
		super(q);
	}

	@Override
	public double getValue() {
		double val = realValue(q);
		return Math.tan(val);
	}
}
