#!/bin/sh

echo `pwd`

for dir in ./*; do
    cd $dir
    if (./mvnw test > /dev/null); then
      echo "$dir OK";
    else
      echo "$dir FAILED";
    fi
    cd ..
done