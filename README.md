# Course Guide API
This project utilizes Java and SpringBoot to create a REST API, making HTTP requests to a database of courses for a high school.

## Controller
Accesses SpringBoot web and JPA dependencies to handle `GET`, `POST`, `PUT`, and `DELETE` requests. Manages addition, update, and deletion of Departments in the Course Guide (i.e. English, Math, Science, etc.) as well as addition, update, and deletion of Courses within departments (i.e. English 3, Algebra 1, Physics, etc.). 

## Model
The Java model defines many Courses for different Departments. See JSON Examples for each model below. 

### Department 
```
{
    "name": "string",
    "requirements": int,
    "description": "string",
    "id": "string"
}
```

### Course
```
{
        "name": "string",
        "description": "string",
        "department": {
            "name": "string",
            "requirements": int,
            "description": "string",
            "id": "string"
        },
        "id": "string"
    }
```
