package com.fns.reporting.service.domain;

import com.fns.reporting.service.domain.dto.message.WarehouseRequest;
//import com.fns.reporting.service.domain.event.OrderPaidEvent;
import com.fns.reporting.service.domain.port.input.message.listener.warehouse.WarehouseRequestMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

//import static com.fns.reporting.service.domain.entity.rep.FAILURE_MESSAGE_DELIMITER;

@Validated
@Service
@Slf4j
public class WarehouseRequestMessageListenerImpl implements WarehouseRequestMessageListener {
//    private final OrderPaymentSaga orderPaymentSaga;

//    public PaymentResponseMessageListenerImpl(OrderPaymentSaga orderPaymentSaga) {
//        this.orderPaymentSaga = orderPaymentSaga;
//    }

    @Override
    public void warehouseRequest(WarehouseRequest warehouseRequest) {
//        OrderPaidEvent domainEvent = orderPaymentSaga.process(paymentResponse);
//        log.info("Publishing OrderPaidEvent for order id: {}", paymentResponse.getOrderId());
//        domainEvent.fire();
    }

}
