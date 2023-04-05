package com.yeonoo.masterdata.item.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.yeonoo.masterdata.item.domain.BomItem;

public interface BomRepository {

	public List<BomItem> getItemList(int company_code) throws DataAccessException;

	public List<BomItem> getBomTree(String ppitem_cd) throws DataAccessException;

	public BomItem selectItem(String ppitem_cd) throws DataAccessException;

	public List<BomItem> getItemListByName(String item_name) throws DataAccessException;

	public void updateTree(String ppitem_cd, BomItem bomItem) throws DataAccessException;

	public void insertTree(String ppitem_cd, BomItem bomItem) throws DataAccessException;
}
