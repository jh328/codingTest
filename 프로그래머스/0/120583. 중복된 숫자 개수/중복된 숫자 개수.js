// 배열안에 중복된 값이 몇개인지 알면 됨.
// 빈 배열 만들고,
// 중복된 값이 몇개인지를 나타날 변수를 만들면 됨.

function solution(array, n) {
    let count = 0;
    
    for(let i = 0; i < array.length; i++){
        if(array[i] === n){
            count++;
        }
        
    }
    return count
}