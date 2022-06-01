package tv.colgado.controller;

import org.springframework.ui.Model;

import static tv.colgado.utils.Constants.VIEW_DEFAULT;

public interface ColgadoController {
	void addCommonAttributes(Model model);
	default String getDefaultView() {
		return VIEW_DEFAULT;
	}
}
