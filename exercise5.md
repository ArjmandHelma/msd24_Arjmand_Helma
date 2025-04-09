# Exercise 5: Logging

## Why are logging libraries used?
Logging libraries enable structured and centralized logging of information about the state and behavior of an application. They help with:

debugging

monitoring

analyzing user behavior

tracking processes (audit trail)

Without logging, it would be difficult to understand what’s going wrong inside a software system.


## What log levels exist in Log4j and what do they mean?

Log4j provides the following log levels (from most to least severe):

FATAL – Critical error, application will shut down

ERROR – Runtime errors that should be handled

WARN – Warnings that are not necessarily critical

INFO – General information about the program flow

DEBUG – Detailed debug information (e.g. method calls)

TRACE – Even more detailed traces (usually for deep analysis)

You can define the desired log level in the configuration file (e.g., level="debug").




## What configuration options does Log4j offer?

Log4j offers flexible configuration options:

Configuration via *XML, **JSON, *YAML, or properties files

Multiple appenders simultaneously (e.g., console & file)

Different layout formats (pattern, JSON, HTML, etc.)

Filters for log levels, classes, markers, and more

Rolling file logs (e.g., daily rotation)