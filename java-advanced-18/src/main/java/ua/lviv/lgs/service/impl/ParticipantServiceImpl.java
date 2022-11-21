package ua.lviv.lgs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.lviv.lgs.domain.Participant;
import ua.lviv.lgs.repository.ParticipantRepository;
import ua.lviv.lgs.service.ParticipantService;

import java.util.List;

@Component
public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    private ParticipantRepository participantRepository;

    @Override
    public Participant create(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public List<Participant> readAll() {
        return participantRepository.findAll();
    }

    @Override
    public Participant update(Participant participant) {
        return participantRepository.save(participant);
    }

    @Override
    public void deleteById(Integer id) {
        participantRepository.deleteById(id);
    }

    @Override
    public Participant findById(Integer id) {
        return participantRepository.getReferenceById(id);
    }
}
