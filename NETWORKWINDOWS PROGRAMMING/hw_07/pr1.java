public class pr1 {
	public static void main(String[] args) {
		Ball b = new Ball(1.0, 1.0, 1.0, 2.5);
		b.show();
		b.volume();
	}
}

interface IShow {
	void show();
}

interface IVolume {
	void volume();
}

class Ball implements IShow, IVolume {
	private final double x;
	private final double y;
	private final double z;
	private final double r;

	Ball(double x, double y, double z, double r) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
	}

	@Override
	public void show() {
		System.out.printf("center=(%.1f, %.1f, %.1f), radius=%.1f%n", x, y, z, r);
	}

	@Override
	public void volume() {
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
		System.out.printf("volume=%.4f%n", volume);
	}
}
