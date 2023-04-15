#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int i=0;
    while(i<=n){
      if(i%2==0){answer=i+answer;}
           i++;}
    return answer;
}