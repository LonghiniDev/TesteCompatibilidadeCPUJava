package testeCompatibilidadeSocketJava;

public class Computador {

//	boolean socketAMD(String cpu, String placaMãe);
//	boolean socketINTEL(String cpu, String placaMãe);
	
    private String cpu;
    private String placaMãe;
    
    public Computador(String cpu, String placaMãe) {
        this.cpu = cpu;
        this.placaMãe = placaMãe;
    }
    
    public Computador() {
    	
    }
    
    public void setCpu(String cpu) {
		this.cpu = cpu;
	}
    
    public void setPlacaMãe(String placaMãe) {
		this.placaMãe = placaMãe;
	}
    
	public String getCpu() {
		return cpu;
	}
	
	public String getPlacaMãe() {
		return placaMãe;
	}
	
	public boolean socketAMD(String cpu, String placaMãe) throws Exception {
	    if (cpu == null) {
	        throw new IllegalArgumentException();
	    }
	    if (placaMãe == null) {
	        throw new IllegalArgumentException();
	    }
		
		if (cpu == "AMD" && (placaMãe == "AM3" || placaMãe == "AM4")) {
			return true;
		}
		return false;
	}

	public boolean socketINTEL(String cpu, String placaMãe) throws Exception {
	    if (cpu == null) {
	        throw new IllegalArgumentException();
	    }
	    if (placaMãe == null) {
	        throw new IllegalArgumentException();
	    }
	    
		if (cpu == "INTEL" && placaMãe == "LGA") {
			return true;
		}
		return false;
	}
	
}
