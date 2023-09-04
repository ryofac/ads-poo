function modulo(a: number): number {
    if (a < 0)
        return -1 * a;
    else
        return a;


}


class Triangulo {
    a: number;
    b: number;
    c: number;
    constructor(l1: number, l2: number, l3: number) {
        this.a = l1;
        this.b = l2;
        this.c = l3;
    }
    ehTriangulo(): boolean {
        return (modulo(this.b - this.c) < this.a)
            && (this.a < this.b + this.c);
    }
    ehIsoceles(): boolean {
        if (!this.ehTriangulo())
            return false;
        if (this.ehEquilatero() || this.ehEscaleto())
            return false;
        return true;
    }
    ehEquilatero(): boolean {
        if (!this.ehTriangulo())
            return false;
        if (this.a == this.b && this.b == this.c)
            return true;
        return false;
    }
    ehEscaleto(): boolean {
        if (!this.ehTriangulo())
            return false;
        if (this.a != this.b && this.b != this.c && this.a != this.c) {
            return true;
        } return false;
    }
}
