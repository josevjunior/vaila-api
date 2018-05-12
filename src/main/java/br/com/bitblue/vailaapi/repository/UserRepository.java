package br.com.bitblue.vailaapi.repository;

import br.com.bitblue.vailaapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String>{
    
    @Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password")
    public User login(@Param("email") String email, @Param("password") String password);
    
}
