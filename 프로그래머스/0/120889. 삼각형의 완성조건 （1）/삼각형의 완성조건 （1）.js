function solution(sides) {
    let copySides = [...sides].sort((a,b) => a-b);
    return copySides[0] + copySides[1] > copySides[2] ? 1 : 2
}