# Spring basics
Basic assignments for Spring Boot introduction week.

## Day 1
### Task 1 – PathVariable
* Create an endpoint that accepts a name via the URL.
* Return a message that greets the user with that name.
* Test in the browser with different names in the URL.

### Task 2 – RequestParam
* Create an endpoint that accepts two numbers as parameters.
* Calculate the product of the numbers and return the result.
* Add a default value for one of the parameters if it is not submitted.

### Task 3 – POST with JSON
* Create an endpoint that accepts an object in JSON format via a POST request.
Return a message that contains the information from the object.
* Test sending different JSON data in Postman.

### Task 4 – List in memory
* Create an endpoint that accepts objects and saves them in a list in memory.
* Create another endpoint that returns the entire list.
* Test by adding multiple objects and retrieving them all.

### Task 5 – Retrieve objects by ID
* Create an endpoint that accepts an ID as part of the URL.
* Have the endpoint search the list for the object with that ID.
* Return the object if it exists, otherwise an error message (e.g., “The object does not exist”).
* Test by adding multiple objects and then retrieving a specific one by ID.

## Day 2
### Make a calculator
#### Purpose
Practice:
* Create multiple endpoints in Spring Boot
* Use `@RequestParam` to receive values ​​from the URL
* Do simple logic in methods
* (Optionally) use `ResponseEntity` for error handling

#### Instructions
1. Create a new controller named **`CalculatorController`**.
2. Create four endpoints that perform basic calculations:
3. Handle errors for division (if `b = 0`, return `"Error: Cannot divide by 0!"`).
4. Test all endpoints in the browser or Postman.

#### Extra tasks
**Create an endpoint** `/calc/all`
Example: `/calc/all?a=8&b=4` → returns JSON:
```json
{
    "add": 12,
    "sub": 4,
    "mul": 32,
    "div": 2
}
```

#### Additional
Use the configuration file (application.properties)

Add: `calc.factor=2`

Multiply each result by this factor before returning the answer.