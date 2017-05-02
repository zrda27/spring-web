package com.zrd.study.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;

import com.zrd.study.boot.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Transactional
	public User getByName(String name);
	@RestResource(path="findByNameLike",rel="findByNameLike")
	//http://localhost:8080/spring-web/users/search/findByNameLike?name=zrd
	public User findByNameLike(@Param("name")String name);
	
	public User findByNameStartingWith(String name);
	
	@Query("select u from tbuser u where id=:id and name=:name")
	User withIdAndNameQuery(@Param("id")Integer id, @Param("name")String name);
}
