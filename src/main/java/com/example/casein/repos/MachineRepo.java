package com.example.casein.repos;

import com.example.casein.domain.Machine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MachineRepo extends CrudRepository<Machine, Integer> {
/*List<Machine> findByOn_offEquals(Boolean on_off,true);*/
}
