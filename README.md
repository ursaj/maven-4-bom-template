# Maven 4 BOM Template

Template/example for multi-module Maven 4 projects that use and provide a bill of materials to manage project dependencies.

## Structure

    root
    ├── pom.xml
    ├── bom
    │   └── pom.xml
    └── parent
        └── pom.xml
    ┌───────┘
    ├── module1
    │   ├── pom.xml
    │   └── src
    └── module2
        ├── pom.xml
        └── src


The structure is simple:

* Root module describes plugins management, distribution and high-level/project-wide properties.
* BOM module provides a bill of materials used in dependency management by your API consumers.
* Parent module describes sub-modules (sub-projects) and provides dependency management for your implementation(s).


### Why bother

Why to use a BOM should be obvious. The approach described on the [Introduction to dependency mechanism](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html) is fine if you (or your organization) don't use a "super" parent pom.

The setup I use is meant to provide a solution that works with plugins used for version manipulation and allows the use of a parent on the top-level pom.

### CI-friendly releases

There are two ways to release new version of your project. Simple one without changes in `pom.xml`:

    ./mvnw deploy -Drevision=1.0.1-SNAPSHOT

or more complex one with the help of the [versions-maven-plugin](https://github.com/mojohaus/versions-maven-plugin):

    ./mvnw versions:set-property -DnewVersion=1.0.1-SNAPSHOT -Dproperty=revision -DgenerateBackupPoms=false -N
    ./mvnw deploy
