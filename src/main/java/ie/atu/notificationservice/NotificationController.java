package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/notification")
    public String sendNotification(@RequestBody UserDetails userDetails){
        return String.format("Received User details for %s with email %s",
                userDetails.getName(), userDetails.getEmail());
    }
}