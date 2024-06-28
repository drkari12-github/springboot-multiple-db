package merveozer.multipledb.primary.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "age_average")
@AllArgsConstructor
@NoArgsConstructor
public class AgeAverage {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "age_avg")
    private int ageAverage;
}
