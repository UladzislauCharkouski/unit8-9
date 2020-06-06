package com.epam.unit89.Task02;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time(int _hours, int _minutes, int _seconds) {
		setHours(_hours);
		setMinutes(_minutes);
		setSeconds(_seconds);
	}
	
	public Time() {
        this(0, 0, 0);
    }
	
	public Time(int _hours, int _minutes) {
		this(_hours, _minutes, 0);
	}
	
	public Time(int _hours) {
		this(_hours, 0, 0);
	}
	
	public int getHours() {
		  return hours;
	}
		 
	public int getMinutes() {
		  return minutes;
	}
		 
	public int getSeconds() {
		  return seconds;
	}
		 
	public void setHours(int _hours) {
		if (_hours < 0 || _hours > 23) {
			hours = 0;
		} else {
			hours = _hours;
		}
	}
	
	public void setMinutes(int _minutes) {
		if (_minutes < 0 || _minutes > 59) {
			minutes = 0;
		} else {
			minutes = _minutes;
		}
	}
	
	public void setSeconds(int _seconds) {
		if (_seconds < 0 || _seconds > 59) {
			seconds = 0;
		} else {
			seconds = _seconds;
		}
	}
	
	public void addSeconds(int _seconds) {
		if (seconds + _seconds <= 59) {
			seconds += _seconds;
		}
		if (seconds + _seconds > 59 && seconds + _seconds < 3600) {
			minutes += _seconds / 60;
			seconds = _seconds % 60;
		}
		if (seconds + _seconds >= 3600) {
			hours += _seconds / 3600;
			minutes += (_seconds % 3600)/60;
			seconds += ((_seconds % 3600)%60);
		}
	}
		
	public void addMinutes(int _minutes) {
		if (minutes + _minutes <= 59) {
			minutes += _minutes;
		}
		if (minutes + _minutes >= 60) {
			hours += _minutes / 60;
			minutes += _minutes % 60;
		}
	}
	
	public void addHours(int _hours) {
		if (hours + _hours <= 23) {
			hours += _hours;
		} else {
			hours = (hours + _hours) % 24;
		}
			
	}
	
	public void deductSeconds(int _seconds) {
		if (seconds - _seconds >= 0) {
			seconds -= _seconds;
		}
		if (seconds - _seconds < 0 && seconds - _seconds > -3600) {
			minutes -= _seconds / 60;
			seconds = _seconds % 60;
		}
		if (seconds - _seconds <= -3600) {
			hours -= _seconds / 3600;
			minutes -= (_seconds % 3600)/60;
			seconds -= ((_seconds % 3600)%60);
		}
	}
		
	public void deductMinutes(int _minutes) {
		if (minutes - _minutes >= 0) {
			minutes -= _minutes;
		}
		if (minutes - _minutes < 0) {
			hours -= _minutes / 60;
			minutes -= _minutes % 60;
		}
	}
	
	public void deductHours(int _hours) {
		if (hours - _hours >= 0) {
			hours -= _hours;
		} else {
			hours = 24 - Math.abs((hours - _hours) % 24);
		}
			
	}
}