package in.sujal.coinmatrix.repository;


import in.sujal.coinmatrix.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
