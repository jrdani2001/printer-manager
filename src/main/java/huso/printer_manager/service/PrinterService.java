package huso.printer_manager.service;

import huso.printer_manager.model.Counter;
import huso.printer_manager.model.Printer;
import huso.printer_manager.repository.CounterRepository;
import huso.printer_manager.repository.PrinterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrinterService {
    @Autowired
    private PrinterRepository printerRepository;

    @Autowired
    private CounterRepository counterRepository;

    public Printer getPrinterByIP(String ip) {
        return printerRepository.findByIP(ip).orElseThrow(() -> new RuntimeException("Printer not found"));
    }

    public void saveCounter(Counter counter) {
        counterRepository.save(counter);
    }
}
