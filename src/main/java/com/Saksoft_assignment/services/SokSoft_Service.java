package com.Saksoft_assignment.services;

import java.util.List;

import com.Saksoft_assignment.entities.SokSoftEmployee;
import com.Saksoft_assignment.impl.SendMessage;

public interface SokSoft_Service {

	SokSoftEmployee createSokSoftEmployee(SokSoftEmployee sse);

	SokSoftEmployee getSingleSokSoftEmployee(int id);

	List<SokSoftEmployee> getAllSokSoftEmployee();

	SokSoftEmployee updateSokSoftEmployee(SokSoftEmployee sse, int id);

	SendMessage deleteSokSoftEmployee(int id);

}
