---
date_published: 2026-11-23
date_modified: 2026-11-23
canonical_url: https://danielcarda.net/checkstyle.html
---

# Checkstyle Results

The following document contains the results of [Checkstyle](https://checkstyle.org/) 10.26.1 with /media/joker/DataVault/projects/github/aba.route.validator/src/test/resources/checkstyle/checkstyle-combined.xml ruleset.

## Summary

| Files |  Info |  Warnings |  Errors |
| --- | --- | --- | --- |
| 6 | 0 | 0 | 27 |

## Files

| File |  I |  W |  E |
| --- | --- | --- | --- |
| [README.md](#readmemd) | 0 | 0 | 18 |
| [net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.java](#netdanielcardautilsvalidatorsabaroutevalidatorabaroutevalidatorjava) | 0 | 0 | 5 |
| [release.properties](#releaseproperties) | 0 | 0 | 4 |

## Rules

| Category | Rule | Violations | Severity |
| --- | --- | --- | --- |
| coding | [MagicNumber](https://checkstyle.org/checks/coding/magicnumber.html) - ignoreAnnotation: `"false"` - ignoreNumbers: `""` - tokens: `"NUM_DOUBLE, NUM_FLOAT, NUM_INT, NUM_LONG"` - ignoreFieldDeclaration: `"false"` - ignoreHashCodeMethod: `"false"` - ignoreAnnotationElementDefaults: `"false"` | 5 |  Error |
| regexp | [RegexpSingleline](https://checkstyle.org/checks/regexp/regexpsingleline.html) - format: `"\s+$"` - message: `"Line has trailing spaces."` | 4 |  Error |
| sizes | [LineLength](https://checkstyle.org/checks/sizes/linelength.html) - max: `"120"` | 18 |  Error |

## Details

### README.md

| Severity | Category | Rule | Message | Line |
| --- | --- | --- | --- | --- |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 152). | [4](./xref/README.md#L4) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 129). | [15](./xref/README.md#L15) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 164). | [47](./xref/README.md#L47) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 140). | [49](./xref/README.md#L49) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 287). | [78](./xref/README.md#L78) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 287). | [79](./xref/README.md#L79) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 287). | [80](./xref/README.md#L80) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 287). | [81](./xref/README.md#L81) |
|  Error | regexp | RegexpSingleline | Line has trailing spaces. | [104](./xref/README.md#L104) |
|  Error | regexp | RegexpSingleline | Line has trailing spaces. | [108](./xref/README.md#L108) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 129). | [189](./xref/README.md#L189) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 154). | [282](./xref/README.md#L282) |
|  Error | regexp | RegexpSingleline | Line has trailing spaces. | [293](./xref/README.md#L293) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [297](./xref/README.md#L297) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [298](./xref/README.md#L298) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [299](./xref/README.md#L299) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [300](./xref/README.md#L300) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [301](./xref/README.md#L301) |

### net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.java

| Severity | Category | Rule | Message | Line |
| --- | --- | --- | --- | --- |
|  Error | coding | MagicNumber | '0' is a magic number. | [124](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L124) |
|  Error | coding | MagicNumber | '0' is a magic number. | [125](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L125) |
|  Error | coding | MagicNumber | '10' is a magic number. | [131](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L131) |
|  Error | coding | MagicNumber | '0' is a magic number. | [131](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L131) |
|  Error | coding | MagicNumber | '0' is a magic number. | [148](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L148) |

### release.properties

| Severity | Category | Rule | Message | Line |
| --- | --- | --- | --- | --- |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 135). | [12](./xref/release.properties#L12) |
|  Error | regexp | RegexpSingleline | Line has trailing spaces. | [15](./xref/release.properties#L15) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 121). | [21](./xref/release.properties#L21) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 126). | [25](./xref/release.properties#L25) |
