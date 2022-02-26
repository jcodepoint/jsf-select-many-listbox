package com.jcodepoint.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named("bean")
@RequestScoped
public class ExampleBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<SelectItem> rivers;
	private Map<String, String> lakes;
	
	private String[] selectedCountries;
	private String[] selectedRivers;	
	private String[] selectedLakes;	
	
	
	@PostConstruct
	public void init() {
		this.rivers = new ArrayList<SelectItem>();
		this.rivers.add(new SelectItem("parana", "Paraná"));
		this.rivers.add(new SelectItem("limay", "Limay"));
		this.rivers.add(new SelectItem("salado", "Salado"));
		this.rivers.add(new SelectItem("uruguay", "Uruguay"));
		
		this.lakes = new HashMap<String, String>();
		this.lakes.put("san-roque", "San Roque");
		this.lakes.put("argentino", "Argentino");
		this.lakes.put("nahuel-huapi", "Nahuel Huapi");
	}

	
	public List<SelectItem> getRivers() {
		return this.rivers;
	}

	public void setRivers(List<SelectItem> rivers) {
		this.rivers = rivers;
	}

	public Map<String, String> getLakes() {
		return lakes;
	}
	
	public void setLakes(Map<String, String> lakes) {
		this.lakes = lakes;
	}

	
	public String[] getSelectedCountries() {
		return selectedCountries;
	}

	public void setSelectedCountries(String[] selectedCountries) {
		this.selectedCountries = selectedCountries;
	}

	public String[] getSelectedRivers() {
		return selectedRivers;
	}

	public void setSelectedRivers(String[] selectedRivers) {
		this.selectedRivers = selectedRivers;
	}

	public String[] getSelectedLakes() {
		return selectedLakes;
	}

	public void setSelectedLakes(String[] selectedLakes) {
		this.selectedLakes = selectedLakes;
	}


	public String getSelectedCountriesString() {
		return Arrays.toString(this.getSelectedCountries());
	}

	public String getSelectedRiversString() {
		return Arrays.toString(this.getSelectedRivers());
	}
	
	public String getSelectedLakesString() {
		return Arrays.toString(this.getSelectedLakes());
	}
	
	
	public String aceptar() {
		System.out.println("");
		System.out.println("-> Selected Countries:");
		System.out.println("");
		
		if (this.selectedCountries != null) {
			if (this.selectedCountries.length > 0) {
				for (int i = 0; i < this.selectedCountries.length; i++) {
					System.out.println("-> selectedCountries[" + i + "]: " + this.selectedCountries[i]);
				}
			}
		}

		System.out.println("");
		System.out.println("-> Checked Rivers:");
		System.out.println("");
		
		if (this.selectedRivers != null) {
			if (this.selectedRivers.length > 0) {
				for (int i = 0; i < this.selectedRivers.length; i++) {
					System.out.println("-> selectedRivers[" + i + "]: " + this.selectedRivers[i]);
				}
			}
		}

		System.out.println("");
		System.out.println("-> Checked Lakes:");
		System.out.println("");
		
		if (this.selectedLakes != null) {
			if (this.selectedLakes.length > 0) {
				for (int i = 0; i < this.selectedLakes.length; i++) {
					System.out.println("-> selectedLakes[" + i + "]: " + this.selectedLakes[i]);
				}
			}
		}

		return "result";
	}
	
	public String volver() {
		return "inicio";
	}

}
