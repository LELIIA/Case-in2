package com.example.casein.repos;

import com.example.casein.domain.Repair;
import com.example.casein.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepairRepo extends CrudRepository<Repair, Long> {

    /*List<Repair> findByUsername(User username);
*/
}
