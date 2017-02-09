package com.wolf.shoot.net.message;

import com.wolf.shoot.common.exception.CodecException;

/**
 * Created by jiangwenping on 17/2/3.
 * 需要重新读取body
 */
public abstract  class NetProtoBufMessage extends  NetMessage{

    private NetProtoBufMessageBody netProtoBufMessageBody;

    public NetProtoBufMessage(){
        setNetMessageHead(new NetMessageHead());
        this.netProtoBufMessageBody = new NetProtoBufMessageBody();
    }

    public NetProtoBufMessageBody getNetProtoBufMessageBody() {
        return netProtoBufMessageBody;
    }

    public void setNetProtoBufMessageBody(NetProtoBufMessageBody netProtoBufMessageBody) {
        this.netProtoBufMessageBody = netProtoBufMessageBody;
    }

    //此方法需要
    public abstract void decoderNetProtoBufMessageBody() throws CodecException, Exception;

    public abstract void release() throws CodecException;

    public abstract  void encodeNetProtoBufMessageBody() throws CodecException, Exception;

    public void setCmd(int cmd){
        getNetMessageHead().setCmd((short)cmd);
    }
    public void setSerial(int serial){
        getNetMessageHead().setSerial(serial);
    }
}
