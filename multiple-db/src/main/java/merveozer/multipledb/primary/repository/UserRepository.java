package merveozer.multipledb.primary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import merveozer.multipledb.primary.model.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer>{
	
}
