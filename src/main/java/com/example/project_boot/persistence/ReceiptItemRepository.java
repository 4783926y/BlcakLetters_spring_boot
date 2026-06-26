package com.example.project_boot.persistence;

import com.example.project_boot.domain.ReceiptItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReceiptItemRepository extends JpaRepository<ReceiptItem, Long> {
    List<ReceiptItem> findByReceiptReceiptId(Long receiptId);
}
