import java.util.InputMismatchException;

public class Main {

	private Triangulo triangulo;
	private String tipoLados;
	private String tipoAngulos;
	
	public Main(Triangulo triangulo, String tipoLados, String tipoAngulos) {
		this.triangulo = triangulo;
		this.tipoLados = tipoLados;
		this.tipoAngulos = tipoAngulos;
	}
	/**
	 * 
	 * @param triangulo
	 */
	public void CalcularTipo() {
		// TODO - implement Main.CalcularTipo
		if((triangulo.getX() == triangulo.getY()) && (triangulo.getY() == triangulo.getZ())){
			setTipoLado("EQUILATERO");  
		}else if((triangulo.getX() == triangulo.getY() && triangulo.getY() != triangulo.getZ()) || (triangulo.getY() == triangulo.getZ() && triangulo.getZ() != triangulo.getX())|| (triangulo.getX() == triangulo.getZ() && triangulo.getZ() != triangulo.getY())){
			setTipoLado("ISÓSCELES");
		}else if(triangulo.getX() != triangulo.getY() && triangulo.getY() != triangulo.getZ()){
			setTipoLado("ESCALENO");
		}

	}

	public void CalcularTipoAngulo(){
		if(triangulo.getA() == 90 || triangulo.getB() == 90 || triangulo.getC()== 90){
			setTipoAngulo("RECTÁNGULO");  
		}else if(triangulo.getA() < 90 && triangulo.getB() < 90 && triangulo.getC() < 90 ){
			setTipoAngulo("ACUTÁNGULO");
		}else if(triangulo.getA() > 90 || triangulo.getB() > 90 || triangulo.getC() > 90){
			setTipoAngulo("OBTUSÁNGULO");
		}


	}

	public String CompararTipos(){
		String tipo = "";
		if(tipoLados == "EQUILATERO") {
			if(tipoAngulos == "ACUTÁNGULO"){
				tipo = "El triangulo es EQUILATERO y ACUTÁNGULO";
			}
			else{
				throw new InputMismatchException("El triángulo no puede ser EQUILATERO y ACUTÁNGULO");
			}
		}
		else if(tipoLados == "ISOSCELES") {
			if(tipoAngulos == "ACUTÁNGULO"){
				tipo = "El triangulo es ISOSCELES y ACUTÁNGULO";
			}
			if(tipoAngulos == "RECTANGULO"){
				tipo = "El triangulo es ISOSCELES y RECTANGULO";
			}
			if(tipoAngulos == "OBTUSÁNGULO"){
				tipo = "El triangulo es ISOSCELES y OBTUSÁNGULO";
			}
		}
		else if(tipoLados == "ESCALENO") {
			if(tipoAngulos == "ACUTÁNGULO"){
				tipo = "El triangulo es ESCALENO y ACUTÁNGULO";
			}
			if(tipoAngulos == "RECTANGULO"){
				tipo = "El triangulo es ESCALENO y RECTANGULO";
			}
			if(tipoAngulos == "OBTUSÁNGULO"){
				tipo = "El triangulo es ESCALENO y OBTUSÁNGULO";
			}
		}
		return tipo;
		
	}

	public Triangulo getTriangulo() {
		return this.triangulo;
	}

	/**
	 * 
	 * @param triangulo
	 */
	public void setTriangulo(Triangulo triangulo) {
		this.triangulo = triangulo;
	}

	public String getTipo() {
		return this.tipoLados;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipoLado(String tipoLados) {
		this.tipoLados = tipoLados;
	}
	public void setTipoAngulo(String tipoAngulos){
		this.tipoAngulos = tipoAngulos;
	}

}
