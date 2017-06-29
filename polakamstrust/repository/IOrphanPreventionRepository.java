package com.polakams.polakamstrust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.polakams.polakamstrust.model.Orphan_Prevention;


public interface IOrphanPreventionRepository extends JpaRepository<Orphan_Prevention,String> {

	
	
	@Query("SELECT o FROM Orphan_Prevention o WHERE o.status = :status")
	public List<Orphan_Prevention> getPreventionIdeasbyStatus( @Param("status") int status);
}
