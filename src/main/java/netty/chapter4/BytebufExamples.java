package netty.chapter4;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.ByteBuffer;

/**
 * Created by Administrator on 2018/5/30.
 */
public class BytebufExamples {

    private static ByteBuf BYTE_BUFFER_FROM_SOMEWHERE = Unpooled.buffer(1024);


    public static void  heapBuffer() {
        ByteBuf heapBuffer = BYTE_BUFFER_FROM_SOMEWHERE;
        //检查ByteBuf是否有一个支撑数组
        if (heapBuffer.hasArray()) {
            //获取该数组的引用
            byte[] array = heapBuffer.array();
            //计算第一个字节的偏移量
            int offset = heapBuffer.arrayOffset() + heapBuffer.readerIndex();
            //获取可读字节数
            int length = heapBuffer.readableBytes();
            handleArray(array, offset, length);
        }

    }

    public static void directBuffer() {
        ByteBuf directBuff = BYTE_BUFFER_FROM_SOMEWHERE;
        //检查ByteBuf是否有一个支撑数组
        if (!directBuff.hasArray()) {
            int length = directBuff.readableBytes();
            byte[] array = new byte[length];
            directBuff.getBytes(directBuff.readerIndex(), array);
            handleArray(array, 0, length);
        }
    }

    public static void byteBufferComposite(ByteBuffer header, ByteBuffer body) {
        ByteBuffer[] message = {header, body};
        ByteBuffer message2 = ByteBuffer.allocate(header.remaining() + body.remaining());
        message2.put(header);
        message2.put(body);
        message2.flip();
    }

    public static void byteBufComposite() {
        CompositeByteBuf messageBuf = Unpooled.compositeBuffer();
        ByteBuf header = BYTE_BUFFER_FROM_SOMEWHERE;
        ByteBuf body = BYTE_BUFFER_FROM_SOMEWHERE;
        messageBuf.addComponents(header, body);

        messageBuf.removeComponent(0);
        for (ByteBuf buf: messageBuf) {
            System.out.println(buf.toString());
        }
    }


    public static void byteBufCompositeArray() {
        CompositeByteBuf compBuf = Unpooled.compositeBuffer();
        int length = compBuf.readableBytes();
        byte[] array = new byte[length];
        compBuf.getBytes(compBuf.readerIndex(), compBuf);
        handleArray(array, 0, array.length);
    }

    private static void handleArray(byte[] array, int offset, int length) {
    }
}
