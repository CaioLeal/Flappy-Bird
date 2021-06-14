package com.gcstudios.world;

import com.gcstudios.entities.Entity;
import com.gcstudios.entities.Tube;
import com.gcstudios.main.Game;

public class TubeGenerator {
	public int time = 0;
	public int targetTime = 60;
	
	public void tick() {
		time++;
		if(time == 60) {
			//New Tube
			int height1 = Entity.rand.nextInt(70-30) + 30;
			Tube tube1 = new Tube(Game.WIDTH,0,20,height1,1,null);

			int height2 = Entity.rand.nextInt(70-30) + 30;
			Tube tube2 = new Tube(Game.WIDTH,Game.HEIGHT - height2,20,height2,1,null);
			
			Game.entities.add(tube1);
			Game.entities.add(tube2);
			time = 0;
		}
	}

}
