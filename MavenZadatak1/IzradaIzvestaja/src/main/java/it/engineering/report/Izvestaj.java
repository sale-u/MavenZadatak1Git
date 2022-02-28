package it.engineering.report;

import java.util.ArrayList;
import java.util.List;

public class Izvestaj {

	private List<String> logs = new ArrayList<>();
	
	public void addLog(String log) {
		logs.add(log);
	}
	
	public void listLogs() {
		System.out.println("======================= LOGS ==========================");
		for (String s : logs) {
			System.out.println(s);
		}
	}
	
}
