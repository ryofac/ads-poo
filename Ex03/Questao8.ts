function main() {
    const array: number[] = new Array(15);

    for (let i = 0; i < array.length; i++) {
        array[i] = i + 1
    }

    const novo_array = array.filter(item => item % 2 == 0);

    console.log(novo_array)

}

main()
