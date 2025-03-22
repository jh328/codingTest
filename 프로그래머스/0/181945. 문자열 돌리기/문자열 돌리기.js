const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


rl.on('line', function (str) {
    for(let char of str){
        console.log(char);
    }
    rl.close();
})