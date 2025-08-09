function solution(n){
    let answer = 0;
    const strn = String(n);
    for(let i = 0; i<strn.length; i++){
        answer += Number(strn[i]);
    }
    return answer
}