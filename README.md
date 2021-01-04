# DrugDispatchSystem

Dispatch the drug to patients given their age and weight. 

## Requirements

* Java 8
* Log4j 1.2.17
* Junit 4.10

## Start the system

Clone the repo, then put the `app-1.0-SNAPSHOT-jar-with-dependencies.jar` from `target `directory and `log.properties` to the same level of a directory. Before start the system, create a `log` directory at the same level 

```shell
mkdir log
```

Then run the code below to start the system. 

```shell
java -cp app-1.0-SNAPSHOT-jar-with-dependencies.jar -Dlog4j.configuration=file"log.properties" App
```

## Input format

Input the patient's name, age(years) and weight(kilogram) in order via keyborad separate by a whitespace. For example 

```html
richard 25 65
```

If the input format is wrong, the system will let you input again. 

To exit the system, press enter without anything input. 

All the patients' infomation will be recorded in the `log` directory in the `log.out` file, including the valid input. 



