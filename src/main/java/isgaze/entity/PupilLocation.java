package isgaze.entity;

import javax.persistence.*;
import lombok.Data;
@Entity
@Table(name = "pupil_location")
@Data
public class PupilLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    Double locationX;
    Double locationY;
    Long timeStamp;

}
