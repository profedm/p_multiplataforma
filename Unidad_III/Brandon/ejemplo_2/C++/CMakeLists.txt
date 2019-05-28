#Version minima requerida de Cmake
cmake_minimum_required(VERSION 2.8.9)

#Nombre del proyecto
project(calculator)

#Ubicacion de headers
include_directories(include)
set(LIBS "/home/edgarmg/Dropbox/Cinvestav/Clases/Linux/Presentaciones/Examenes/examen3/calculator/include/library.so")

#Lista de archivos fuente
add_executable(calculator
	       src/calculator.cpp)

target_link_libraries(calculator		      
		      ${LIBS})
