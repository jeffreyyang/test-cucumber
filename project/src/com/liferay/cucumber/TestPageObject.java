package com.liferay.cucumber;

public class TestPageObject {
	
	public TestPageObject() {
		_i = 0;
	}

    public void cuckes(int i) throws Throwable {
        System.out.println(i);
    }
    
    private int _i;

}
