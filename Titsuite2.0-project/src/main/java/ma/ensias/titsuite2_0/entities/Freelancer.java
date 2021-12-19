package ma.ensias.titsuite2_0.entities;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "freelancer")
@Setter @Getter
public class Freelancer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String email;

  @Column(name = "hashed_password")
  private String hashedPassword;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "birth_date")
  private java.sql.Date birthDate;

  private String city;

  private String address;

  private String activity;

  @Column(name = "minimum_wage")
  private double minimumWage;

  @Column(name = "refresh_token")
  private String refreshToken;

  @Column(name = "verification_code")
  private String verificationCode;

  @Column(name = "is_active")
  private long isActive;

  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;

  @Column(name = "resend_timeout")
  private java.sql.Date resendTimeout;

}
