package application.service.user;

import application.domain.Order;
import application.domain.Participant;
import application.repository.OrderRepository;
import application.repository.ParticipantRepository;
import application.service.user.iface.ParticipantService;
import application.utils.ServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    private ParticipantRepository participantRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public boolean add(Participant participant) {
        return ServiceHelper.save(participantRepository, participant);
    }

    @Override
    public Participant getById(Integer id) {
        return ServiceHelper.getById(participantRepository, id);
    }

    @Override
    public List<Participant> getAllByOrderId(Integer orderId) {
        Order order;
        return (order = ServiceHelper.getById(orderRepository, orderId)) != null ?
                new ArrayList<>(order.getParticipants()) :
                Collections.emptyList();
    }

    @Override
    public boolean updateById(Participant participant) {
        return ServiceHelper.save(participantRepository, participant);
    }

    @Override
    public boolean deleteById(Integer id) {
        return ServiceHelper.delete(participantRepository, id);
    }
}
