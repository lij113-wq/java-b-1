//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int secound;
    int day;
    int hour;
    int minute;
    int result;

    System.out.print("원하는 시간을 초단위로 입력 : ");
    secound = keyboard.nextInt();

    minute = secound / 60;
    result = secound - (minute * 60);
    hour = minute / 60;
    minute= minute - (hour * 60);
    day = hour / 24;
    hour = hour - (day * 24);

    System.out.printf("\n%,d초는 %d일 %d시간 %d분 %d초\n", secound, day, hour, minute, result);
}
