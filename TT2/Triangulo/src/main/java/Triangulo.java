import java.util.InputMismatchException;

public class Triangulo {

	//Según sus lados
	private int x;
	private int y;
	private int z;

	//Según sus ángulos
	private int a;
	private int b;
	private int c;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangulo(int x, int y, int z, int a, int b, int c) {
		// TODO - implement Triangulo.Triangulo
		this.x = x;
		if(x < 1 || x > 100) {
			throw new InputMismatchException("El lado no puede ser menor que 1 ni mayor que 100");
		}
		this.y = y;
		if(y < 1 || y > 100) {
			throw new InputMismatchException("El lado no puede ser menor que 1 ni mayor que 100");
		}
		this.z = z;
		if(z < 1 || z > 100) {
			throw new InputMismatchException("El lado no puede ser menor que 1 ni mayor que 100");
		}
		if(x + y <= z || y + z <= x || x + z <= y) {
			throw new InputMismatchException("La suma de dos lados no pueden ser mas pequeño que el lado del tercero");
		}
		this.a = a;
		this.b = b;
		this.c = c;
		if (a < 1 || b < 1 || c < 1 ) {
			throw new InputMismatchException("Los angulos del triangulo tienen que ser mayor que 1");
		}
		if ((a + b + c) != 180) {
			throw new InputMismatchException("Los angulos del triangulo tienen que sumar 180 grados");
		}
	}

	public int getX() {
		return this.x;
	}

	/**
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	/**
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return this.z;
	}

	/**
	 * 
	 * @param z
	 */
	public void setZ(int z) {
		this.z = z;
	}

	public int getA() {
		return this.a;
	}

	/**
	 * 
	 * @param a
	 */
	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return this.b;
	}

	/**
	 * 
	 * @param b
	 */
	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return this.c;
	}

	/**
	 * 
	 * @param c
	 */
	public void setC(int c) {
		this.c = c;
	}


}