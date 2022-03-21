package com.qa.mentalhealth.repo;

import com.qa.mentalhealth.domain.Illnesses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;


@Repository
public interface IllnessesRepo extends JpaRepository<Illnesses, Long> {
}
