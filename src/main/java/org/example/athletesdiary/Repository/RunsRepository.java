package org.example.athletesdiary.Repository;


import org.example.athletesdiary.Model.Runs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunsRepository extends JpaRepository<Runs, Integer> {

}
