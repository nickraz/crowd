package razilov.crowd;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;

@SpringBootApplication
public class CrowdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrowdApplication.class, args);

        Emp emp = new Emp();
    }

}

