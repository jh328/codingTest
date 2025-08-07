// sides 매개변수는 배열값
// 배열안에 있는 인덱스를 꺼내서, 제일 큰 정수와, 나머지 두개의 정수를 합쳤을 때, 
// big > sum = 2;
// big < sum = 1;
// let sides = [1,2,3]
function solution(sides) {
    let maxNum = Math.max.apply(null,sides)
    let totalNum = sides[0] + sides[1] + sides[2];
    let result = totalNum - maxNum;
    //     3(271)        6(493)     (222)     3 
    if(maxNum <result){
        return 1;
    }else{
        return 2;
    }
}