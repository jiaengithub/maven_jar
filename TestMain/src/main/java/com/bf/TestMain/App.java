package com.bf.TestMain;

import com.alibaba.fastjson.JSON;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(JSON.toJSONString("Hello World!"));
    }
}
