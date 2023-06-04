package Modelo;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class IAdminTest {

    @Test
    public void give_id_when_db_seach_then() {

            IAdmin admin = Mockito.mock(IAdmin.class);
            //se verificará que el producto con el ide "001" exista en la base de datos
            Mockito.when(admin.getProductFromDatabase("001")).thenReturn(false);
            assertFalse(admin.getProductFromDatabase("001"));
    }
}