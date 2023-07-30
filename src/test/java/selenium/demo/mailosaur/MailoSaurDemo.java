package selenium.demo.mailosaur;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import ui.driversFactory.MainDriver;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class MailoSaurDemo {



    @Test
    public void testExample() throws IOException, MailosaurException {
        // Available in the API tab of a server
        String apiKey = "3ZPF6pAH7xaCSfTSp6vffegyw85V3ZPC";
        String serverId = "zsp7nua4";
        String serverDomain = "bean-voice@zsp7nua4.mailosaur.net";

        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams params = new MessageSearchParams();
        params.withServer(serverId);

        SearchCriteria criteria = new SearchCriteria();
        criteria.withSubject("Test1");

        Message message = mailosaur.messages().get(params, criteria);

        assertNotNull(message);
        assertEquals("Test1", message.subject());
        System.out.println(message.text().body());
        String fullText = message.text().body();
        String confirmationNumber = extractDigits(fullText);
        System.out.println(confirmationNumber);
        String nambaFoodUrl = message.html().links().get(0).href();
        MainDriver.getDriver().get(nambaFoodUrl);
    }


    public static String extractDigits(String text){
        StringBuilder digits = new StringBuilder();
        for (int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if (Character.isDigit(ch)){
                digits.append(ch);
            }
        }
        return digits.toString();
    }
}
