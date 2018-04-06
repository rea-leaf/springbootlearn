package com.chf.springbootredis;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.lang.Nullable;

import java.nio.charset.Charset;

/**
 * ${DESCRIPTION} 自定义序列化
 *
 * @author 温柔一刀
 * @create 2018-04-05 18:35
 **/
public class JsonRedisSerializer implements RedisSerializer<Object>{
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private static final byte[] EMPTY_ARRAY = new byte[0];



    public JsonRedisSerializer() {

    }


    @Nullable
    @Override
    public byte[] serialize(@Nullable Object o) throws SerializationException {
        if(o==null){
            return EMPTY_ARRAY;
        }else{
            String jsonString =JSON.toJSONString(o);
            return  JSON.toJSONBytes(o);
        }
    }

    @Nullable
    @Override
    public Object deserialize(@Nullable byte[] bytes) throws SerializationException {

        // TODO Auto-generated method stub
        String objectStr = null;
        Object object = null;
        if (bytes == null) {
            return object;
        }
        try {
            objectStr = new String(bytes,DEFAULT_CHARSET);
            object=   JSON.parseObject(objectStr);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return object;
    }
}
