package ua.od.game.repository.dao.impl;

import org.junit.Before;
import org.junit.Test;
import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.DbTest;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author Andrey Kolodiy, Sekleta
 */

public class MessageDaoImplTest extends DbTest {
    MessageDaoImpl messageDao;

    Date date = new Date(2019,11,12,00,53);

    @Before
    public void init() {
        messageDao = new MessageDaoImpl();
    }

    @Test
    public void getMessageList() {
    }

    @Test
    public void sendMessage() {
        MessageEntity message = new MessageEntity() {{
            setText("testMessage");
            setFromAccountId(111);
            setToAccountId(222);
            setTime(date);
        }};

        Boolean result = messageDao.sendMessage(message);
        System.out.println(result);
        assertTrue(result);
    }
}