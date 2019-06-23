class SuperClase {
	SuperClase(){
	System.out.println("Constructor de superclase");
	}
}

class ClaseHija extends SuperClase{
	ClaseHija() {
	System.out.println("Constructor de clase hija");
	}

	public static void main(String args[]) 
	{
	ClaseHija instancia = new ClaseHija();
	}
}

