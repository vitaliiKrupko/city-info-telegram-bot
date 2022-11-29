package ua.vitaliikrupko.cityinfotelegrambot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "city")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public City(String name){
        this.name = name;
    }

    public City() {

    }
}
