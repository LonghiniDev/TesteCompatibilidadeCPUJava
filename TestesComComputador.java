package testeCompatibilidadeSocketJava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class TestesComComputador {
	
	@Test
	public void testeSocketA() {
		String cpu = "AMD";
		String placaMãe = "AM4";

		Computador computador = new Computador(cpu, placaMãe);

		assertEquals(cpu, computador.getCpu());
		assertEquals(placaMãe, computador.getPlacaMãe());
	}

	@Test
	public void testeSocketB() {
		String cpu = "AMD";
		String placaMãe = "AM4";

		Computador computador = new Computador(cpu, placaMãe);
		
		computador.setCpu(cpu);
		computador.setPlacaMãe(placaMãe);

		assertEquals("AMD", computador.getCpu());
		assertEquals("AM4", computador.getPlacaMãe());
	}

	@Test
	public void testeSocketC() {
		assertThrows(IllegalArgumentException.class, () -> {
			Computador computador = new Computador(null, null);

			computador.socketAMD(null, null);
			
			computador.socketINTEL(null, null);
			
			
		});
	}

	@Test
	public void testeSocketD() {
		Computador computador1 = new Computador();
		computador1.setCpu("INTEL");
		computador1.setPlacaMãe("LGA");

		assertEquals("INTEL", computador1.getCpu());
		assertEquals("LGA", computador1.getPlacaMãe());

		Computador computador2 = new Computador();
		computador2.setCpu("INTEL");
		computador1.setPlacaMãe("LGA");

		assertEquals("INTEL", computador1.getCpu());
		assertEquals("LGA", computador1.getPlacaMãe());

		Computador computador3 = new Computador();
		computador3.setCpu("INTEL");
		computador1.setPlacaMãe("LGA");

		assertEquals("INTEL", computador1.getCpu());
		assertEquals("LGA", computador1.getPlacaMãe());
	}

	@Test
	public void testeSocketE() throws Exception {
		String cpu = "INTEL";
		String placaMãe = "LGA";

		Computador computador = new Computador(cpu, placaMãe);

		assertEquals(true, computador.socketINTEL(cpu, placaMãe));
	}
}
	
// True socketINTEL
//	assertEquals(true, computador.socketINTEL("INTEL", "LGA"));
	
// True socketAMD
//		assertEquals(true, computador.socketAMD("AMD", "AM4"));
//		assertEquals(true, computador.socketAMD("AMD", "AM3"));

// False socketAMD
//		assertEquals(false, computador.socketAMD("AMD", "LGA"));
//		assertEquals(false, computador.socketAMD("INTEL", "AM3"));
//		assertEquals(false, computador.socketAMD("INTEL", "AM4"));

// False socketINTEL
//		assertEquals(false, computador.socketINTEL("INTEL", "AM4"));
//		assertEquals(false, computador.socketINTEL("INTEL", "AM3"));
//		assertEquals(false, computador.socketINTEL("AMD", "LGA"));
