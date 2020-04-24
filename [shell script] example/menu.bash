#!/bin/bash

function addition {
    clear
    read x1 x2
    SUM=$((x1 + x2))
    echo $SUM
}

function multiplication {
    clear
    read x1 x2
    MULTI=$((x1 * x2))
    echo $MULTI
}


function menu {
    clear
    echo
    echo -e "\t\t\tSimple Calculator\n"
    echo -e "\t1. Addition"
    echo -e "\t2. Multiplication"
    echo -e "\t0. Exit Program\n\n"
    echo -en "\t\tEnter option:"
    read -n 1 option
}

while [ 1 ]
do
    menu
    case $option in
	0)
	    break ;;
	1)
	    addition ;;
	2)
	    multiplication ;;
	*)
	    clear
	    echo "Wrong selection";;
    esac
    echo -en "Hit any key to continue"
    read -n 1 line
done
clear
