interface Notifier {
    String name();

    void send(message m);
}

class SmsChannel implements Notifier {

    @Override
    public String name() {
        return "SMS";
    }

    @Override
    public void send(message m) {
        System.out.println(
                name() + " sent to " + m.to() + " message: " + m.text());
    }
}

class EmailChannel implements Notifier {

    @Override
    public String name() {
        return "Email";
    }

    @Override
    public void send(message m) {
        System.out.println(
                name() + " sent to " + m.to() + " message: " + m.text());
    }
}

class WhatsappChannel implements Notifier {

    @Override
    public String name() {
        return "WhatsApp";
    }

    @Override
    public void send(message m) {
        System.out.println(
                name() + " sent to " + m.to() + " message: " + m.text());
    }
}

public class message {

    private final String to;
    private final String text;

    // Constructor
    public message(String to, String text) {
        this.to = to;
        this.text = text;
    }

    public String to() {
        return to;
    }

    public String text() {
        return text;
    }

    public int length() {
        return text.length();
    }

    public static void main(String[] args) {

        message personal = new message(
                "9604719404",
                "hello world");

        Notifier sms = new SmsChannel();
        sms.send(personal);

        message corporate = new message(
                "snehalnarute@24gmail.com",
                "Hello world");

        Notifier email = new EmailChannel();
        email.send(corporate);

        message whatsappMessage = new message(
                "9604719404",
                "Hello from WhatsApp");

        Notifier whatsapp = new WhatsappChannel();
        whatsapp.send(whatsappMessage);
    }
}
