package com.fns.reporting.service.domain.port.input.message.listener.warehouse;

import com.fns.reporting.service.domain.dto.message.WarehouseRequest;


public interface WarehouseRequestMessageListener {
    void warehouseRequest(WarehouseRequest warehouseResponse);

}
