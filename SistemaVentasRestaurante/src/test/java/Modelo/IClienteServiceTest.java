package Modelo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import servicio.IValidacionService;

import static junit.framework.TestCase.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class IClienteServiceTest {

    @Test
    public void give_cedula_when_validate_incorrect_then() {
        IValidacionService iValidacionService = Mockito.mock(IValidacionService.class);
        Mockito.when(iValidacionService.validarCedula("ssss")).thenReturn(false);
        assertEquals(false, iValidacionService.validarCedula("sss"));
    }

    @Test
    public void give_name_when_validate_incorrect_then() {
        IValidacionService iValidacionService = Mockito.mock(IValidacionService.class);
        Mockito.when(iValidacionService.validarNombre("123")).thenReturn(false);
        assertEquals(false, iValidacionService.validarNombre("123"));
    }


}