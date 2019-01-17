package ua.od.game.controller.impl;

import ua.od.game.controller.MessageController;
import ua.od.game.dto.MessageDto;

import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.List;

public class MessageControllerImpl implements MessageController {

    @Override
    public List<MessageDto> getMessageList(Integer fromAccountId, Integer toAccountId, Date fromTime) {
        return null;
    }

    @Override
    public Response sendMessage(MessageDto message) {
        return null;
    }
}
