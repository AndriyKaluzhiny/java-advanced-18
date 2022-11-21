package ua.lviv.lgs.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.lgs.domain.Participant;

import java.util.Optional;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Integer>, CrudRepository<Participant, Integer> {
    @Override
    Participant getReferenceById(Integer id);


}
