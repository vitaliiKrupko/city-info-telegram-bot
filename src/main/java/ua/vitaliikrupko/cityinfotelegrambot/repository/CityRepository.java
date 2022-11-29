package ua.vitaliikrupko.cityinfotelegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.vitaliikrupko.cityinfotelegrambot.model.City;
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    boolean existsCityByName(String name);
}
