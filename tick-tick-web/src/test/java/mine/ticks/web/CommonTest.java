package mine.ticks.web;

import mine.ticks.web.base.BaseTest;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * User: chengcheng.liu
 * Date: 16/11/22
 */
public class CommonTest extends BaseTest {
    @Test
    public void getTestInfo() throws Exception {
        MvcResult response = mockMvc.perform(get("/gossip/myname")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();

        String result = response.getResponse().getContentAsString();
        System.out.println("result:" + result);
    }
}
