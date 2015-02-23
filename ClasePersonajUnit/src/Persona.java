public class Persona {

	private String nombre;
	private String apellido;
	private String apellido2;
	private int dniNum;
	private char dniLet;
	private int diaNac;
	private int mesNac;
	private int anyNac;
	private char sexo;
	private String estCiv;

	public static char dniLetts[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
			'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
			'K', 'E', 'T' };

	public Persona(String nom, String ape, String ape2, int dni, int dia,
			int mes, int any, char s, String est) {
		nombre = nom;
		apellido = ape;
		apellido2 = ape2;
		dniNum = dni;
		dniLet = dniLetts[dni % 23];
		diaNac = dia;
		mesNac = mes;
		anyNac = any;
		sexo = s;
		estCiv = est;
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellido(String nom) {
		apellido = nom;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido2(String nom) {
		apellido2 = nom;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setDNI(int num, char let) {
		dniNum = num;
		dniLet = let;
	}

	public void setDniWithoutLetter(int num) {
		dniNum = num;
		dniLet = dniLetts[num % 23];
	}

	public void setDiaNac(int num) {
		diaNac = num;
	}

	public void setMesNac(int num) {
		mesNac = num;
	}

	public void setAnyNac(int num) {
		anyNac = num;
	}

	public void setFechaNac(String s) {
		diaNac = (int) (s.charAt(1) + s.charAt(2));
		diaNac = (int) (s.charAt(4) + s.charAt(5));
		diaNac = (int) (s.charAt(7) + s.charAt(8) + s.charAt(9) + s.charAt(10));
	}

	public void setSexo(boolean x) {
		if (x)
			sexo = 'H';
		else
			sexo = 'M';
	}

	public void setEstCiv(String s) {
		estCiv = s;
	}

	public int getDniNum() {
		return dniNum;
	}

	public int getDniLet() {
		return dniLet;
	}

	public int getDiaNac() {
		return diaNac;
	}

	public int getMesNac() {
		return mesNac;
	}

	public String dniToString() {
		return "" + dniNum + " - " + dniLet;
	}

	public String fechaNacToString() {
		return "" + diaNac + " / " + mesNac + " / " + anyNac;
	}

	public char getSexo() {
		return sexo;
	}

	public String getEstCiv() {
		return estCiv;
	}
}
