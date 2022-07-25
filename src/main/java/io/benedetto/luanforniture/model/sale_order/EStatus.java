package io.benedetto.luanforniture.model.sale_order;

public enum EStatus {
    CREATED,
    PENDING,
    HALF_PAID,
    REVIEW_PENDING,
    REVIEW_REJECTED,
    REVIEW_APPROVED,
    PAID,
    UNPAID,
    CANCELED,
    CONFIRMED,
    DELIVERED
}