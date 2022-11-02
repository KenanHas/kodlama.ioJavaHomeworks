package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.ioDevs.business.abstracts.LanguagesService;
import kodlama.ioDevs.entities.concretes.Languages;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguagesService languagesService;

	public LanguagesController(LanguagesService languagesService) {
		this.languagesService = languagesService;
	}
	@GetMapping("/getall")
	public List<Languages> getAll(){
		return languagesService.getAll();
	}

}
