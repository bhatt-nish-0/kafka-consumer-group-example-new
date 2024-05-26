package consumer.eg3.consumer_eg_3.listen;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics= "test-topic-26-may",groupId = "119")
    public void consume(String x) {
        System.out.println(x + "aaa");
    }
}
