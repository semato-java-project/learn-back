package semato.semato_learn.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import semato.semato_learn.model.User;

import java.util.Optional;

@Repository
public interface UserBaseRepository<T extends User> extends JpaRepository<T, Long> {

    Optional<T> findByEmail(String email);

}
