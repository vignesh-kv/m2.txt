class patteern{
public static void main(String args[]){
int n=5;
for(int i=0;i<5;i++){
for(int s=0;s<n-i-1;s++){
System.out.print(" ");
for(int j=0;j<2*i+1;j++){
System.out.print("*  ");
}
System.out.println();
}
}
