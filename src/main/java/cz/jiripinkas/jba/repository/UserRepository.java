package cz.jiripinkas.jba.repository;

import cz.jiripinkas.jba.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);


}
