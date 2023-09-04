function questao9(): void {
    let array: number[] = [1, 2, 3, 4, 5];
    array = array.map((num) => num * 2);
    const soma_total = array.reduce((previous, current) => previous += current)

    console.log(soma_total)

}