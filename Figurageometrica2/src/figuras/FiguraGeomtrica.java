package figuras;

public interface FiguraGeomtrica {
	float Area();

	public static void main(String[] args) {
		FiguraGeomtrica rectangulo = new Rectangulo(5, 10);
		FiguraGeomtrica triangulo = new Triangulo(4, 7);
		FiguraGeomtrica circulo = new Circulo(3);
		System.out.println("Area del Rectangulo: " + rectangulo.Area());
		System.out.println("Area del Triangulo: " + triangulo.Area());
		System.out.println("Area del Circulo: " + circulo.Area());
	}
}