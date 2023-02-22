/**
 * @author Francisco Salar Pérez
 * @version 1.2
 */
public class Rectangulo_FSP extends FiguraGeometrica_FSP {
	private double l1;
	private double l2;

	/**
	 * Método para recibir los parámetros necesarios
	 * @param tipoFigura String para comprobar
	 * @param lG double para comprobar
	 * @param lP double para comprobar
	 */
	public Rectangulo_FSP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Método que permite calcular el área
	 * @return area double devuelve un número tipo double
	 */
	@Override
	public double area() {
		return l1 * l2;
	}

	/**
	 * Método que permite calcular el perímetro
	 * @return perimetro double devuelve un número tipo double
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
