//MUHAMMAD TAUFIQ BIN JURIMI A21EC0095
//All answer is compiled in the code

/*Q1 a,b
    Row 01
    A

    Row 11
    M

    Row 21
    Z
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        //Q1 code:
         /* System.out.println("Q1 - ");
        char[][] table = { { 'A', 'B', 'C', 'D' }, { 'M', 'M' }, { 'Z', 'Y', 'X' } };

        for (int row = 0; row < table.length; row++) {
            System.out.println("Row " + row+1);
            System.out.print(table[row][0]);
            System.out.println();
        } */  

         
        //Q2 answer: Index 3 out of bounds for length 3 (Excessive rows)
        /* 
         int [][] number = new int[3][2];
        number[0] = new int[2];
        number[1] = new int[5];
        number[2] = new int[4];
        number[3] = new int[3];
        System.out.print("Table Length " + number.length+" ");
        System.out.println("Row length " + number[1].length);   
        */
        
        
        //Q4
        Invoice[] purchase = new Invoice[3];
        purchase[0] = new Invoice("Hammer", 0, 14.9);
        purchase[1] = new Invoice("Paint Brush", 0, 15.23);
        purchase[2] = new Invoice("Mini Broom", 0, 10.0);

        for (Invoice obj : purchase) {
            System.out.println(obj.getDesc() + " - RM " + obj.getPrice());
        }
    }
}
