#!/bin/bash

cd ".."
for i in "$@"; do
    echo $i
    git clone $i
done

