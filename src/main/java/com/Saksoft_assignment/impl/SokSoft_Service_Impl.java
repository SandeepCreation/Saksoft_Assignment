package com.Saksoft_assignment.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Saksoft_assignment.entities.SokSoftEmployee;
import com.Saksoft_assignment.repositories.SokSoft_Repository;
import com.Saksoft_assignment.services.SokSoft_Service;

@Service
public class SokSoft_Service_Impl implements SokSoft_Service {

	@Autowired
	private SokSoft_Repository soksoftRepo;

	@Override
	public SokSoftEmployee createSokSoftEmployee(SokSoftEmployee sse) {
		return this.soksoftRepo.save(sse);
	}

	@Override
	public SokSoftEmployee getSingleSokSoftEmployee(int id) {
		return this.soksoftRepo.findById(id).get();
	}

	@Override
	public List<SokSoftEmployee> getAllSokSoftEmployee() {
		return this.soksoftRepo.findAll();
	}

	@Override
	public SokSoftEmployee updateSokSoftEmployee(SokSoftEmployee sse, int id) {
		sse.setId(id);
		return this.soksoftRepo.save(sse);
	}

	@Override
	public SendMessage deleteSokSoftEmployee(int id) {
		this.soksoftRepo.deleteById(id);
		SendMessage sm = new SendMessage();
		sm.setId(id);
		sm.setMsg("Deleted the Contain ");
		return sm;

	}

}
