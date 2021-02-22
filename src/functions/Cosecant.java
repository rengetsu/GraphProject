package functions;

public class Cosecant extends Unary {
	
	public Cosecant(Quantity q) {
		super(q);
	}

	@Override
	public double getValue() {
		double val = realValue(q);
		return 1.0 / Math.sin(val);
	}
}
