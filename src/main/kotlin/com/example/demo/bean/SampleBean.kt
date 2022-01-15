package com.example.demo.bean

class SampleBean {
    public var name: String = "testName";
    public var age: String = "testAge";
    public var address: String = "testAddress";

    fun getSample(sample: SampleBean): SampleBean {
        var bean = SampleBean();

        bean.name = sample.name;

        return bean;
    }

    fun Int.sum(num:Int): Int{
        return this + num;
    }

}

