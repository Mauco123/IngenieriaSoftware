package mx.unam.aragon.ico.is.computadoraapi;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraapiApplicationTests {
	@Autowired
	private ComputadoraRepository computadoraRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarComputadora() {
		Computadora computadora = new Computadora(0,"HP","PAVIL",null,13.00f);
		computadoraRepository.save(computadora);
	}

	@Test
	void leerComputadoraPorClave() {
		Long claveTmp= 2l; //
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
		System.out.println(tmp);
	}

	@Test
	public void eliminarComputadora() {
		Long claveTmp= 1l;
		computadoraRepository.deleteById(claveTmp);

	}

	@Test
	public void actualizarComputadora() {
		Long claveTmp= 4l;
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
		tmp.setModelo("patito30209");
		computadoraRepository.save(tmp);
	}

}
