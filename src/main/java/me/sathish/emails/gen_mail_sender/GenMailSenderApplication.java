package me.sathish.emails.gen_mail_sender;

import lombok.AllArgsConstructor;
import me.sathish.emails.gen_mail_sender.email.GenEmailServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class GenMailSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenMailSenderApplication.class, args);
    }

}

@Component
@AllArgsConstructor
class SendEmail implements CommandLineRunner {
    private final GenEmailServiceImpl emailService;

    @Override
    public void run(String... args) throws Exception {
        //emailService.sendSimpleMessage("sathishk.dot@gmail.com", "test mail", "test content");
        emailService.sendHtmlMessage("sathishk.dot@gmail.com", "test mail", "test content");
    }
}
