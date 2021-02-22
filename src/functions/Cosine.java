package functions;

public class Cosine extends Unary {
	
	public Cosine(Quantity q) {
		super(q);
	}

	@Override
	public double getValue() {
		double val = realValue(q);
		return Math.cos(val);
	}
}
