package tn.esprit.spring.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Publication;
import tn.esprit.spring.repositories.PublicationRepository;
@Service
public class PublicationServiceImpl implements IServicePublication{
	@Autowired
	private PublicationRepository postRepository;
	

	

	@Override
	public Publication addPublication(Publication p) {
		// TODO Auto-generated method stub
		return postRepository.save(p) ;
	}

	

	
	

	
	}

	//@Override
	/*public Publication getPublicationById(int idPublication) {
		// TODO Auto-generated method stub
		Publication p = postRepository.findById(id).get();
		int countViews =0;
		
		if(p == null) return null;
		
		p.setViews(p.getViews()+1);
		//
		countViews = postRepository.updateViewCountPost(p.getViews() -1, id);
		countViews++;
		
		return p;
	}*/

