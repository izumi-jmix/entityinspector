## FetchPlan bug at Entity inspector 

### Used software:
* Jmix v. 1.4.1
* Jmix Plugin v. 1.4.0
* Java v. 17

### Steps to reproduce:
1) Open the Entity Inspector
2) Create at least 2 "Company" entities
3) Try to create "Contract" entity. When you will pick up a company in lookup - FetchPlanException will be caused. 
Sample:

![FetchPlanException sample](/docs/FetchPlanException%20sample.png)
