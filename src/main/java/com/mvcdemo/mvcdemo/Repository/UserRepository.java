package com.mvcdemo.mvcdemo.Repository;

import com.mvcdemo.mvcdemo.Modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
