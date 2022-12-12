public class Main extends Triangulo {

	private Triangulo triangulo;
	private String tipoLados;
	private String tipoAngulos;

	/**
	 * 
	 * @param triangulo
	 */
	public String CalcularTipo(Triangulo triangulo) {
		// TODO - implement Main.CalcularTipo

		if(Triangulo.getX() == Triangulo.getY() == Triangulo.getZ()){
			setTipoLado("EQUILATERO");  
		}else if(Triangulo.getX() == Triangulo.getY() != Triangulo.getZ() || Triangulo.getY() == Triangulo.getZ() !=Triangulo.getX(|| Triangulo.getX() == Triangulo.getZ() != Triangulo.getY()){
			setTipoLado("ISÓSCELES");
		}else if(Triangulo.getX() != Triangulo.getY() != Triangulo.getZ()){
			setTipoLado("ESCALENO");
		}



		throw new UnsupportedOperationException();
	}

	public String CalcularTipoAngulo(Triangulo triangulo){
		if(Triangulo.getA() == "90" || Triangulo.getB() == "90" || Triangulo.getC()== "90"){
			setTipoAngulo("RECTÁNGULO");  
		}else if(Triangulo.getA() < "90" && Triangulo.getB() < "90" && Triangulo.getC() < "90" ){
			setTipoAngulo("ACUTÁNGULO");
		}else if(Triangulo.getA() > "90" || Triangulo.getB() > "90" || Triangulo.getC() > "90"){
			setTipoAngulo("OBTUSÁNGULO");
		}

	}

	public String CompararTipos(String tipoLados, String tipoAngulos){
		if(tipoLados == "EQUILATERO"){
			if(tipoAngulos == "ACUTÁNGULO"){
				println("El triangulo es EQUILATERO y ACUTÁNGULO");
			}
			else{
				println("El triángulo no puede ser EQUILATERO y ACUTÁNGULO");
			}
		}
		if(tipoLados == "ISOSCELES"{
			
		})
		
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
		return this.tipo;
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