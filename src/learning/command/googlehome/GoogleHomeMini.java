package learning.command.googlehome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import learning.command.googlehome.newsfeed.BBC;
import learning.command.googlehome.newsfeed.CNN;
import learning.command.googlehome.newsfeed.NDTV;
import learning.command.googlehome.newsfeed.NewsPaper;
import learning.command.googlehome.sensors.AirConditioner;
import learning.command.googlehome.sensors.Fan;
import learning.command.googlehome.sensors.Coffe;
import learning.command.googlehome.sensors.Light;

public class GoogleHomeMini {
	
	
	public static void main(String []args) {
		
		Light light = new Light();
		Fan fan = new Fan();
		Coffe coffee = new Coffe();
		AirConditioner ac = new AirConditioner();
		
		
		List<NewsPaper> newsPaperList= new ArrayList<NewsPaper>();
		newsPaperList.add(new BBC());
		newsPaperList.add(new CNN());
		newsPaperList.add(new NDTV());
		
		
		
		
		
		Command ashokWakeUpRoutine = () -> { light.on(); fan.off(); ac.off(); coffee.on();};
		Command newsPaperSubscribe = () -> { newsPaperList.forEach(s->s.readNews());};
		Command enterHome = () -> {light.on(); fan.on(); ac.on();};
		
		
		
		//undo commands as needed
		Command enterHomeUndo = () -> {light.off(); fan.off(); ac.off();};
		Command noCommand = () -> {};
		
		Command ashokWakeUpRoutineUndo = () -> { light.off(); fan.on(); ac.on(); coffee.off();};
		
		
		GoogleRemote googleRemote = new GoogleRemote();
		googleRemote.addSlot(1, ashokWakeUpRoutine,ashokWakeUpRoutineUndo);
		googleRemote.addSlot(2, newsPaperSubscribe,noCommand);
		googleRemote.addSlot(3, enterHome,enterHomeUndo);
		
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. AshokwakeupRoutine 2.NewsPaperSubscribe 3.EnterHome 4.Undo 5.Exit");
			choice = sc.nextInt();
			
			if(choice==4) {
				googleRemote.undo();
			}
			else {
			googleRemote.pressButton(choice);
			}
			
			
			
			
		}while(choice!=5);
		
		
	}
	
	

}
