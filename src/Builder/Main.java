package Builder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Email email = Email.builder()
                .withAttachment("Attachment")
                .withName("Hello")
                .withSurname("There")
                .withText("general Kenobi")
                .withCarbonCopy(Arrays.asList("Aaaa", "NNNN"))
                .build();

        System.out.println(email);
    }
}
