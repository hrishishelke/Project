package com.emp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.entity.EducationalGap;
import com.emp.entity.EmpBasicDetails;
import com.emp.entity.EmpContact;
import com.emp.entity.EmpEducation;
import com.emp.entity.EmpIdentifier;
import com.emp.entity.Employee;
import com.emp.entity.WorkExperience;
import com.emp.model.EducationalGapModel;
import com.emp.model.EmpBasicDetailsModel;
import com.emp.model.EmpContactModel;
import com.emp.model.EmpEducationModel;
import com.emp.model.EmpIdentifierModel;
import com.emp.model.EmployeeModel;
import com.emp.model.WorkExperienceModel;
import com.emp.repositories.EducationalGapRepository;
import com.emp.repositories.EmpBasicDetailsRepository;
import com.emp.repositories.EmpContactRepository;
import com.emp.repositories.EmpEducationRepository;
import com.emp.repositories.EmpIdentifierRepository;
import com.emp.repositories.EmployeeRepository;
import com.emp.repositories.WorkExperienceRepository;

@Service
public class EmpService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EducationalGapRepository educationalGapRepository;
	@Autowired
   private EmpBasicDetailsRepository empBasicDetailsRepository;
	
	@Autowired
	private EmpContactRepository empContactRepository;
	
	@Autowired
	private EmpIdentifierRepository empidentifierRepository;
	
	@Autowired
	private EmpEducationRepository  empEducationRepository;
	
	@Autowired
	private WorkExperienceRepository  workExperienceRepository;
	
	
	@Transactional
	public String saveEmployee(EmployeeModel employeeModel) {

		try {

			Employee employee = new Employee();
			BeanUtils.copyProperties(employee, employeeModel);

			employeeRepository.save(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Transactional
	public String saveEducationalGap(EducationalGapModel educationalGapModel) {

		try {
			EducationalGap educationalGap = new EducationalGap();
			BeanUtils.copyProperties(educationalGap, educationalGapModel);
			Employee employee = new Employee();
			employee.setId(educationalGapModel.getEmployeeId());
			educationalGap.setEmployee(employee);
			educationalGapRepository.save(educationalGap);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	@Transactional
	public String saveEmpBasicDetails(EmpBasicDetailsModel empBasicDetailsModel) {

		try {
			EmpBasicDetails empBasicDetails = new EmpBasicDetails();
			BeanUtils.copyProperties(empBasicDetails, empBasicDetailsModel);
			Employee employee = new Employee();
			employee.setId(EmpBasicDetailsModel.getEmployeeId());
			empBasicDetails.setEmployee(employee);
			empBasicDetailsRepository.save(empBasicDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	@Transactional
	public String saveEmpContact(EmpContactModel empContactModel) {

		try {
			EmpContact empContact = new EmpContact();
			BeanUtils.copyProperties(empContact, empContactModel);
			Optional<Employee> employee = employeeRepository.findById(empContactModel.getEmployeeId());
//			employee.setId(EmpContactModel.getEmployeeId());
			empContact.setEmployee(employee.get());
			empContactRepository.save(empContact);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	@Transactional
	public String saveEmpEducation(EmpEducationModel empEducationModel) {

		try {
			EmpEducation empEducation = new EmpEducation();
			BeanUtils.copyProperties(empEducation, empEducationModel);
			Employee employee = new Employee();
			employee.setId(EmpBasicDetailsModel.getEmployeeId());
			empEducation.setEmployee(employee);
			empEducationRepository.save(empEducation);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	@Transactional
	public String saveEmpIdentifier(EmpIdentifierModel empIdentifierModel) {

		try {
			EmpIdentifier empIdentifier = new EmpIdentifier();
			BeanUtils.copyProperties(empIdentifier, empIdentifierModel);
			Employee employee = new Employee();
			employee.setId(EmpBasicDetailsModel.getEmployeeId());
			empIdentifier.setEmployee(employee);
			empidentifierRepository.save(empIdentifier);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	@Transactional
	public String saveWorkExperience(WorkExperienceModel workExperienceModel) {

		try {
			WorkExperience workExperience = new WorkExperience();
			BeanUtils.copyProperties(workExperience, workExperienceModel);
			Employee employee = new Employee();
			employee.setId(EmpBasicDetailsModel.getEmployeeId());
			workExperience.setEmployee(employee);
			workExperienceRepository.save(workExperience);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Employee> findAll() {
		
		return employeeRepository.findAll();
	}
	public List<EducationalGap> findAll1() {
		
		return  educationalGapRepository.findAll();
	}
public List<EmpBasicDetails> findAll2() {
		
		return  empBasicDetailsRepository.findAll();
	}
public List<EmpContact> findAll3() {
	
	return  empContactRepository.findAll();
}
public List<EmpEducation> findAll4() {
	
	return  empEducationRepository.findAll();
}
public List<EmpIdentifier> findAll5() 
{
	return  empidentifierRepository.findAll();
}
	
public List<WorkExperience> findAll6() {
		
		return  workExperienceRepository.findAll();
	}
}

