package com.emp.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.model.EducationalGapModel;
import com.emp.model.EmpBasicDetailsModel;
import com.emp.model.EmpContactModel;
import com.emp.model.EmpEducationModel;
import com.emp.model.EmpIdentifierModel;
import com.emp.model.EmployeeModel;
import com.emp.model.WorkExperienceModel;
import com.emp.repositories.EmployeeRepository;
import com.emp.services.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService emp_services;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private Employee Emp;
	
	
	//POST OPERATION
	@PostMapping(value = "/employees")
	public String persistEmployee(@RequestBody @Valid EmployeeModel employeeModel) {

		return emp_services.saveEmployee(employeeModel);
	}

	
	@PostMapping(value = "/educational_gap")
	public String persistEducation(@RequestBody @Valid EducationalGapModel educationalGapModel) {

		return emp_services.saveEducationalGap(educationalGapModel);
	}
	
	
	@PostMapping(value = "/emp_basic_details")
	public String persistBasic(@RequestBody @Valid EmpBasicDetailsModel empBasicDetailsModel) {

		return emp_services.saveEmpBasicDetails(empBasicDetailsModel);
	}
	
	@PostMapping(value = "/emp_contact")
	public String persistContact(@RequestBody @Valid EmpContactModel empContactModel) {

		return emp_services.saveEmpContact(empContactModel);
	}
	
	
	@PostMapping(value = "/emp_education")
	public String persistEducation(@RequestBody @Valid EmpEducationModel empEducationModel) {

		return emp_services.saveEmpEducation(empEducationModel);
	}
	@PostMapping(value = "/emp_identifier")
	public String persistIdentifier(@RequestBody @Valid EmpIdentifierModel empIdentifierModel) {

		return emp_services.saveEmpIdentifier(empIdentifierModel);
	}
	
	@PostMapping(value = "/emp_work")
	public String persistExperience(@RequestBody @Valid WorkExperienceModel workExperienceModel) {

		return emp_services.saveWorkExperience(workExperienceModel);
	}
	
	//GET OPERATION
	
	@GetMapping("/employees1")
	public    List<com.emp.entity.Employee> findAll()
	{                                                                                                                                                                                                                                                                           
		return emp_services.findAll();
		
		
	}
	@GetMapping("/educational_gap1")
	public   <EducationalGap> List<EducationalGap> findAll1()
	{                                                                                                                                                                                                                                                                           
		return (List<EducationalGap>) emp_services.findAll();
		
		
	}
	@GetMapping("/emp_basic_details1")
	public   <EmpBasicDetails> List<EmpBasicDetails> findAll2()
	{                                                                                                                                                                                                                                                                           
		return (List<EmpBasicDetails>) emp_services.findAll();
		
		
	}
	
	@GetMapping("/emp_contact1")
	public   <EmpContact> List<EmpContact> findAll3()
	{                                                                                                                                                                                                                                                                           
		return (List<EmpContact>) emp_services.findAll();
		
		
	}
	@GetMapping("/emp_education1")
	public   <EmpEducation> List<EmpEducation> findAll4()
	{                                                                                                                                                                                                                                                                           
		return (List<EmpEducation>) emp_services.findAll();
		
		
	}
	@GetMapping("/emp_identifier1")
	public   <EmpIdentifier> List<EmpIdentifier> findAll5()
	{                                                                                                                                                                                                                                                                           
		return (List<EmpIdentifier>) emp_services.findAll();
		
		
	}
	@GetMapping("/emp_work1")
	public   <WorkExperience> List<WorkExperience> findAll6()
	{                                                                                                                                                                                                                                                                           
		return (List<WorkExperience>) emp_services.findAll();
		
		
	}
	
	@RequestMapping(value ="/employee",method = RequestMethod.GET)
	public Iterable <Emp> getAllEmp()
	{
	Iterable<Emp>empCollection = employeeRepository.findAll();
	return empCollection;
	}
	
	
	@RequestMapping(value ="/employee",method = RequestMethod.POST)
	public Emp addEmp(@RequestParam(value ="emp_first_name")String emp_first_name,
			@RequestParam(value ="emp_middle_name")String emp_middle_name ,
			@RequestParam(value ="emp_last_name")String emp_last_name ,
			@RequestParam(value ="emp_blood_group")String emp_blood_group,
			@RequestParam(value ="emp_gender")String emp_gender,
			@RequestParam(value ="age")int age,
			@RequestParam(value ="emp_dob")Date emp_dob,
			@RequestParam(value ="emp_join_date")Date emp_join_date)
	{
		Emp newEmp = new Emp(emp_first_name,emp_middle_name,emp_last_name,emp_blood_group,emp_gender,age,emp_dob,emp_join_date);
		employeeRepository.save(newEmp);
		return newEmp;
		
	}
	
	
	@RequestMapping(value ="/employee",method = RequestMethod.DELETE)
     public Emp deleteEmp(@RequestParam(value = "id")Long id)	
     {
		Emp empToDelete = new Emp();
		Optional<Emp>optionalEmp = employeeRepository.findById(id);
		if(optionalEmp.isPresent())
		{
			empToDelete = optionalEmp.get();
			employeeRepository.deleteById(empToDelete.getId());
		}
		return empToDelete;
     }
	
}
