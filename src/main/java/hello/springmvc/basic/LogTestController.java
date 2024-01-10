package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // REST 방식 -> 바로 스트링 반환하도록 (원래는 뷰리졸버를 반환해야했음)
public class LogTestController {

    // private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.trace("trace log={}", name);
        log.debug("debug log={}", name); // 개발환경에선 두개 안나옴

        log.info(" info log={}", name); // 로그 찍기
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
