package ua.vitaliikrupko.cityinfotelegrambot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.vitaliikrupko.cityinfotelegrambot.dao.CityDAO;

@SpringBootApplication
public class CityInfoTelegramBotApplication{
    @Autowired
    CityDAO cityDAO;
    public static void main(String[] args) {
        SpringApplication.run(CityInfoTelegramBotApplication.class, args);
    }
}
