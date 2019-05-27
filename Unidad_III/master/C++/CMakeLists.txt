#Version minima requerida de Cmake
cmake_minimum_required(VERSION 2.8.9)

#Nombre del proyecto
project(hello_world)

#Usar C++ 11
add_compile_options(-std=c++11)

#Ubicacion de headers
include_directories(include)

#Lista de archivos fuente
add_executable(hello_world
               src/HelloClass.cpp
	       include/HolaMundo.cpp)
