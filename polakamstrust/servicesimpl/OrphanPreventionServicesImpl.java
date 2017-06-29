package com.polakams.polakamstrust.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polakams.polakamstrust.model.Orphan_Prevention;
import com.polakams.polakamstrust.repository.IOrphanPreventionRepository;
import com.polakams.polakamstrust.services.IOrphanPreventionServices;

@Service
public class OrphanPreventionServicesImpl implements IOrphanPreventionServices {
    
	@Autowired
	IOrphanPreventionRepository  iOrphanPreventionRepository; 
	
	@Override
	public Orphan_Prevention createPreventionIdeas(Orphan_Prevention orphanPrevention) {
		
		orphanPrevention.setStatus(0);
		iOrphanPreventionRepository.save(orphanPrevention);
		
		return orphanPrevention;
	}

	@Override
	public List<Orphan_Prevention> getAllPreventionIdeas(int status) {
		
		List<Orphan_Prevention> list=iOrphanPreventionRepository.getPreventionIdeasbyStatus(status);
		return list;
	}

}
