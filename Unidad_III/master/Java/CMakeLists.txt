cmake_minimum_required (VERSION 2.8)

find_package(Java REQUIRED)
include(UseJava)

project (HelloClass)

set(CMAKE_JAVA_COMPILE_FLAGS "-source" "1.8" "-target" "1.8")

add_jar(HelloClass
        src/HelloClass.java
        include/HolaMundo.java
        MANIFEST "${CMAKE_CURRENT_SOURCE_DIR}/MANIFEST.MF")
