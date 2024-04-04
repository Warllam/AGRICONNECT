package ag.agriconnectCapteur.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Capteur {
    @Id
    private Long id;

    private float longitude;

    private float latitude;

    private double temperature;

    private int humidite;

    private int intervalle;

}
