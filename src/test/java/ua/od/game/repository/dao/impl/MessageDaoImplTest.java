package ua.od.game.repository.dao.impl;

import org.junit.Before;
import org.junit.Test;
import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.DbTest;

import static org.junit.Assert.*;

/**
 * @author Andrey Kolodiy
 */

public class MessageDaoImplTest extends DbTest {
    MessageDaoImpl messageDao;

    @Before
    public void init() {
        messageDao = new MessageDaoImpl();
    }

    @Test
    public void getMessageList() {
    }

    @Test
    public void testSendMessage() {
        Boolean message = messageDao.sendMessage(new MessageEntity());
        System.out.println(message);
        assertFalse(false);
    }
}