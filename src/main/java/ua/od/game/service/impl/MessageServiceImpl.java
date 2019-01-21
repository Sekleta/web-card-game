package ua.od.game.service.impl;

import ua.od.game.dto.MessageDto;
import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.MessageDao;
import ua.od.game.service.MessageService;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

public class MessageServiceImpl implements MessageService {

    @Inject
    public MessageDao messageDao;

    @Override
    public List<MessageDto> getMessageList(Integer fromAccountId, Integer toAccountId, Date fromTime) {
        return null;
    }

    @Override
    public Boolean sendMessage(MessageDto message) {
        return messageDao.sendMessage(new MessageEntity() {{
            setText(message.getText());
            setFromAccountId(message.getFromAccountId());
            setToAccountId(message.getToAccountId());
            setTime(message.getTime());
        }});
    }
}
