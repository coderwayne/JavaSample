package com.ofweek.daoImpl;

import com.ofweek.dao.GameItemDao;
import com.ofweek.model.GameItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class GameItemDaoImpl implements GameItemDao {

    public List<GameItem> getGameList() throws Exception {
        List<GameItem> gameList = new ArrayList<GameItem>();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://192.168.2.123:3306/live_mobile","exhibition","ofweek_2015");

            pst = conn.prepareCall("select * from Game");

            rs = pst.executeQuery();


            while (rs.next()) {
                GameItem gameItem = new GameItem();
                gameItem.setGameID(rs.getInt("GameID"));
                gameItem.setGameName(rs.getString("Name"));
                gameList.add(gameItem);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            rs.close();
            pst.close();
            conn.close();
        }

        return gameList;
    }
}
