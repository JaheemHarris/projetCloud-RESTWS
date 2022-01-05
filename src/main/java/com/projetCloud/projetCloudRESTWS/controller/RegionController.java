package com.projetCloud.projetCloudRESTWS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetCloud.projetCloudRESTWS.model.Region;
import com.projetCloud.projetCloudRESTWS.service.RegionService;

@RestController
public class RegionController {
	
	@Autowired
	private RegionService regionService;
	
	@GetMapping("/regions")
	public List<Region> getRegions(){
		return regionService.getRegions();
	}
	
	@GetMapping("/regions/{id}")
	public Region getRegion(@PathVariable("id") final Long id) {
		Optional<Region> optRegion = regionService.getRegion(id);
		Region region = null;
		if(optRegion.isPresent())
			region = optRegion.get();
		return region;
	}
	
	@PostMapping("/regions")
	public Region saveRegion(@RequestBody Region region) {
		Region savedRegion = regionService.saveRegion(region);
		return savedRegion;
	}
	
	@DeleteMapping("/regions/{id}")
	public void deleteRegion(@PathVariable("id") final Long id) {
		regionService.deleteRegion(id);
	}
	
	@PutMapping("/regions/{id}")
	public Region updateRegion(@PathVariable("id") final Long id,@RequestBody Region region) {
		Region updatedRegion = regionService.updateRegion(id, region);
		return updatedRegion;
	}
}
