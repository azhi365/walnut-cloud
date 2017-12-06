package com.innstack.walnut.kafka.controller;

import com.innstack.walnut.common.model.RestResult;
import com.innstack.walnut.common.model.RestResultBuilder;
import com.innstack.walnut.common.web.controller.BaseController;
import com.innstack.walnut.data.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/demo")
public class KafkaController extends BaseController {

    @Autowired
    KafkaProducer kafkaProducer;

    @PostMapping("/kafka/{topic}")
    public RestResult kafkaProduce(@PathVariable("topic") String topic, @RequestBody String msg) {
        logger.debug("kafkaProduce---> :{}", kafkaProducer);
        logger.debug("getDemo topic:{}, msg:{}", topic, msg);
        kafkaProducer.send(topic, msg);
        return RestResultBuilder.builder().success().build();
    }
}
