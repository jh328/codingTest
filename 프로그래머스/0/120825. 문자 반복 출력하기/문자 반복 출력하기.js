function solution(my_string, n) {
    let count = ''
    for(let i = 0; i<my_string.length; i++){
        count += my_string[i].repeat(n)
    }
    return count;
}