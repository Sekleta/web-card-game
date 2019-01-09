package ua.od.game.repository.dao.impl;

import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.MessageDao;
import ua.od.game.repository.helper.SqlHelper;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


public class MessageDaoImpl implements MessageDao {

    Logger LOG = Logger.getLogger(UserDaoImpl .class.getName());

    @Override
    public List<MessageEntity> getMessageList(Integer fromAccountId, Integer toAccountId, Date fromTime) {
        return null;
    }

    @Override
    public Boolean sendMessage(MessageEntity message) {
      boolean messageList = SqlHelper.prepareStatement("INSERT INTO Message (text, fromAccountId, toAccountId, time)" +
              " values (?,?,?,?)", pstmt -> {
          pstmt.setString(1, message.getText());
          pstmt.setInt(2, message.getFromAccountId());
          pstmt.setInt(3, message.getToAccountId());
          pstmt.setDate(4, message.getTime());

          return pstmt.executeUpdate() > 0 ? message.getText() : null;
      });
        if(!messageList) {
            LOG.warning("This token is wrong!!!!");
        }
        return messageList;

    }
}
