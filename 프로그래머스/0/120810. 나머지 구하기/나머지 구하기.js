function solution(num1, num2) {
    if((num1 %  num2) === 1){
        return 1;
    }else if((num1 % num2) === 0){
        return 0;
    }else {
        return num1 % num2;
    }
}   