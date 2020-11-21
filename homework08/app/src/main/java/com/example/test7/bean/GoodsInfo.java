package com.example.test7.bean;

import com.example.test7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "华为p40", "iPhone 12", "小米10", "荣耀30", "华为Mate40 pro ", "OPPO Reno4 SE ","Redmi K30","三星GalaxyS20"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Huawei/华为 P40 5G新款手机官方旗舰店p40pro正品mate30pro5g直降P30/mate40",
            "苹果 iPhone XS Max国行XR 苹果12双卡xs 全网通8x手机",
            "新品Xiaomi/小米 小米10至尊纪念版官方pro旗舰手机5G尊享9正品版",
            "华为HONOR荣耀30系列5G全网通手机30正品华为官方旗舰店30pro新款直降30s官网",
            "Huawei/华为 Mate 40 pro 5G手机官方旗舰店正品mate40pro新品p40直降mate50保时捷M40",
            "OPPO Reno4 SE 5G拍照智能手机65W闪充官方旗舰店正品reno4se opporeno4se reno3",
            "Redmi K30至尊纪念版120Hz游戏智能5G手机小米官方旗舰店小米10红米k30S至尊版K30pro",
            "Samsung/三星GalaxyS20+ SM-G9860 国行骁龙旗舰5G手机三星官方旗舰三星s20+手机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {5699, 6999, 3020, 2003, 5006, 1009,3999,4999};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.hwp40, R.drawable.iphone12, R.drawable.xiaomi10,
            R.drawable.ry10, R.drawable.matep40 , R.drawable.oppo4,
            R.drawable.redmi, R.drawable.sanxing
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.hwp40, R.drawable.iphone12, R.drawable.xiaomi10,
            R.drawable.ry10, R.drawable.matep40, R.drawable.oppo4,
            R.drawable.redmi, R.drawable.sanxing

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
