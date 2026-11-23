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
| 5 | 0 | 0 | 23 |

## Files

| File |  I |  W |  E |
| --- | --- | --- | --- |
| [README.md](#readmemd) | 0 | 0 | 18 |
| [net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.java](#netdanielcardautilsvalidatorsabaroutevalidatorabaroutevalidatorjava) | 0 | 0 | 5 |

## Rules

| Category | Rule | Violations | Severity |
| --- | --- | --- | --- |
| coding | [MagicNumber](https://checkstyle.org/checks/coding/magicnumber.html) - ignoreAnnotation: `"false"` - ignoreNumbers: `""` - tokens: `"NUM_DOUBLE, NUM_FLOAT, NUM_INT, NUM_LONG"` - ignoreFieldDeclaration: `"false"` - ignoreHashCodeMethod: `"false"` - ignoreAnnotationElementDefaults: `"false"` | 5 |  Error |
| regexp | [RegexpSingleline](https://checkstyle.org/checks/regexp/regexpsingleline.html) - format: `"\s+$"` - message: `"Line has trailing spaces."` | 3 |  Error |
| sizes | [LineLength](https://checkstyle.org/checks/sizes/linelength.html) - max: `"120"` | 15 |  Error |

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
|  Error | regexp | RegexpSingleline | Line has trailing spaces. | [127](./xref/README.md#L127) |
|  Error | regexp | RegexpSingleline | Line has trailing spaces. | [131](./xref/README.md#L131) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 129). | [212](./xref/README.md#L212) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 154). | [305](./xref/README.md#L305) |
|  Error | regexp | RegexpSingleline | Line has trailing spaces. | [316](./xref/README.md#L316) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [320](./xref/README.md#L320) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [321](./xref/README.md#L321) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [322](./xref/README.md#L322) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [323](./xref/README.md#L323) |
|  Error | sizes | LineLength | Line is longer than 120 characters (found 205). | [324](./xref/README.md#L324) |

### net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.java

| Severity | Category | Rule | Message | Line |
| --- | --- | --- | --- | --- |
|  Error | coding | MagicNumber | '0' is a magic number. | [125](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L125) |
|  Error | coding | MagicNumber | '0' is a magic number. | [126](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L126) |
|  Error | coding | MagicNumber | '10' is a magic number. | [132](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L132) |
|  Error | coding | MagicNumber | '0' is a magic number. | [132](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L132) |
|  Error | coding | MagicNumber | '0' is a magic number. | [149](./xref/net/danielcarda/utils/validators/abaroutevalidator/AbaRouteValidator.html#L149) |
