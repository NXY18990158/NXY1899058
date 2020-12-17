package com.example.endwork.bean;

import com.example.endwork.R;

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
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;

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
            "魅族17", "荣耀30 Pro+", "小米10至尊纪念版", "三星 Galaxy S20", "iPhone 12 Pro Max", "HUAWEI Mate 40 Pro",
            "HUAWEI P40 Pro+","一加8 pro "
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "魅族17 8GB+128GB 十七度灰 骁龙865 旗舰5G手机 30W快充 6400W后置主摄 90Hz屏幕 支持NFC 智能拍照游戏手机",
            "荣耀30 Pro+ 50倍远摄 麒麟990 5G 5000万超感光摄影 3200W美颜自拍 游戏手机 全网通版8GB+256GB 钛空银",
            "小米10 至尊纪念版 双模5G 骁龙865 120HZ高刷新率 120倍长焦镜头 120W快充 8GB+128GB 陶瓷黑 游戏手机",
            "三星 Galaxy S20 FE 5G(SM-G7810)双模5G 骁龙865 120Hz屏幕刷新率 多彩雾面质感 游戏手机 8GB+128GB 异想蓝",
            "2020新款 苹果 Apple iPhone12 Pro Max 6.7英寸 128G 海蓝色 移动联通电信5G全网通手机",
            "华为 HUAWEI Mate 40 Pro麒麟9000 SoC芯片 超感知徕卡电影影像 有线无线双超级快充8GB+256GB夏日胡杨（必购）",
            "华为 HUAWEI P40 Pro+ 麒麟990 5G SoC芯片 5000万超感知徕卡五摄 100倍双目变焦 8GB+256GB陶瓷黑全网通5G",
            "一加8 pro 5G 游戏手机【8T可选】 【一加8T】青域 8GB 128GB",

    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {3699,4999,5299,4599,11899,6999,8888,5599};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.m1, R.drawable.m2, R.drawable.m3,R.drawable.m4,
            R.drawable.m5, R.drawable.m6, R.drawable.m7,R.drawable.m8
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.m1b, R.drawable.m2b, R.drawable.m3b,R.drawable.m4b,
            R.drawable.m5b, R.drawable.m6b, R.drawable.m7b,R.drawable.m8b
    };

    public GoodsInfo(int pic_id, String title, String desc) {
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;

    }

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
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"天猫新品", "聚划算", "饿了吗", "农场",
            "天猫超市", "充值中心", "淘鲜达", "淘金币", "拍卖", "分类"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}