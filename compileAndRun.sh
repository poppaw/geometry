#!/bin/bash
find src/main -name '*.java' > sources.txt
mkdir -p out/production
javac @sources.txt -d out/production && java -cp out/production:resources com.codecool.java.geometry.Main
