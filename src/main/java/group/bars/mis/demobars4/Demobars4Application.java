package group.bars.mis.demobars4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class Demobars4Application {


    public static void main(String[] args) {
        SpringApplication.run(Demobars4Application.class, args);

    }

}
