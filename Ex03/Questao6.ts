function main() {

    exibir("Eu sou lindo", "demais")


}

function exibir(...coisas: Array<string>): void {
    for (var coisa of coisas) {
        console.log(coisa)
    }
}


main();