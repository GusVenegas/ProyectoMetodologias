package servicio;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;


@RunWith(MockitoJUnitRunner.class)
public class IClienteServiceTest {

    @Test
    public void give_cedula_when_validate_incorrect_then() {
        IValidacionService iValidacionService = Mockito.mock(IValidacionService.class);
        Mockito.when(iValidacionService.validarCedula("ssss")).thenReturn(false);
        assertEquals(false, iValidacionService.validarCedula("sss"));
    }


}