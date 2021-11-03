```
16:29 $ ./gradlew clean test
:clearReports
:clean
:compileJava
:processResources
:classes
:compileTestJava
:processTestResources NO-SOURCE
:testClasses
:test

org.example.DummyTest STANDARD_OUT
16:29:50,083 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
16:29:50,084 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
16:29:50,084 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/opt/data/dummyJunitSerenity/build/resources/main/logback.xml]
16:29:50,192 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
16:29:50,195 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
16:29:50,200 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [STDOUT]
16:29:50,249 |-WARN in ch.qos.logback.core.ConsoleAppender[STDOUT] - This appender no longer admits a layout as a sub-component, set an encoder instead.
16:29:50,249 |-WARN in ch.qos.logback.core.ConsoleAppender[STDOUT] - To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.
16:29:50,249 |-WARN in ch.qos.logback.core.ConsoleAppender[STDOUT] - See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details
16:29:50,249 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [org.example] to INFO
16:29:50,249 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to ERROR
16:29:50,250 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [STDOUT] to Logger[ROOT]
16:29:50,250 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
16:29:50,250 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@330ab4f4 - Registering current configuration as safe fallback point


org.example.DummyTest > aTest[78] FAILED
java.util.EmptyStackException
at java.util.Stack.peek(Stack.java:102)
at java.util.Stack.pop(Stack.java:84)
at net.thucydides.core.logging.ConsoleLoggingListener.stepOut(ConsoleLoggingListener.java:307)
at net.thucydides.core.logging.ConsoleLoggingListener.stepFinished(ConsoleLoggingListener.java:293)
at net.thucydides.core.steps.StepEventBus.stepFinished(StepEventBus.java:407)
at net.thucydides.core.steps.StepInterceptor.notifyStepFinishedFor(StepInterceptor.java:503)
at net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:473)
at net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:445)
at net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:201)
at net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:188)
at net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:76)
at net.thucydides.core.steps.ProxyConfiguration$InterceptorDispatcher.intercept(ProxyConfiguration.java:51)
at org.example.DummySteps$ByteBuddy$QloxaA3O.assertSmthElse(Unknown Source)
at org.example.DummyTest.aTest(DummyTest.java:43)

org.example.DummyTest STANDARD_OUT
16:29:54.676 [DummyTest-1-thread-12] ERROR  -
__  _____ _____ ____ _____   _____ ____  ____   ___  ____  
_      / / |_   _| ____/ ___|_   _| | ____|  _ \|  _ \ / _ \|  _ \
(_)____| |    | | |  _| \___ \ | |   |  _| | |_) | |_) | | | | |_) |
|_____| |    | | | |___ ___) || |   | |___|  _ <|  _ <| |_| |  _ <
(_)    | |    |_| |_____|____/ |_|   |_____|_| \_\_| \_\\___/|_| \_\
\_\

    A test
    ---------------------------------------------------------------------
    16:29:54.680 [DummyTest-1-thread-12] ERROR  -     

100 tests completed, 1 failed
:test FAILED

FAILURE: Build failed with an exception.

* What went wrong:
  Execution failed for task ':test'.
> There were failing tests. See the report at: file:///opt/data/dummyJunitSerenity/build/reports/tests/test/index.html

* Try:
  Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 5.0.
See https://docs.gradle.org/4.6/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 13s
6 actionable tasks: 6 executed
```