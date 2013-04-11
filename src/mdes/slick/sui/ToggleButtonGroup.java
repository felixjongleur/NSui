package mdes.slick.sui;

import java.util.ArrayList;
import java.util.List;

public class ToggleButtonGroup {
	private List<ToggleButton> group = new ArrayList<ToggleButton>();
	
	public void addToGroup(ToggleButton button) {
        if (button instanceof ToggleButton) {
        	group.add(button);
        } else {            	
            throw new IllegalStateException("ToggleButtonGroup can only contain ToggleButtons.");
        }
	}
	
	public void toggleGroup(ToggleButton buttonToEnable) {
		for(ToggleButton button : group) {
			if(button == buttonToEnable) {
				button.setSelected(true);
			} else {
				button.setSelected(false);
			}
		}
	}
	
	public List<ToggleButton> getGroup() {
		return group;
	}
	
	public ToggleButton getSelectedButton() {
		for(ToggleButton button : group) {
			if(button.isSelected()) 
				return button;
		}
		return null;
	}
}
