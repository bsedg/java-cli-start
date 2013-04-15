# java-cli-start
==============

Starter code base for a Java command line interface application.  Includes a jar library of Apache Commons CLI.

## Changing for own use

To modify source code for own use, follow these few steps:

 * Add own package structure in src/ in place of PACKAGE_NAME directory
 * Change name of PACKAGE_NAME.Main to own project's name
 * Modify PROJECT_NAME and PACKAGE_NAME within build.xml 

## Building

Within the root directory, the build.xml file is an ant build file.  

Create jar file for running application:

       ant jar 

Jar file will be located in dist/.

Remove created files from dist/ and build/:

       ant clean

### Git

Clone the latest code from git:

      git clone git://github.com/bsedg/java-cli-start.git