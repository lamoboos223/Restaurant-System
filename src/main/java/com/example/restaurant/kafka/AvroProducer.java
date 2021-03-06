package com.example.restaurant.kafka;


import com.example.restaurant.avro.schema.OrderAvro;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
@Slf4j
public class AvroProducer {


    @Value("${avro.topic.name}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, OrderAvro> kafkaTemplate;

    public void publish(OrderAvro orderAvro){

        ListenableFuture<SendResult<String, OrderAvro>> future = kafkaTemplate.send(topic, orderAvro);

        future.addCallback(new ListenableFutureCallback<SendResult<String, OrderAvro>>() {
            @Override
            public void onFailure(Throwable ex) {
                log.warn(String.format("Failed publishing Message %s to topic %s", orderAvro, topic));
                log.error(ex.getMessage());
            }

            @Override
            public void onSuccess(SendResult<String, OrderAvro> result) {
                log.info(String.format("Produced Message -> %s to topic %s", orderAvro, topic));
            }
        });
    }
}
