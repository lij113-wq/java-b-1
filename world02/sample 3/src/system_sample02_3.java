void main() {
    Scanner keyboard = new Scanner(System.in);
    const double PI =3.141592
    int radius;
    double area;

    System.out.print("원의 반지름 입력 (정수형) ? ");
    radius = keyboard.nextInt();

    area = 3.141592 * radius;

    System.out.printf("원의 반지름 : %, d Cm, 면적 : %,2f \u33ab\n", radius, area);
}
