---
date_published: 2026-11-08
date_modified: 2026-11-08
canonical_url: http://cardatechnologies.com/checkstyle.html
---

# Checkstyle Results

The following document contains the results of [Checkstyle](https://checkstyle.org/) 10.26.1 with /media/joker/DataVault/projects/github/aba.route.validator/src/test/resources/checkstyle/checkstyle.xml ruleset.

## Summary

| Files |  Info |  Warnings |  Errors |
| --- | --- | --- | --- |
| 3 | 0 | 0 | 5 |

## Files

| File |  I |  W |  E |
| --- | --- | --- | --- |
| [com/cardatechnologies/utils/validators/abaroutevalidator/AbaRouteValidator.java](#comcardatechnologiesutilsvalidatorsabaroutevalidatorabaroutevalidatorjava) | 0 | 0 | 5 |

## Rules

| Category | Rule | Violations | Severity |
| --- | --- | --- | --- |
| coding | [MagicNumber](https://checkstyle.org/checks/coding/magicnumber.html) - ignoreAnnotation: `"false"` - ignoreNumbers: `""` - tokens: `"NUM_DOUBLE, NUM_FLOAT, NUM_INT, NUM_LONG"` - ignoreFieldDeclaration: `"false"` - ignoreHashCodeMethod: `"false"` - ignoreAnnotationElementDefaults: `"false"` | 5 |  Error |

## Details

### com/cardatechnologies/utils/validators/abaroutevalidator/AbaRouteValidator.java

| Severity | Category | Rule | Message | Line |
| --- | --- | --- | --- | --- |
|  Error | coding | MagicNumber | '0' is a magic number. | 124 |
|  Error | coding | MagicNumber | '0' is a magic number. | 125 |
|  Error | coding | MagicNumber | '10' is a magic number. | 131 |
|  Error | coding | MagicNumber | '0' is a magic number. | 131 |
|  Error | coding | MagicNumber | '0' is a magic number. | 148 |
