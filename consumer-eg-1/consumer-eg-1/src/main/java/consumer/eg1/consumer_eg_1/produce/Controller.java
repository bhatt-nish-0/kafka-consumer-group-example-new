package consumer.eg1.consumer_eg_1.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Controller implements ApplicationRunner {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.kafkaTemplate.send("test-topic-26-may","tyyy");
    }
}
