package com.yunqi.asyncall.client;

import com.yunqi.asyncall.MethodMessage;
import com.yunqi.asyncall.ReturnMessage;

public interface QueueProvider {

	/**
	 * methodBroker:接口调用队列的key
	 */
	public void push(String methodBroker, MethodMessage mm);

	/**
	 * returnValueBroker：异步调用后，返回值监听的队列的key
	 */
	public ReturnMessage pop(String returnValueBroker, int timeout);

}
