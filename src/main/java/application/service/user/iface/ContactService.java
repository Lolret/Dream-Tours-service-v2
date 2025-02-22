package application.service.user.iface;

import application.domain.Contact;

import java.util.List;

public interface ContactService {
    boolean add(Contact contact);

    List<Contact> getAllByUserId(Long userId);

    boolean updateById(Contact contact);

    boolean deleteById(Long id);
}