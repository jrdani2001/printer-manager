package huso.printer_manager.controller;

import huso.printer_manager.model.Counter;
import huso.printer_manager.model.Printer;
import huso.printer_manager.service.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PrinterController {
    @Autowired
    private PrinterService printerService;

    @GetMapping("/printer/{ip}")
    public Printer getPrinterByIP(@PathVariable String ip) {
        return printerService.getPrinterByIP(ip);
    }

    @PostMapping("/counter")
    public void saveCounter(@RequestBody Counter counter) {
        printerService.saveCounter(counter);
    }
}
