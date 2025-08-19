package dgtic.core.service;

import java.util.Random;

import dgtic.core.exception.CreditosMenores;
import dgtic.core.model.Estudiante;
import dgtic.core.model.Materia;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.jupiter.api.Assertions.*;

import dgtic.core.service.ServicioDAO;

@SpringBootTest
@ComponentScan("dgtic.core")
public class ServicioDAOTest {
   @Autowired

    private ServicioDAO servicio;

    private int lista[];
    @BeforeEach
    public void inicio() {
        System.out.println("Antes de cada método");
        Random rd=new Random();
        int limite=rd.nextInt(3)+1;
        lista=new int[limite];
        for(int i=0;i<limite;i++) {
            lista[i]=i;
        }
    }
    @AfterEach
    public void despues() {
        System.out.println("Despues de cada método");
    }
    @Test
    public void testUno(){
        System.out.println("Prueba unitaria");
        String esperado="Spring";
        String actual="spring";
        assertEquals(esperado, actual,"Cadenas no iguales");
    }
    @Test
    public void testDos(){
        int[] esperado= {0,1,2};
        assertArrayEquals(esperado, lista);
    }

    @Test
    public void testTres(){
        Estudiante est=null;
        assertNull(est);
        est=new Estudiante("123", "Raul", 20);
        assertNotNull(est);
    }

    @Test
    public void testCuatro() {
        Estudiante valorActual = new Estudiante("234", "Raul", 18);
        Estudiante valorEsperado = new Estudiante("234", "Raul", 18);
        Estudiante valorEsperadoTmp = valorEsperado;
// dos variables se refieren al mismo objeto
//assertSame(valorEsperado, valorActual);
//assertSame(valorEsperado, valorEsperadoTmp);
//dos variables no se refieren al mismo objeto
//assertNotSame(valorEsperado, valorActual);
// Se quiere verificar sin son iguales, respecto a su estado
// implementar equals
//assertEquals(valorEsperado, valorActual);
    }

    @Test
    public void testCinco() {
        Estudiante est = servicio.getServicioDAO().getEstudiante("ico", "123");
        String esperado="Lógica";
        assertEquals(esperado, est.getMaterias().stream()
                .filter(dato->dato.getNombre().equals("Lógica"))
                .findFirst().get().getNombre(),"Primero");
        assertTrue(est.getMaterias().stream()
                .filter(dato->dato.getNombre().equals("Lógica"))
                .findFirst().isPresent(),"Log");
        assertTrue(est.getMaterias().stream()
                .anyMatch(dato->dato.getNombre().equals("Lógica")));
        assertFalse(est.getMaterias().stream()
                .anyMatch(dato->dato.getNombre().equals("Lógica")));
    }

    @Test
    public void testSeis() {
        Estudiante est = servicio.getServicioDAO().getEstudiante("ico", "123");
        String esperado="Lógica";
//assertAll(()->{},()->{},()->{});
        assertAll(()->{assertEquals(esperado, est.getMaterias().stream()
                        .filter(dato->dato.getNombre().equals("Lógica"))
                        .findFirst().get().getNombre());},
                ()->{assertTrue(est.getMaterias().stream()
                        .filter(dato->dato.getNombre().equals("Lógic"))
                        .findFirst().isPresent());},
                ()->{assertTrue(est.getMaterias().stream()
                        .anyMatch(dato->dato.getNombre().equals("Lógica")));}
        );
    }

    @Test
    public void testSiete() {
        Materia materia = new Materia("Algebra", 23);
        Exception exp = assertThrows(CreditosMenores.class, () -> {
            materia.setCreditos(-20);
        });
        String actual = exp.getMessage();
        String esperado = "No creditos negativos";
        // verdadero, se prueba el error
        assertEquals(esperado, actual);
    }

    @Test
    @DisplayName("assertIterableEquals sin equals y con equals")
    public void testOcho() {
        Estudiante estUno = servicio.getServicioDAO().getEstudiante("ico", "123");
        Estudiante estDos = servicio.getServicioDAO().getEstudiante("ico", "124");
//Sin implementar equals en Materia
//assertIterableEquals(estUno.getMaterias(), estDos.getMaterias());
//sin implementar equals en Materia
//estDos.getMaterias().add(0, new Materia("Cálculo",9));
//assertIterableEquals(estUno.getMaterias(), estDos.getMaterias());
//implementado equals
//estDos.getMaterias().add(0, new Materia("Cálculo",9));
//assertIterableEquals(estUno.getMaterias(), estDos.getMaterias());
    }

    @Test
    public void testNueve() {
        assertTimeout(java.time.Duration.ofSeconds(2), ()->{
            Thread.sleep(1000);
        });
    }






}