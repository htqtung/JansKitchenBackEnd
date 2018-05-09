package fi.haagahelia.JansKitchenBackEnd.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource	
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
	
}
