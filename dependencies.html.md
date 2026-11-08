---
date_published: 2026-11-08
date_modified: 2026-11-08
canonical_url: http://cardatechnologies.com/dependencies.html
---

# Project Dependencies

## test

The following is a list of test dependencies for this project. These dependencies are only required to compile and run unit tests for the application:

| GroupId | ArtifactId | Version | Type | Licenses |
| --- | --- | --- | --- | --- |
| org.junit.jupiter | [junit-jupiter-api](https://junit.org/) | 6.1.3 | jar | [Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
| org.junit.jupiter | [junit-jupiter-engine](https://junit.org/) | 6.1.3 | jar | [Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
| org.junit.jupiter | [junit-jupiter-params](https://junit.org/) | 6.1.3 | jar | [Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
| org.junit.platform | [junit-platform-suite](https://junit.org/) | 6.1.3 | jar | [Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |

# Project Transitive Dependencies

The following is a list of transitive dependencies for this project. Transitive dependencies are the dependencies of the project dependencies.

## test

The following is a list of test dependencies for this project. These dependencies are only required to compile and run unit tests for the application:

| GroupId | ArtifactId | Version | Type | Licenses |
| --- | --- | --- | --- | --- |
| org.apiguardian | [apiguardian-api](https://github.com/apiguardian-team/apiguardian) | 1.1.2 | jar | [The Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt) |
| org.jspecify | [jspecify](http://jspecify.org/) | 1.0.0 | jar | [The Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt) |
| org.junit.platform | [junit-platform-commons](https://junit.org/) | 6.1.3 | jar | [Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
| org.junit.platform | [junit-platform-engine](https://junit.org/) | 6.1.3 | jar | [Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
| org.junit.platform | [junit-platform-launcher](https://junit.org/) | 6.1.3 | jar | [Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
| org.junit.platform | [junit-platform-suite-api](https://junit.org/) | 6.1.3 | jar | [Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
| org.junit.platform | [junit-platform-suite-engine](https://junit.org/) | 6.1.3 | jar | [Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
| org.opentest4j | [opentest4j](https://github.com/ota4j-team/opentest4j) | 1.3.0 | jar | [The Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt) |

# Project Dependency Graph

## Dependency Tree

- com.cardatechnologies:aba.routing.transit.validator:jar:1.0.2 
  
  | ABA Validator |
  | --- |
  | **Description: **This validator will confirm if an ABA Routing Transit Number Validator is formatted correctly. This does not guarantee if it's valid, only that it has passed a small series of edits. **URL: **[http://cardatechnologies.com](http://cardatechnologies.com) **Project Licenses: **[Apache-2.0](https://www.apache.org/licenses/LICENSE-2.0.txt) |
  
    - org.junit.jupiter:junit-jupiter-engine:jar:6.1.3 (test) 
      
      | JUnit Jupiter Engine |
      | --- |
      | **Description: **Module "junit-jupiter-engine" of JUnit **URL: **[https://junit.org/](https://junit.org/) **Project Licenses: **[Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
      
          - org.junit.platform:junit-platform-engine:jar:6.1.3 (test) 
            
            | JUnit Platform Engine API |
            | --- |
            | **Description: **Module "junit-platform-engine" of JUnit **URL: **[https://junit.org/](https://junit.org/) **Project Licenses: **[Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
          - org.apiguardian:apiguardian-api:jar:1.1.2 (test) 
            
            | org.apiguardian:apiguardian-api |
            | --- |
            | **Description: **@API Guardian **URL: **[https://github.com/apiguardian-team/apiguardian](https://github.com/apiguardian-team/apiguardian) **Project Licenses: **[The Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt) |
          - org.jspecify:jspecify:jar:1.0.0 (test) 
            
            | JSpecify annotations |
            | --- |
            | **Description: **An artifact of well-named and well-specified annotations to power static analysis checks **URL: **[http://jspecify.org/](http://jspecify.org/) **Project Licenses: **[The Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt) |
    - org.junit.jupiter:junit-jupiter-api:jar:6.1.3 (test) 
      
      | JUnit Jupiter API |
      | --- |
      | **Description: **Module "junit-jupiter-api" of JUnit **URL: **[https://junit.org/](https://junit.org/) **Project Licenses: **[Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
      
          - org.opentest4j:opentest4j:jar:1.3.0 (test) 
            
            | org.opentest4j:opentest4j |
            | --- |
            | **Description: **Open Test Alliance for the JVM **URL: **[https://github.com/ota4j-team/opentest4j](https://github.com/ota4j-team/opentest4j) **Project Licenses: **[The Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt) |
          - org.junit.platform:junit-platform-commons:jar:6.1.3 (test) 
            
            | JUnit Platform Commons |
            | --- |
            | **Description: **Module "junit-platform-commons" of JUnit **URL: **[https://junit.org/](https://junit.org/) **Project Licenses: **[Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
    - org.junit.jupiter:junit-jupiter-params:jar:6.1.3 (test) 
      
      | JUnit Jupiter Params |
      | --- |
      | **Description: **Module "junit-jupiter-params" of JUnit **URL: **[https://junit.org/](https://junit.org/) **Project Licenses: **[Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
    - org.junit.platform:junit-platform-suite:jar:6.1.3 (test) 
      
      | JUnit Platform Suite (Aggregator) |
      | --- |
      | **Description: **Module "junit-platform-suite" of JUnit **URL: **[https://junit.org/](https://junit.org/) **Project Licenses: **[Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
      
          - org.junit.platform:junit-platform-suite-api:jar:6.1.3 (test) 
            
            | JUnit Platform Suite API |
            | --- |
            | **Description: **Module "junit-platform-suite-api" of JUnit **URL: **[https://junit.org/](https://junit.org/) **Project Licenses: **[Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
          - org.junit.platform:junit-platform-suite-engine:jar:6.1.3 (test) 
            
            | JUnit Platform Suite Engine |
            | --- |
            | **Description: **Module "junit-platform-suite-engine" of JUnit **URL: **[https://junit.org/](https://junit.org/) **Project Licenses: **[Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |
            
                  - org.junit.platform:junit-platform-launcher:jar:6.1.3 (test) 
                    
                    | JUnit Platform Launcher |
                    | --- |
                    | **Description: **Module "junit-platform-launcher" of JUnit **URL: **[https://junit.org/](https://junit.org/) **Project Licenses: **[Eclipse Public License v2.0](https://www.eclipse.org/legal/epl-v20.html) |

# Licenses

**The Apache License, Version 2.0: **JSpecify annotations, org.apiguardian:apiguardian-api, org.opentest4j:opentest4j

**Apache-2.0: **ABA Validator

**Eclipse Public License v2.0: **JUnit Jupiter API, JUnit Jupiter Engine, JUnit Jupiter Params, JUnit Platform Commons, JUnit Platform Engine API, JUnit Platform Launcher, JUnit Platform Suite (Aggregator), JUnit Platform Suite API, JUnit Platform Suite Engine

# Dependency File Details

| Total | Size | Entries | Classes | Packages | Java Version | Debug Information |
| --- | --- | --- | --- | --- | --- | --- |
| apiguardian-api-1.1.2.jar | 6.8 kB | 9 | 3 | 2 | 1.6 | Yes |
| jspecify-1.0.0.jar | 3.8 kB | 14 | - | - | - | - |
|    • Root | - | 10 | 4 | 1 | 1.8 | No |
|    • Versioned | - | 4 | 1 | 1 | 9 | No |
| junit-jupiter-api-6.1.3.jar | 312.6 kB | 273 | 256 | 10 | 17 | Yes |
| junit-jupiter-engine-6.1.3.jar | 352.6 kB | 188 | 171 | 9 | 17 | Yes |
| junit-jupiter-params-6.1.3.jar | 303.1 kB | 221 | 200 | 9 | 17 | Yes |
| junit-platform-commons-6.1.3.jar | 175.9 kB | 104 | 88 | 10 | 17 | Yes |
| junit-platform-engine-6.1.3.jar | 324.9 kB | 220 | 198 | 9 | 17 | Yes |
| junit-platform-launcher-6.1.3.jar | 252.7 kB | 169 | 153 | 8 | 17 | Yes |
| junit-platform-suite-6.1.3.jar | 6.4 kB | 5 | 1 | 1 | 17 | No |
| junit-platform-suite-api-6.1.3.jar | 25.9 kB | 41 | 32 | 2 | 17 | No |
| junit-platform-suite-engine-6.1.3.jar | 46 kB | 27 | 16 | 2 | 17 | Yes |
| opentest4j-1.3.0.jar | 14.3 kB | 15 | 9 | 2 | 1.6 | Yes |
| 12 | 1.8 MB | 1286 | 1131 | 65 | 17 | 9 |
| test: 12 | test: 1.8 MB | test: 1286 | test: 1131 | test: 65 | 17 | test: 9 |
