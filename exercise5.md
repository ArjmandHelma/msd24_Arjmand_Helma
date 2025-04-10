## Why are logging libraries used?
Logging libraries enable structured and centralized logging of information about the state and behavior of an application. They help with:

debugging

monitoring

analyzing user behavior

tracking processes (audit trail)



## What log levels exist in Log4j and what do they mean?
Log4j offers the following log levels (from most to least severe):

FATAL – Critical error, the application will be terminated

ERROR – Runtime errors that should be addressed

WARN – Warnings that are not necessarily critical

INFO – General information about the application's flow

DEBUG – Detailed debug information (e.g., method calls)

TRACE – Even more detailed traces (usually for in-depth analysis)

## What configuration options does Log4j offer?

log4j provides flexible configuration options:

Configuration via XML, JSON, YAML, or Properties files

Multiple Appenders at the same time (e.g., console & file)

Various Layout formats (Pattern, JSON, HTML, etc.)

Filters for log levels, classes, markers, and more



