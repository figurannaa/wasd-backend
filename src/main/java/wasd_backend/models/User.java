package wasd_backend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import wasd_backend.Validators.MinYear.MinYear;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    @NotEmpty(message = "Username cannot be empty.")
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    @NotEmpty(message = "E-mail cannot be empty.")
    private String email;

    @Column(name = "displayname", length = 25)
    @Size(max = 50, message = "Displayed name cannot be longer than {max} characters.")
    private String displayname;

    @Column(name = "aboutme")
    @Size(max = 255, message = "About me cannot be longer than {max} characters.")
    private String aboutme;

    @Column(name = "birthdate", nullable = false)
    @NotNull(message = "Birthdate cannot be empty.")
    @MinYear(value = 1910, message = "Birth year cannot be over {value}.")
    @Past(message = "You have to be born to use this website.")
    private LocalDate birthdate;
}
