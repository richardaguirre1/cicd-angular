package com.paymentchain.billing;

import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@RunWith(SpringRunner.class)
@SpringBootTess

#@ExtendWith(MockitoExtension.class)
public class BasicApplicationTests  {

    @Test
    public void contextLoads() {
       String message = "Default Message cambiado 2025";
        Assert.assertNotNull(message);
    }
}
