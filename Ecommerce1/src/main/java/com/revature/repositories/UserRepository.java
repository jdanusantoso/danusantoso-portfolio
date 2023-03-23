package com.revature.repositories;


import com.revature.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    @Query(value = "SELECT u from ecommerce.Users u WHERE u.user_id =:user_id, u.first_name, u.last_name, u.email=:email And u.password =:password", nativeQuery = true)
    List<Users> findAll (Users u);

    Users getByUsername(String username);

    Users getByPassword(String password);

    //@Query(value = "SELECT u from ecommerce.Users u WHERE u.username = :username AND u.password = :password ", nativeQuery = true)
    Optional<Users> getByUsernameAndPassword(String username, String password);


    public Optional<Users> getByEmailAndPassword(String email, String password);

}