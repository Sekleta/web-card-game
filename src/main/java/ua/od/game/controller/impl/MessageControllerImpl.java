package ua.od.game.controller.impl;

import ua.od.game.controller.MessageController;
import ua.od.game.dto.MessageDto;
import ua.od.game.service.MessageService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.List;

@Path("/message")
public class MessageControllerImpl implements MessageController {

    @Inject
    public MessageService messageService;

    @Override
    public List<MessageDto> getMessageList(Integer fromAccountId, Integer toAccountId, Date fromTime) {
        return null;
    }

    @POST
    @Path("/account/message/send")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response sendMessage(MessageDto message) {
        return null;
    }
}
