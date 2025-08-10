function solution(s) {
    let answer = '';
    let len = s.length;
    let middle = Math.floor(s.length/2);
    
    if(len % 2 ===1){
        console.log("if value = ", answer = s[middle])
        answer = s[middle]
    }else{
        //짝수
        answer = s.substring(middle -1 , middle + 1)
    }
    return answer 
}