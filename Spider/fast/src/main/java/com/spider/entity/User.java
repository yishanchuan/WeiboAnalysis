package com.spider.entity;

import java.util.List;
import java.util.Map;

class User {

    private String nickname; //昵称
    private String introduction; //介绍
    private Integer fansNum;  //粉丝数
    private Integer StarNum;  //关注数
    private Integer weiboNum; //已发微博数
    private Map<String, String> fans; //记录粉丝的名称和url地址
    private List<Weibo> weibos; //已发微博的内容
}