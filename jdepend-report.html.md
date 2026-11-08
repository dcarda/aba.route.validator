---
date_published: 2026-11-08
date_modified: 2026-11-08
canonical_url: http://cardatechnologies.com/jdepend-report.html
---

# Metric Results

[ [summary](#summary) ] [ [packages](#packages) ] [ [cycles](#cycles) ] [ [explanations](#explanation) ]   
  
The following document contains the results of a JDepend metric analysis. The various metrics are defined at the bottom of this document.  
  

# Summary

[ [summary](#summary) ] [ [packages](#packages) ] [ [cycles](#cycles) ] [ [explanations](#explanation) ]   
  
Summary Package TC CC AC Ca Ce A I D V [com.cardatechnologies.utils.validators.abaroutevalidator](#comcardatechnologiesutilsvalidatorsabaroutevalidator) 1 1 0 1 2 0.0% 67.0% 33.0% 1 [com.cardatechnologies.utils.validators.abaroutevalidator.exceptions](#comcardatechnologiesutilsvalidatorsabaroutevalidatorexceptions) 1 1 0 1 3 0.0% 75.0% 25.0% 1 

# Packages

[ [summary](#summary) ] [ [packages](#packages) ] [ [cycles](#cycles) ] [ [explanations](#explanation) ]   

## com.cardatechnologies.utils.validators.abaroutevalidator

Packages Afferent Couplings Efferent Couplings Abstractness Instability Distance 1 2 0.0% 67.0% 33.0% Packages Abstract Classes Concrete Classes Used by Packages Uses Packages *None* com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator  
com.cardatechnologies.utils.validators.abaroutevalidator.exceptions  
com.cardatechnologies.utils.validators.abaroutevalidator.exceptions  
java.lang  

## com.cardatechnologies.utils.validators.abaroutevalidator.exceptions

Packages Afferent Couplings Efferent Couplings Abstractness Instability Distance 1 3 0.0% 75.0% 25.0% Packages Abstract Classes Concrete Classes Used by Packages Uses Packages *None* com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException  
com.cardatechnologies.utils.validators.abaroutevalidator  
com.cardatechnologies.utils.validators.abaroutevalidator  
java.lang  
java.util  

# Cycles

[ [summary](#summary) ] [ [packages](#packages) ] [ [cycles](#cycles) ] [ [explanations](#explanation) ]   
  
Cycles Package Package Dependencies com.cardatechnologies.utils.validators.abaroutevalidator com.cardatechnologies.utils.validators.abaroutevalidator.exceptions  
com.cardatechnologies.utils.validators.abaroutevalidator  
com.cardatechnologies.utils.validators.abaroutevalidator.exceptions com.cardatechnologies.utils.validators.abaroutevalidator  
com.cardatechnologies.utils.validators.abaroutevalidator.exceptions  

# Explanation

[ [summary](#summary) ] [ [packages](#packages) ] [ [cycles](#cycles) ] [ [explanations](#explanation) ]   
  
The following explanations are for quick reference and are lifted directly from the original JDepend documentation.  
  
Explanation Term Description Number of Classes The number of concrete and abstract classes (and interfaces) in the package is an indicator of the extensibility of the package. Afferent Couplings The number of other packages that depend upon classes within the package is an indicator of the package's responsibility. Efferent Couplings The number of other packages that the classes in the package depend upon is an indicator of the package's independence. Abstractness The ratio of the number of abstract classes (and interfaces) in the analyzed package to the total number of classes in the analyzed package. The range for this metric is 0 to 1, with A=0 indicating a completely concrete package and A=1 indicating a completely abstract package. Instability The ratio of efferent coupling (Ce) to total coupling (Ce / (Ce + Ca)). This metric is an indicator of the package's resilience to change. The range for this metric is 0 to 1, with I=0 indicating a completely stable package and I=1 indicating a completely instable package. Distance The perpendicular distance of a package from the idealized line A + I = 1. This metric is an indicator of the package's balance between abstractness and stability. A package squarely on the main sequence is optimally balanced with respect to its abstractness and stability. Ideal packages are either completely abstract and stable (x=0, y=1) or completely concrete and instable (x=1, y=0). The range for this metric is 0 to 1, with D=0 indicating a package that is coincident with the main sequence and D=1 indicating a package that is as far from the main sequence as possible. Cycles Packages participating in a package dependency cycle are in a deadly embrace with respect to reusability and their release cycle. Package dependency cycles can be easily identified by reviewing the textual reports of dependency cycles. Once these dependency cycles have been identified with JDepend, they can be broken by employing various object-oriented techniques.
