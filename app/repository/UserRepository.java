package repository;

import java.util.List;

import model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

	@Override
	public <S extends User> S save(S entity);
	
	@Override
	public List<User> findAll();
	
}