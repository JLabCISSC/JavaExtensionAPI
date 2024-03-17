package  com.metric.test.cputester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class CpuController {

    @GetMapping("/CPU")
    public int getRandomCpuLoad() {
        Random random = new Random();
        // Returns a random number between 20 and 35
        return 20 + random.nextInt(16);
    }
}