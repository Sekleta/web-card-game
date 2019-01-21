package ua.od.game.repository.dao.impl;

import org.junit.Before;
import org.junit.Test;
import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.DbTest;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Andrey Kolodiy, Sekleta
 */

public class MessageDaoImplTest extends DbTest {
    MessageDaoImpl messageDao;

    private static java.util.Date date = new java.util.Date();

    @Before
    public void init() {
        messageDao = new MessageDaoImpl();
    }

    @Test
    public void getMessageListTest() {
    }

    @Test
    public void sendMessageTest() {
        MessageEntity messageEntity = new MessageEntity() {{
            setText("testMessage");
            setFromAccountId(111);
            setToAccountId(222);
            setTime(date);
        }};

        List<MessageEntity> message = messageDao.getMessageList(111, 222, date);
        for (int i = 0; i < message.size(); i++) {
            if (message.get(i).equals(messageEntity.getText()))
            System.out.println(message.get(i));
    //        assertEquals(messageEntity.setText("testMessage"), );
        }
    }
}