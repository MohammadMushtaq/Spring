package com.xworkz.travel.transport;

public class TransportImpl implements Transport {

	private Transport transport;
	private String type;

	@Override
	public void transport() {
		System.out.println("invoked transport its done");

	}

	public void setTransport(Transport transport) {
		transport.transport();
		this.transport = transport;

	}

	public void setType(String type) {
		this.type = type;
		System.out.println("transport type " + type);
	}

}
