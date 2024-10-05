package huso.printer_manager.repository;

import huso.printer_manager.model.Printer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PrinterRepository extends JpaRepository<Printer, Long> {
    Optional<Printer> findByIP(String ip);
}