function solution(array, height) {
    let result = 0;
    
    for(let i = 0; i <array.length; i ++){
        // i의 값은 정수
        
        if(array[i] > height){
            // array 배열의 i의 정수 값이 머쓱이 키보다는 커야함.
            result++;
        }
    }
    return result;
}