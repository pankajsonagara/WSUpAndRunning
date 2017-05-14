package com.ypd.chap1.ts;

public class Player {

	private String name;
	private String nickName;
	
	public Player(String name, String nickName) {
		setName(name);
		setNickName(nickName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
