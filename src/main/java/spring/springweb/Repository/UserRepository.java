package spring.springweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springweb.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
