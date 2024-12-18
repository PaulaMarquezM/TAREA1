package figuras;
public class Rectangulo implements FiguraGeomtrica {
	private float base;
	private float altura;

	public Rectangulo(float base, float altura) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public float Area() {
		return base * altura;
	}
}