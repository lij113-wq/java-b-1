void main() {
    Scanner keyboard = new Scanner(System.in);
    int width;
    int height;
    char type;
    int area;


    System.out.print("사각형의 가로 길이 입력(예 5) :");
    width = keyboard.nextInt();
    System.out.print("사각형의 세로 길이 입력(예 5) :");
    height= keyboard.nextInt();

    type = (width == height) ? '정' : '직';
    area = width * height;

    System.out.printf("정사각형 넓이\n", type);
    System.out.printf("\t\t가로 길이:3Cm\n", width);
    System.out.printf("\t\t세로 길이 3 Cm\n", height);
    System.out.printf("\t\t넓이  : %,d \u33a0\n", area);
}
