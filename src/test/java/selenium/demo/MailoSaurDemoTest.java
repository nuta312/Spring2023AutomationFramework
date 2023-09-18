package selenium.demo;

import com.digitalnomads.selenium.ui.drivers.Driver;
import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class MailoSaurDemoTest extends BaseTest{

        @Test public void testExample() throws IOException, MailosaurException {
            // Available in the API tab of a server
            String apiKey = "If4qCGFXp9rXgbThz4WOxRiHAmLSsg3G";
            String serverId = "zyuvsoyy";
            String serverDomain = "zyuvsoyy.mailosaur.net";

            MailosaurClient mailosaur = new MailosaurClient(apiKey);

            MessageSearchParams searchParams = new MessageSearchParams();
            searchParams.withServer(serverId);

            SearchCriteria criteria = new SearchCriteria();
            criteria.withSubject("Registration Instagram");

            Message message = mailosaur.messages().get(searchParams, criteria);

            assertNotNull(message);
            assertEquals("Registration Instagram", message.subject());
            System.out.println(message.subject());
            System.out.println(message.received());
            System.out.println(message.text().body());

            String confirmationCodeText = message.text().body();
            String code = extractDigits(confirmationCodeText);

            String nambaFoodURL = message.html().links().get(0).href();
            Driver.getDriver().get(nambaFoodURL);

        }
    public static String extractDigits(String text) {
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        return digits.toString();
    }
    }

