package com.agri.saga.command;

public record CompensateInventoryCommand(
    String orderId
) {}
