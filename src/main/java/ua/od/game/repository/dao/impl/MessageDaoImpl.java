<<<<<<< HEAD
=======

>>>>>>> ec350be74a77872a13d9b2aaedea7c845166f66b
package ua.od.game.repository.dao.impl;

import ua.od.game.model.MessageEntity;
import ua.od.game.repository.dao.MessageDao;
import ua.od.game.repository.helper.SqlHelper;

<<<<<<< HEAD
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


public class MessageDaoImpl implements MessageDao {

    Logger LOG = Logger.getLogger(UserDaoImpl .class.getName());

    @Override
    public List<MessageEntity> getMessageList(Integer fromAccountId, Integer toAccountId, Date fromTime) {
        return null;
=======
import java.sql.ResultSet;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import java.util.logging.Logger;

public class MessageDaoImpl implements MessageDao {
    private static Logger LOG = Logger.getLogger(MessageDaoImpl.class.getName());
    private static final String GET_MESSAGES = "SELECT * FROM Message WHERE from_account_id = ? AND to_account_id = ? AND time > ?";
    private static final String ADD_NEW_MESSAGE = "INSERT INTO Message (text, from_account_id, to_account_id, time) values (?,?,?,?)";
  
    @Override
    public List<MessageEntity> getMessageList(Integer fromAccountId, Integer toAccountId, Date fromTime) {
        return SqlHelper.prepareStatement(GET_MESSAGES, pstmt -> {
            pstmt.setInt(1, fromAccountId);
            pstmt.setInt(2, toAccountId);
            pstmt.setDate(3, new java.sql.Date(fromTime.getTime()));
            ResultSet rs = pstmt.executeQuery();
            List<MessageEntity> message = new LinkedList<>();
            while (rs.next()) {
                message.add(new MessageEntity() {{
                    setFromAccountId(rs.getInt("from_account_id"));
                    setToAccountId(rs.getInt("to_account_id"));
                    setTime(rs.getDate("time"));
                    setText(rs.getString("text"));
                }});
            }
            return message;
        });
>>>>>>> ec350be74a77872a13d9b2aaedea7c845166f66b
    }

    @Override
    public Boolean sendMessage(MessageEntity message) {
<<<<<<< HEAD
      boolean isOk = SqlHelper.prepareStatement("INSERT INTO Message (text, fromAccountId, toAccountId, time)" +
              " values (?,?,?,?)", pstmt -> {
          pstmt.setString(1, message.getText());
          pstmt.setInt(2, message.getFromAccountId());
          pstmt.setInt(3, message.getToAccountId());
          pstmt.setDate(4, message.getTime());

          return pstmt.executeUpdate() > 0;
      });
=======
        Boolean isOk = SqlHelper.prepareStatement(ADD_NEW_MESSAGE, pstmt -> {
            pstmt.setString(1, message.getText());
            pstmt.setInt(2, message.getFromAccountId());
            pstmt.setInt(3, message.getToAccountId());
            pstmt.setDate(4, new java.sql.Date(message.getTime().getTime()));
            return pstmt.executeUpdate() > 0;
        });
>>>>>>> ec350be74a77872a13d9b2aaedea7c845166f66b
        if(!isOk) {
            LOG.warning("Message was not delivered!");
        }
        return isOk;
<<<<<<< HEAD

=======
>>>>>>> ec350be74a77872a13d9b2aaedea7c845166f66b
    }
}
