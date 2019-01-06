package ua.od.game.repository.dao.impl;

import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.MessageDao;
import ua.od.game.repository.helper.SqlHelper;

import java.util.Date;
import java.util.List;

public class MessageDaoImpl implements MessageDao {

    @Override
    public List<MessageEntity> getMessageList(Integer fromAccountId, Integer toAccountId, Date fromTime) {
        return null;
    }

    @Override
    public Boolean sendMessage(MessageEntity message) {
//        boolean mssg = SqlHelper.prepareStatement("UPDATE Message = '' where message = ?", pstmt -> {
//            pstmt.setString(1, message);
//        }
        return null;
    }
}
