void main() {
    Scanner keyboard = new Scanner(System.in);
    final int heart = 65;
    int age;

    System.out.print("당신은 몇년동안 살았나요 ?");
    age = keyboard.nextInt();



    int day = age * 365;
    int hour = day * 24;
    int minute = hour * 60;
    long count = (long) (minute) * heart;

    System.out.printf("사람은 펼군 분강 %d회 심장이 박동한다.\n", heart);
    System.out.printf("심장은 %d년 동안 %,d회  박동합니다\n", age, count);
}
