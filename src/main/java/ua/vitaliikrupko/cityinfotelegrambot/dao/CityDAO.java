package ua.vitaliikrupko.cityinfotelegrambot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.vitaliikrupko.cityinfotelegrambot.model.City;
import ua.vitaliikrupko.cityinfotelegrambot.repository.CityRepository;

@Service
public class CityDAO{
    @Autowired
    private CityRepository cityRepo;

    public boolean existCityByName(String nameCity){
        return cityRepo.existsCityByName(nameCity);
    }

    public void createNewCity(City newCity){
       cityRepo.save(newCity);
    }
}
