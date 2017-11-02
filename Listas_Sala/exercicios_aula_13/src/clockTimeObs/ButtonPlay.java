package clockTimeObs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPlay implements ActionListener {

	private Clock clock = new Clock();
	@Override
	public void actionPerformed(ActionEvent e) {
		if (!clock.timer.isRunning()){
			clock.restartClock();
		}
	
	}	
}