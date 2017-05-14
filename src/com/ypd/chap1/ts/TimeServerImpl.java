package com.ypd.chap1.ts;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ypd.chap1.ts.TimeServer")
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	public long getTimeAsElapsed() {
		return new Date().getTime();
	}
}
