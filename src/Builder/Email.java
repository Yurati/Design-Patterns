package Builder;

import java.util.List;

public class Email {
    private String text;
    private String name;
    private String surname;
    private String attachment;
    private List<String> carbonCopy;

   public static class EmailBuilder implements Builder<Email> {
        private String text;
        private String name;
        private String surname;
        private String attachment;
        private List<String> carbonCopy;

        public EmailBuilder withText(String text){
            this.text = text;
            return this;
        }

        public EmailBuilder withName(String name){
            this.name = name;
            return this;
        }

        public EmailBuilder withSurname(String surname){
            this.surname = surname;
            return this;
        }

        public EmailBuilder withAttachment(String attachment){
            this.attachment = attachment;
            return this;
        }

        public EmailBuilder withCarbonCopy(List<String> carbonCopy){
            this.carbonCopy = carbonCopy;
            return this;
        }

        public Email build(){
            Email email = new Email();
            email.text = text;
            email.name = name;
            email.attachment = attachment;
            email.surname = surname;
            email.carbonCopy = carbonCopy;
            return  email;
        }
    }

    public static EmailBuilder builder(){
        return new EmailBuilder();
    }

    private Email(){};
}
