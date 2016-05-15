package com.suhas.hf.dp.strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		FlyBehavior fb = model.getFlyBehavior();
		model.performFly();
	}

}
