package com.whalefall.learncases.valid.customvalid;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * @author chenglong
 * @Description
 * @create 2022-05-22 21:44
 */
@SpringBootTest
@AutoConfigureMockMvc
public class Tester {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCustomValid() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.post("/addValidatePhone").
                accept(MediaType.TEXT_HTML).
                param("phone", "123456789")).
                andExpect(status().isOk()).
                andDo(print());
    }


}
