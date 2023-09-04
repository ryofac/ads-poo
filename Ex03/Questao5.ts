function main(): void {
    console.log(soma(1, 2)) // 3
    console.log(soma(1, '2')) // Erro de tipagem: "2" não é um number
    console.log(soma(1)) // Argumentos insuficientes

}

function soma(a: number, b: number) {
    return a + b;
}

main();