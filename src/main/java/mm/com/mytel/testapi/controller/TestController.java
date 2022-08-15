package mm.com.mytel.testapi.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import mm.com.mytel.testapi.ReaderLog;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@CrossOrigin
@Slf4j
public class TestController {

    @PostMapping("/test")
    public String test(@RequestBody ReaderLog readerLog) {
        log.info(readerLog.toString());
        return readerLog.toString();
    }

    @GetMapping("/thread")
    public String thread(){
        return String.valueOf(Thread.activeCount());
    }


}
