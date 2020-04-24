//xswap1.cpp
//This program is intended to perform a swap operation
// of the values of two variables by calling a function "swap"
//Standard C program: use pointers

#include <stdio.h>
#include <stdlib.h>

//function prototpe for swap
void swap(int *, int *);

main(){
    int a=3;
    int b=5;
	//print a nd b
    printf("Before calling swap: \n");
    printf("a = %d \t b =%d\n", a, b);
    //call swap to interchange the values of a and b
    swap(&a, &b);
    //print a and b again after calling swap
    printf("After calling swap: \n");
    printf("a = %d \t b =%d\n", a, b);
            
    system("pause");
}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
void swap(int *a, int *b){
     int temp;
     temp = *a;
     *a = *b;
     *b = temp;
     return;
}
