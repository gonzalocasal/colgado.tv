package com.colgado.controller;

import org.springframework.ui.Model;

import static com.colgado.utils.Constants.DEFAULT_VIEW;

public interface ColgadoController {
	void addCommonAttributes(Model model);
	void addMediaAttributes(Model model, String title, String template, String schedule);
	default String getDefaultView() {
		return DEFAULT_VIEW;
	}
}
