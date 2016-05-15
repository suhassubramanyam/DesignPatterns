package com.suhas.hf.dp.strategy;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard Duck");
	}
}
