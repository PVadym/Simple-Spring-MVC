package ua.avadamedia.forostina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.avadamedia.forostina.entity.user.User;

import java.util.Optional;

/**
 * Repository for users
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByPhone(String phone);
}
