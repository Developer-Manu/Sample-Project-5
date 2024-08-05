package Practice.Sample_Project_5.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Service;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="Players")
public class Players {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "age")
    private int age;

    @Column(name = "description")
    private String description;

    @Column(name = "gender")
    private String gender;

    @Column(name = "name")
    private String name;



}
