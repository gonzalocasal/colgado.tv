package com.colgado.controller;

import org.springframework.ui.Model;

public interface ControllerI {
	
	void addCommonAttributes(Model model);
	void addMediaAttributes(Model model, String title, String template, String schedule);

}
