package com.ofweek.dao;

import com.ofweek.model.GameItem;

import java.util.List;

public interface GameItemDao {
    public List<GameItem> getGameList() throws Exception;
}
