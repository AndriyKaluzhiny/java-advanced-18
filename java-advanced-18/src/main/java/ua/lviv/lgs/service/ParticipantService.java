package ua.lviv.lgs.service;

import org.springframework.stereotype.Service;
import ua.lviv.lgs.domain.Participant;
import ua.lviv.lgs.repository.ParticipantRepository;

import javax.servlet.http.Part;
import java.util.List;

@Service
public interface ParticipantService {

    Participant create(Participant participant);
    List<Participant> readAll();
    Participant update(Participant participant);
    void deleteById(Integer id);
    Participant findById(Integer id);
}
