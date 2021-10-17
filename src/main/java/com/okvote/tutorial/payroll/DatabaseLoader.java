package com.okvote.tutorial.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

  private final EmployeeRepository repository;

  @Autowired
  public DatabaseLoader(EmployeeRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(String... args) throws Exception {
    this.repository.save(new Employee("JeongWon", "Been", "job seeker"));
    this.repository.save(new Employee("JiWon", "Kang", "intern"));
  }
}
