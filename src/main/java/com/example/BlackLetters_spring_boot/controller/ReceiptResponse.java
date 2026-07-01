package com.example.BlackLetters_spring_boot.controller;

import com.example.BlackLetters_spring_boot.domain.OcrStatus;
import com.example.BlackLetters_spring_boot.domain.Receipt;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ReceiptResponse {

    private final Long receiptId;
    private final Long categoryId;
    private final String categoryName;
    private final String merchantName;
    private final LocalDateTime transactionDate;
    private final Integer totalAmount;
    private final String imageUrl;   // presigned URL (imagePath 아님)
    private final OcrStatus ocrStatus;
    private final String rawOcrText;
    private final LocalDateTime createdAt;

    public ReceiptResponse(Receipt receipt, String imageUrl) {
        this.receiptId = receipt.getReceiptId();
        this.categoryId = receipt.getCategory() != null ? receipt.getCategory().getCategoryId() : null;
        this.categoryName = receipt.getCategory() != null ? receipt.getCategory().getName() : null;
        this.merchantName = receipt.getMerchantName();
        this.transactionDate = receipt.getTransactionDate();
        this.totalAmount = receipt.getTotalAmount();
        this.imageUrl = imageUrl;
        this.ocrStatus = receipt.getOcrStatus();
        this.rawOcrText = receipt.getRawOcrText();
        this.createdAt = receipt.getCreatedAt();
    }
}
