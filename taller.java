import java.lang.Math;
public class taller {
    public static void main(String[] args) {
       int yay = (int)(Math.random()*20);
       int[] carrito = new int[yay];
       int[]hola=Llenar(carrito);
       mostrar(hola);
       detalles(hola);
    }
    public static int[] Llenar (int[]n){
        for (int i=0; i<n.length;i++){
            n[i]=(int)(Math.random()*16);
        }
        return (n);
    }
    public static void mostrar (int[]n){
        int c=0;
        for (int i=0; i<n.length;i++){
            c=c+n[i];
        }
        System.out.println("el carrito tiene "+c+" productos");
    }
    public static int total (int[]n){
        int c=500;
        int t=0;
        for (int i=0;i<n.length;i++){
            c+=i*150;
            t+=c*n[i];
        }
    return t;
}
    public static void detalles (int[]n){
        int t =total(n);
        int c =500;
        int a=0;
        for (int i=0;i<n.length;i++){
            c+=i*150;
            a=c*n[i];
            System.out.println("cantidad de producto en ["+i+"] = "+n[i]+" para un subtotal de "+a+"$");
        }
        System.out.println("el total de la compra es: "+t+" $");
}
}
