function solution(n) {
    let strN = n.toString();
    let splitN = strN.split('');
    let numN = splitN.map(Number);
    let result = numN.reduce((sum, digit) => sum + digit,0);
    return result
}