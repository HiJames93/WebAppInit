package cn.james.webapp_init.common;

/**
 * @ClassName: SysDevInfoEnum
 * @Desciption:
 * @author: James
 * @date: 2020-07-07 下午8:47
 * @version: 1.0
 */
public enum SysDevInfoEnum {
    SUCCESS((byte)0),FAILURE((byte)1),ERROR((byte)2);

    private byte sysDevInfoType;

    SysDevInfoEnum(byte sysDevInfoType){
        this.sysDevInfoType = sysDevInfoType;
    }

    public byte getSysDevInfoType() {
        return this.sysDevInfoType;
    }
}
