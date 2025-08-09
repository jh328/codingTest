function solution(arr) {
    let sum =  arr.reduce((acc, el, ) => acc + el , 0 );
    return sum / arr.length;
}