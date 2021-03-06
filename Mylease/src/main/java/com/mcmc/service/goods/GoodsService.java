package com.mcmc.service.goods;

import com.mcmc.common.entity.Goods;
import com.mcmc.dao.goods.GoodsDao;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunlei on 2017/10/26.
 * 商品Service层
 */
@Service
public class GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    /**
     * 查询所有==租赁商品
     * @return
     */

    public List<Goods> sellectAllLeaseGoods(){
        List<Goods> list = goodsDao.selectAllLeaseGoods();
        return list;
    }
    public List<Goods> sellectAllGoods(){
        List<Goods> list = goodsDao.selectAllGoods();
        return list;
    }
    public List<Goods> selectGoodsByUserId(String userId){
        List<Goods> list=goodsDao.selectGoodsByUserId(userId);
        return list;
    }
}
