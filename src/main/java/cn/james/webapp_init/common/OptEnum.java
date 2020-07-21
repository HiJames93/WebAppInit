package cn.james.webapp_init.common;

/**
 * @ClassName: OptEnum
 * @Desciption:
 * @author: James
 * @date: 2020-07-05 下午5:32
 * @version: 1.0
 */
public enum OptEnum {
    //在枚举中，通过调用有参构造，定义枚举实例
    SAVE((byte)0),UPDATE((byte)1),DELETE((byte)2);

    /**
     * 在枚举中定义一个属性
     */
    private byte optType;
    /**
     * @Title: OptEnum.java
     * @Description: 定义一个有参的枚举构造器
     * 枚举类中，构造器前不能写任何的访问修饰符，默认就是private的
     * @param: @param optType
     */
    OptEnum(byte optType){
        this.optType = optType;
    }

    public byte getOptType() {
        return this.optType;
    }
}
