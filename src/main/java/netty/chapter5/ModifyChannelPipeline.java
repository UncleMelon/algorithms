package netty.chapter5;


import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelPipeline;

import static netty.chapter5.DummyChannelPipeline.DUMMY_INSTANCE;

public class ModifyChannelPipeline {

    private static final ChannelPipeline CHANNEL_PIPELINE_FROM_SOMEWHERE = DUMMY_INSTANCE;

    public static void modifyPipeline(){
        ChannelPipeline pipeline = CHANNEL_PIPELINE_FROM_SOMEWHERE;
        //创建第一个handler实例
        FirstHandler firstHandler = new FirstHandler();
        //将firstHandler作为"handler1"加入到pipeline中
        pipeline.addLast("handler1", firstHandler);
        //将一个SecondHandler作为"handler2"加入到pipeline中的第一个槽中
        pipeline.addFirst("handler2", new SecondHandler());
        pipeline.addLast("handler3", new ThirdHandler());
        //...
        //通过名称移除
        pipeline.remove("handler3");
        //通过引用移除
        pipeline.remove(firstHandler);
        pipeline.replace("handler2", "handler4", new FourthHandler());
    }

    private static class FirstHandler extends ChannelHandlerAdapter {
    }

    private static class SecondHandler extends ChannelHandlerAdapter {
    }

    private static class ThirdHandler extends ChannelHandlerAdapter {
    }

    private static class FourthHandler extends ChannelHandlerAdapter {
    }
}

