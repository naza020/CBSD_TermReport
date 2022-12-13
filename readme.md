# CBSD term report Covid Soap

Apache NetBeans 12
jdk 1.8
## lib
- javax.json-1.1.jar


## Database
sql.txt
```bash
CREATE TABLE COVID (
years INTEGER,
weeknum INTEGER,
new_case INTEGER,
total_case INTEGER,
new_case_excludeabroad INTEGER,
total_case_excludeabroad INTEGER,
new_recovered INTEGER,
total_recovered INTEGER,
new_death INTEGER,
total_death INTEGER,
case_foreign INTEGER,
case_prison INTEGER,
case_walkin INTEGER,
case_new_prev INTEGER,
case_new_diff INTEGER,
death_new_prev INTEGER,
death_new_diff INTEGER,
update_date DATE,
PRIMARY KEY (years, weeknum)
);
```