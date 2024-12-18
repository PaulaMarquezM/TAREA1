package figuras;



public class Triangulo implements FiguraGeomtrica {
	private float base;
	private float altura;

	public Triangulo(float base, float altura) {
		this.altura = altura;
		this.base = base;

	}

	@Override
	public float Area() {
		return (base * altura) / 2;
	}
}