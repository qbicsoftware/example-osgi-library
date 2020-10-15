# example-osgi-library

This project contains the source code for an example library that can be deployed as an OSGi bundle.

Mainly this library can be used as proof-of-concept for working dependencies in an OSGi environment
when it is deployed as a dependency of our [example-osgi-portlet](https://github.com/qbicsoftware/example-osgi-portlet).

## How to install/deploy
* First clone the project locally:

`git clone https://github.com/qbicsoftware/example-osgi-library`

* Build the project:

`cd example-osgi-library`

`mvn clean install`

* Deploy the generated JAR in the OSGi framework
  * **Liferay 7**: Just copy the generated JAR in the *deploy* directory which is located 
  in the root directory of your Liferay instance.
  
## Author
Created by Jannis Hochmuth 
([Jannis.Hochmuth@computational.bio.uni-giessen.de](mailto:Jannis.Hochmuth@computational.bio.uni-giessen.de))