package com.example.democrud.persistence.repository;

import com.example.democrud.persistence.entity.UserAtm;
import com.example.democrud.persistence.pojo.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAtmRepo extends JpaRepository<UserAtm, Long> {
//	@Query("SELECT new com.example.persistence.pojo.Account(ac.balance, ac.accountId, ac.maxWithdrawal) "
//		     + "FROM       Accounts       ac "
//		     + "INNER JOIN UserAtm     uat ON ac.userAtm.id       = uat.id "
//		     + "WHERE      ac.id = ?2 ")
//		public Account findAccountFromUser(@Param("id") long id,@Param("accountId") long accountId);
}
