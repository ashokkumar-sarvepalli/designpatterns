package learning.command.googlehome;

import java.util.HashMap;
import java.util.Map;

public class GoogleRemote {

	Map<Integer, Command> commandMap = new HashMap<Integer, Command>();
	Map<Integer, Command> undoMap = new HashMap<Integer, Command>();

	int slot;

	public GoogleRemote() {

	}

	public void addSlot(int slot, Command command, Command undoCommand) {

		commandMap.put(slot, command);
		undoMap.put(slot, undoCommand);
	}

	public void pressButton(int slot) {
		if (commandMap.get(slot) != null) {
			commandMap.get(slot).execute();

			this.slot = slot;
		}
	}

	public void undoButton(int slot) {
		if (undoMap.get(slot) != null)
			undoMap.get(slot).execute();
	}

	public void undo() {
		if (undoMap.get(slot) != null) {
			undoMap.get(slot).execute();

		}
	}

	public void removeSlot(int slot) {
		commandMap.remove(slot);
		undoMap.remove(slot);
	}

}
