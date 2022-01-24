package ua.avadamedia.forostina.service.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.avadamedia.forostina.entity.employee.Position;
import ua.avadamedia.forostina.repository.employee.PositionRepository;

import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private final PositionRepository positionRepository;
    @Override
    public Set<Position> getAllPositions() {
        return positionRepository.findAllByActiveTrueOrderByName();
    }

    @Override
    public void deactivatePosition(Long positionId) {
        positionRepository.findById(positionId).ifPresent(position -> {
            position.setActive(false);
            positionRepository.save(position);
        });
    }


}
