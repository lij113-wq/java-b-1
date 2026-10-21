void main() {
        Scanner keyboard = new Scanner(System.in);
        int price;
        char grade;
        double discountRate, discountedPrice, extraDiscount, finalPrice;

        System.out.print("구입 가격 입력 : ");
        price = keyboard.nextInt();

        System.out.print("회원 등급을 입력(VIP, GOLD, SILVER, NONE) : ");
        grade = keyboard.next().charAt(0);

        discountRate = grade == 'V' ? 0.20 :
                grade == 'G' ? 0.15 :
                        grade == 'S' ? 0.10 : 0.0;

        String gradeName = grade == 'V' ? "VIP" :
                grade == 'G' ? "GOLD" :
                        grade == 'S' ? "SILVER" : "NONE";

        discountedPrice = price * (1 - discountRate);

        extraDiscount = discountedPrice >= 100000 ?
                discountedPrice * 0.05 : 0;

        finalPrice = discountedPrice - extraDiscount;

        System.out.printf("상품 가격: %,d원\n", price);
        System.out.printf("회원 등급: %s, 할인율: %.0f%%\n", gradeName, discountRate * 100);
        System.out.printf("회원 등급 할인 후 가격: %,d원\n", (int) discountedPrice);
        System.out.printf("추가 할인 금액: %,d원\n", (int) extraDiscount);
        System.out.printf("최종 결제 금액: %,d원\n", (int) finalPrice);

    }

