package br.com.atom.springjwtoauth2.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.atom.springjwtoauth2.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{

}
