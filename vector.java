public class vector {
    int i;
    int j;
    int k;
    vector sum(vector a){
        vector c = new vector();
        c.i = this.i+a.i;
        c.j = this.j+a.j;
        c.k = this.k+a.k;
        return c;
    }
    vector sub(vector a){
        vector c = new vector();
        c.i = this.i-a.i;
        c.j = this.j-a.j;
        c.k = this.k-a.k;
        return c;
    }
    vector product(vector a){
        vector c = new vector();
        c.i = this.i*a.i;
        c.j = this.j*a.j;
        c.k = this.k*a.k;
        return c;
    }
}
