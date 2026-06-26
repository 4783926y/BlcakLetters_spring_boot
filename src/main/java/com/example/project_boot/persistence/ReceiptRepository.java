package com.example.project_boot.persistence;

import com.example.project_boot.domain.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
    List<Receipt> findByUserUserIdOrderByTransactionDateDesc(Long userId);
}
