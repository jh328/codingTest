function solution(myString, pat) {
    
    let converted = '';
    
    for (let char of myString){
        if(char === 'A') converted += 'B';
        else if(char === 'B') converted +='A'
    }
    return converted.includes(pat) ? 1 : 0;
}