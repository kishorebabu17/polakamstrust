package com.polakams.polakamstrust.services;

import java.util.List;



import com.polakams.polakamstrust.model.Orphan_Prevention;


public interface IOrphanPreventionServices {
	
	public Orphan_Prevention createPreventionIdeas(Orphan_Prevention orphanPrevention);
	public List<Orphan_Prevention> getAllPreventionIdeas(int status);
	

}
