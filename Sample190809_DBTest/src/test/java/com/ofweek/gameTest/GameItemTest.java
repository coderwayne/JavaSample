package com.ofweek.gameTest;

import com.ofweek.dao.GameItemDao;
import com.ofweek.daoImpl.GameItemDaoImpl;
import com.ofweek.model.GameItem;
import org.junit.Test;

import java.util.List;

public class GameItemTest {

    @Test
    public void getGameList() throws Exception {
        GameItemDao gameItemDao = new GameItemDaoImpl();
        List<GameItem> gameList = gameItemDao.getGameList();

        for (GameItem item : gameList) {
            System.out.println(item.getGameName());
        }
    }
}
